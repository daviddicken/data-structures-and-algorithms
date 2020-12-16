'Vehicle loan Calculator
'Desc: A program to calculate the intrest and principle paid depending on APR
'Author: David Dicken
'Last modified 10/30/15
Public Class Form1
    'class level constants
    Const months_year As Double = 12 'months per year
    Const new_rate As Double = 0.05  'interest rate for new cars
    Const used_rate As Double = 0.08 'interest rate for used cars
    'class variable to hold the annual interest rate
    Dim annualrate As Double = new_rate

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        Dim vehicleCost As Double    'vehicle cost
        Dim downPayment As Double    'down payment
        Dim months As Integer        '# of months on loan
        Dim loan As Double           'amount of loan
        Dim monthlyPayment As Double 'monthly payment
        Dim interest As Double       'interest paid for a period
        Dim principal As Double      'principal paid for a period
        Dim count As Integer         'counter for loop
        Dim out As String            'used to hold a line of output
        Dim inputOk As Boolean = True

        'get the vehicle cost, validating at the same time
        If Not Double.TryParse(txtCost.Text, vehicleCost) Then
            lblMessage.Text = "Vehicle cost must be a number"
            inputOk = False
        End If
        'get the downpayment, validating at the same time
        If Not Double.TryParse(txtDownPayment.Text, downPayment) Then
            lblMessage.Text = "Down payment must be a number"
            inputOk = False
        End If
        'get the number of months, validating at the same time
        If Not Integer.TryParse(txtMonths.Text, months) Then
            lblMessage.Text = "Vehicle cost must be a number"
            inputOk = False
        End If
        'calculate the loan amount and monthly payment
        If inputOk = True Then
            loan = vehicleCost - downPayment
            monthlyPayment = Pmt(annualrate / months_year, months, -loan)
        'clear the list box and message label
        lstOutput.Items.Clear()
        lblMessage.Text = String.Empty
        'calculate the interest for this period
        For count = 1 To months
            interest = IPmt(annualrate / months_year, count, months, -loan)
        'calculate the principal for this period
            principal = PPmt(annualrate / months_year, count, months, -loan)
            'strart building the output string with the month
            out = "month " & count.ToString("d2")
            'add payment amount to output string
            out &= ": payment = " & monthlyPayment.ToString("n2")
            'add interest amount to string
            out &= ", interest = " & interest.ToString("n2")
            'add the principal for the period
            out &= ", principal = " & principal.ToString("n2")
            'add the output of string to the list box
            lstOutput.Items.Add(out)
            Next
        End If
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'reset the interest rate, clear the text box, list box, and message label.
        'set default interest rate for new car loans
        radNew.Checked = True
        annualrate = new_rate
        lblAnnualRate.Text = new_rate.ToString("p")
        txtCost.Clear()
        txtDownPayment.Clear()
        txtMonths.Clear()
        lstOutput.Items.Clear()
        lblMessage.Text = String.Empty
        'reset the focus to txtcost
        txtCost.Focus()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'close form
        Me.Close()
    End Sub

    Private Sub radNew_CheckedChanged(sender As Object, e As EventArgs) Handles radNew.CheckedChanged
        'if the new radio button is checked then the user has selected a new car loan
        If radNew.Checked = True Then
            annualrate = new_rate
            lblAnnualRate.Text = new_rate.ToString("p")
            lstOutput.Items.Clear()
        End If

    End Sub

    Private Sub radUsed_CheckedChanged(sender As Object, e As EventArgs) Handles radUsed.CheckedChanged
        'if used radio button is checked then user has selected a used car loan
        If radUsed.Checked = True Then
            annualrate = used_rate
            lblAnnualRate.Text = used_rate.ToString("p")
            lstOutput.Items.Clear()
        End If
    End Sub
End Class
