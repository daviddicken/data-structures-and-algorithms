'Project: Bloody Mary Maker
'Descrption: A form with multiple check boxes and radio buttons 
'to allow a user to build an order for a custom Bloody Mary

'Authors: 
'David Dicken
'Jake Nannery
'Evan Dukes
'Michael Nardozzi
'Last edited on 10/20/15

Public Class frmMary
    Private Sub frmMary_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'Plays Cheers theme song when app is opened
        My.Computer.Audio.Play(My.Resources.Cheers, AudioPlayMode.Background)
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnMix.Click
        'Set variables to be used in order summary string
        Dim beans As String = "-"
        Dim lemon As String = "-"
        Dim pickle As String = "-"
        Dim prawns As String = "-"
        Dim olives As String = "-"
        Dim bacon As String = "-"
        Dim onions As String = "-"
        Dim jalapenos As String = "-"
        Dim celery As String = "-"
        Dim lime As String = "-"
        Dim asparagus As String = "-"
        Dim peperoni As String = "-"
        Dim ice As String
        Dim burger As String
        Dim glass As String
        Dim shots As String
        Dim base As String
        Dim liquor As String
        Dim spice As String
        Dim rim As String
        'Set variables to calculate Taxes and totals
        Dim tip As Double
        Dim grandTotal As Double
        Dim total As Double = 6.0
        Dim taxRate As Double = 0.095
        Dim tax As Double

        'Sends selected glass size to "glass" variable
        If rdoS8oz.Checked Then
            glass = "8oz"
        ElseIf rdoS16oz.Checked Then
            glass = "16oz"
        ElseIf rdoS22oz.Checked Then
            glass = "22oz"
        End If
        'Sends selected ice choice to "ice" variable
        If rdoYes.Checked Then
            ice = "On the Rocks"
        Else
            ice = "No Ice"
        End If
        'Sends selected base to "base" variable
        If rdoTom.Checked Then
            base = "Tomato Base"
        Else
            base = "Clamato Base"
        End If
        'Sends selected amount of shots to "shots" variable and adds proper amount to "total" variable if nessasary
        If rdoSingle.Checked Then
            shots = "Single shot of"
        ElseIf rdoDouble.Checked Then
            total += 2
            shots = "Double shot of"
        ElseIf rdoTriple.Checked Then
            total += 9
            shots = "Triple shot of"
        ElseIf rdoNone.Checked Then
            shots = "Virgin"
        End If
        'Sends selected liquor choice to "liquor" variable
        If rdoVodka.Checked Then
            liquor = "Vodka"
        ElseIf rdoTequila.Checked Then
            liquor = "Tequila"
        ElseIf rdoWhiskey.Checked Then
            liquor = "Whiskey"
        ElseIf rdoRum.Checked Then
            liquor = "Rum"
        End If
        'Sends selected sice to the "spice" variable
        If rdoBland.Checked Then
            spice = "No Spice"
        ElseIf rdoMild.Checked Then
            spice = "Spice: Mild"
        ElseIf rdoSpicy.Checked Then
            spice = "Spice: Hot!"
        ElseIf rdoHot.Checked Then
            spice = "Spice: Burn Me Twice!!!"
        End If
        'If a garnish is checked sends the item to its variable and adds .25 to the "total" variable
        If ckbBeans.Checked Then
            total += 0.25
            beans = "Beans"
        End If
        If ckbLemon.Checked Then
            total += 0.25
            lemon = "Lemons"
        End If
        If ckbPickle.Checked Then
            total += 0.25
            pickle = "Pickle"
        End If
        If ckbPrawns.Checked Then
            total += 0.25
            prawns = "Prawns"
        End If
        If ckbOlives.Checked Then
            total += 0.25
            olives = "Olives"
        End If
        If ckbBacon.Checked Then
            total += 0.25
            bacon = "Bacon"
        End If
        If ckbOnions.Checked Then
            total += 0.25
            onions = "Onions"
        End If
        If ckbJalapenos.Checked Then
            total += 0.25
            jalapenos = "Jalapenos"
        End If
        If ckbCelery.Checked Then
            total += 0.25
            celery = "Celery"
        End If
        If ckbLime.Checked Then
            total += 0.25
            lime = "Lime"
        End If
        If ckbAsparagus.Checked Then
            total += 0.25
            asparagus = "Asparagus"
        End If
        If ckbPeperoni.Checked Then
            total += 0.25
            peperoni = "Peperoni"
        End If
        'Sends the selected rim choice to the "rim" variable
        If rdoSalt.Checked Then
            rim = "Rim: Salted"
        ElseIf rdoBacSalt.Checked Then
            rim = "Rim: Bacon Salt"
        ElseIf rdoCelsalt.Checked Then
            rim = "Rim: Celery Salt"
        ElseIf rdoBBQrub.Checked Then
            rim = "Rim: BBQ rub"
        ElseIf rdoOldBay.Checked Then
            rim = "Rim: Old Bay"
        ElseIf rdoNoSalt.Checked Then
            rim = "Rim: No Salt"
        End If
        'If a burgerYes is selected sends a statement to the "burger" variable and adds 6.00 to "total" variable
        If rdoBurgerYes.Checked Then
            total += 6
            burger = "With a Burger on top!"
        End If
        'Calculates the suggested tip and stores amount in "tip" variable
        tip = CDbl(total * 0.2)
        'Converts "total" to string and displays the amount in lblSubTotal
        lblSubTotal.Text = total.ToString("c")
        'Calculates the tax and stores the amount in the "tax" variable
        tax = CDbl(total * taxRate)
        'Adds the amounts stored in total/tax/tip variables and stores the sum in the "grandTotal" variable
        grandTotal = CDbl(total + tax + tip)
        'Converts "grandTotal" to string and displays the amount in lblGrandTotal
        lblGrandTotal.Text = grandTotal.ToString("c")
        'Converts "tax" to string and displays the amount in lblTax
        lblTax.Text = tax.ToString("c")
        'Displays amount stored in "tip" variable in nudTip
        nudTip.Text = tip
        'Gathers information stored in variables the create a string to display in lblOrderSummary
        lblSummary.Text = "Order Summary:" & ControlChars.CrLf &
                          glass & ControlChars.CrLf &
                          rim & ControlChars.CrLf &
                          ice & ControlChars.CrLf &
                          base & ControlChars.CrLf &
                          shots & "  " & liquor & ControlChars.CrLf &
                          spice & ControlChars.CrLf &
                          "Garnishes:" & ControlChars.CrLf &
                          beans & ControlChars.CrLf &
                          lemon & ControlChars.CrLf &
                          pickle & ControlChars.CrLf &
                          prawns & ControlChars.CrLf &
                          olives & ControlChars.CrLf &
                          bacon & ControlChars.CrLf &
                          onions & ControlChars.CrLf &
                          jalapenos & ControlChars.CrLf &
                          celery & ControlChars.CrLf &
                          lime & ControlChars.CrLf &
                          asparagus & ControlChars.CrLf &
                          peperoni & ControlChars.CrLf &
                          burger
        'Display's a message box instructing user to select # of shots if a liquor is selected but no shots or vice versa
        If rdoNone.Checked = True And rdoVirgin.Checked = False Then
            MessageBox.Show("Please select how many shots" & ControlChars.CrLf &
                            "Or select no Liquor if a non-Alcoholic beverage is Desired")
        ElseIf rdoVirgin.Checked = True And rdoNone.Checked = False Then
            MessageBox.Show("Please select what type of liquor you want" & ControlChars.CrLf &
                            "Or Select No shots if a non-Alcoholic beverage is Desired")
        End If
        'Checks to see if requiments are met, if they are displays "The Norm" in lblSubName and displays Norm pic in pcbDrink 
        If rdoDouble.Checked And rdoTom.Checked And rdoVodka.Checked And rdoBland.Checked And ckbCelery.Checked And
            ckbLime.Checked And ckbOlives.Checked And rdoSalt.Checked And ckbBeans.Checked = False And ckbLemon.Checked = False And
            ckbPickle.Checked = False And ckbPrawns.Checked = False And ckbBacon.Checked = False And ckbOnions.Checked = False And
            ckbJalapenos.Checked = False And ckbAsparagus.Checked = False And ckbPeperoni.Checked = False Then
            lblSubName.Text = "The Norm"
            pcbDrink.Image = My.Resources.Norm
        End If
        'Checks to see if requiments are met, if they are displays "The Linda" in lblSubName and displays Norm pic in pcbDrink
        If rdoS22oz.Checked And rdoTriple.Checked And rdoHot.Checked And ckbBeans.Checked And ckbLemon.Checked And ckbPickle.Checked And ckbPrawns.Checked And
            ckbOlives.Checked And ckbBacon.Checked And ckbOnions.Checked And ckbJalapenos.Checked And ckbCelery.Checked And
            ckbLime.Checked And ckbAsparagus.Checked And ckbPeperoni.Checked And rdoBurgerYes.Checked Then
            lblSubName.Text = "The Linda"
            pcbDrink.Image = My.Resources.wilma_2
        End If
        'Checks to see if requiments are met, if they are displays "Playing in the Garden" in lblSubName
        If ckbBeans.Checked And ckbLemon.Checked And ckbPickle.Checked And ckbOlives.Checked And ckbOnions.Checked And ckbJalapenos.Checked And
            ckbCelery.Checked And ckbLime.Checked And ckbAsparagus.Checked And ckbPeperoni.Checked = False And ckbPrawns.Checked = False And
            ckbBacon.Checked = False Then
            lblSubName.Text = "Playing In The Garden"
        End If
        'Checks to see if requiments are met, if they are displays "Was a Nun" in lblSubName
        If ckbBeans.Checked = False And ckbLemon.Checked = False And ckbPickle.Checked = False And ckbPrawns.Checked = False And
            ckbOlives.Checked = False And ckbBacon.Checked = False And ckbOnions.Checked = False And ckbJalapenos.Checked = False And
            ckbCelery.Checked = False And ckbLime.Checked = False And ckbAsparagus.Checked = False And ckbPeperoni.Checked = False Then
            lblSubName.Text = "Was A Nun"
        End If
        'Checks to see if requiments are met, if they are displays "Surf & Turf" in lblSubName
        If ckbBeans.Checked = False And ckbLemon.Checked = False And ckbPickle.Checked = False And ckbPrawns.Checked And
            ckbOlives.Checked = False And ckbBacon.Checked And ckbOnions.Checked = False And ckbJalapenos.Checked = False And
            ckbCelery.Checked = False And ckbLime.Checked = False And ckbAsparagus.Checked = False And ckbPeperoni.Checked And
            rdoOldBay.Checked Then
            lblSubName.Text = "Surf && Turf"
        End If
        'Checks to see if requiments are met, if they are displays "Horror Show" in lblSubName
        If ckbBeans.Checked And ckbLemon.Checked = False And ckbPickle.Checked = False And ckbPrawns.Checked = False And ckbOlives.Checked And
            ckbBacon.Checked = False And ckbOnions.Checked = False And ckbJalapenos.Checked = False And ckbCelery.Checked And
            ckbLime.Checked = False And ckbAsparagus.Checked And ckbPeperoni.Checked And rdoBBQrub.Checked Then
            lblSubName.Text = "Horror Show"
        End If
        'Checks to see if requiments are met, if they are displays "Meat Eater" in lblSubName
        If ckbBeans.Checked = False And ckbLemon.Checked = False And ckbPickle.Checked = False And ckbPrawns.Checked And
            ckbOlives.Checked = False And ckbBacon.Checked And ckbOnions.Checked = False And ckbJalapenos.Checked = False And
            ckbCelery.Checked = False And ckbLime.Checked = False And ckbAsparagus.Checked = False And ckbPeperoni.Checked And
            rdoBurgerYes.Checked And rdoBBQrub.Checked Then
            lblSubName.Text = "Meat Eater"
        End If
        'Checks to see if requiments are met, if they are displays "The Fraizer" in lblSubName and changes photo in pcbDrink
        If rdoBland.Checked And rdoSingle.Checked And ckbBeans.Checked = False And ckbLemon.Checked = False And
            ckbPickle.Checked = False And ckbOlives.Checked = False And ckbOnions.Checked = False And
            ckbJalapenos.Checked = False And ckbCelery.Checked And ckbLime.Checked = False And
            ckbAsparagus.Checked = False And ckbPeperoni.Checked = False And ckbPrawns.Checked = False And
            ckbBacon.Checked = False Then
            lblSubName.Text = "The Fraizer"
            pcbDrink.Image = My.Resources.frazier2
        End If
    End Sub
    Private Sub rdoTom_CheckedChanged(sender As Object, e As EventArgs) Handles rdoTom.CheckedChanged
        'Checks requiments and sets lblName for Bloody Mary/Bloody Molly/Bloody Maria/Blood Beard/Virgin Mary when rdotom is checked
        If rdoVodka.Checked And rdoTom.Checked Then
            lblName.Text = "Bloody Mary"
        End If
        If rdoWhiskey.Checked And rdoTom.Checked Then
            lblName.Text = "Bloody Molly"
        End If
        If rdoTom.Checked And rdoTequila.Checked Then
            lblName.Text = "Bloody Maria"
        End If
        If rdoTom.Checked And rdoRum.Checked Then
            lblName.Text = "Blood    Beard"
        End If
        If rdoTom.Checked And rdoVirgin.Checked Then
            lblName.Text = "Virgin   Mary"
        End If
    End Sub
    Private Sub rdoClam_CheckedChanged(sender As Object, e As EventArgs) Handles rdoClam.CheckedChanged
        'Checks requiments and sets lblName for Bloody Ceaser/Virgin Ceaser/Hot Breff when rdoClam is checked
        If rdoClam.Checked And rdoVodka.Checked Then
            lblName.Text = "Bloody Ceaser"
        ElseIf rdoClam.Checked And rdoVirgin.Checked Then
            lblName.Text = "Virgin   Ceaser"
        Else
            lblName.Text = "Hott     Breff"
        End If
    End Sub
    Private Sub rdoVodka_CheckedChanged(sender As Object, e As EventArgs) Handles rdoVodka.CheckedChanged
        'Checks requiments and sets lblName for Bloody Mary or Bloody Ceaser when rdoVodka is checked
        If rdoVodka.Checked And rdoTom.Checked Then
            lblName.Text = "Bloody Mary"
        ElseIf rdoVodka.Checked And rdoClam.Checked Then
            lblName.Text = "Bloody Ceaser"
        End If
    End Sub
    Private Sub rdoWhiskey_CheckedChanged(sender As Object, e As EventArgs) Handles rdoWhiskey.CheckedChanged
        'Checks requiments and sets lblName for Bloody Molly or Hot Breff when rdoWhiskey is checked
        If rdoWhiskey.Checked And rdoTom.Checked Then
            lblName.Text = "Bloody Molly"
        ElseIf rdoWhiskey.Checked And rdoClam.Checked Then
            lblName.Text = "Hott     Breff"
        End If
    End Sub
    Private Sub rdoTequila_CheckedChanged(sender As Object, e As EventArgs) Handles rdoTequila.CheckedChanged
        'Checks requiments and sets lblName for Bloody Maria or Hot Breff when rdoTequila is checked
        If rdoTequila.Checked And rdoTom.Checked Then
            lblName.Text = "Bloody Maria"
        ElseIf rdoTequila.Checked And rdoClam.Checked Then
            lblName.Text = "Hott     Breff"
        End If
    End Sub
    Private Sub rdoRum_CheckedChanged(sender As Object, e As EventArgs) Handles rdoRum.CheckedChanged
        'Checks requiments and sets lblname for Blood Beard or Hott Breff when rdoRum is checked
        If rdoRum.Checked And rdoTom.Checked Then
            lblName.Text = "Blood    Beard"
        ElseIf rdoRum.Checked And rdoClam.Checked Then
            lblName.Text = "Hott     Breff"
        End If
    End Sub
    Private Sub rdoVirgin_CheckedChanged(sender As Object, e As EventArgs) Handles rdoVirgin.CheckedChanged
        'Checks requiments and sets lblName for Virgin Mary or Virgin Ceaser when rdoVirgin is checked
        If rdoVirgin.Checked And rdoTom.Checked Then
            lblName.Text = "Virgin   Mary"
        ElseIf rdoVirgin.Checked And rdoClam.Checked Then
            lblName.Text = "Virgin   Ceaser"
        End If
    End Sub
    Private Sub btnReCalc_Click(sender As Object, e As EventArgs) Handles btnReCalc.Click
        'Sets variables to recalculate grand total if user changes tax amount
        Dim tip As Double
        Dim grandTotal As Double
        Dim total As Double
        Dim tax As Double
        'Test to make sure that lblGrandTotal isn't empty before continuing
        If lblGrandTotal.Text <> String.Empty Then
            'store nudTip amount in "tip" variable
            tip = CDbl(nudTip.Text)
            'store lblSubTotal amount in "total" variable
            total = CDbl(lblSubTotal.Text)
            'store lblTax amount in "tax" variable
            tax = CDbl(lblTax.Text)
            'Add tip/total/tax together and stores sum in "grandtotal" variable
            grandTotal = CDbl(tip + total + tax)
            'Converts grandTotal to string and displays amount in lblGrandTotal
            lblGrandTotal.Text = grandTotal.ToString("c")
        End If
    End Sub
    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'Resets form to default values
        rdoS16oz.Checked = True
        rdoYes.Checked = True
        rdoDouble.Checked = True
        rdoTom.Checked = True
        rdoVodka.Checked = True
        rdoBland.Checked = True
        ckbBeans.Checked = False
        ckbLemon.Checked = False
        ckbPickle.Checked = False
        ckbPrawns.Checked = False
        ckbOlives.Checked = True
        ckbBacon.Checked = False
        ckbOnions.Checked = False
        ckbJalapenos.Checked = False
        ckbCelery.Checked = True
        ckbLime.Checked = True
        ckbAsparagus.Checked = False
        ckbPeperoni.Checked = False
        rdoSalt.Checked = True
        rdoBurgerNo.Checked = True
        lblSubTotal.Text = String.Empty
        lblTax.Text = String.Empty
        nudTip.Text = String.Empty
        lblGrandTotal.Text = String.Empty
        lblSubName.Text = String.Empty
        lblSummary.Text = "" & ControlChars.CrLf &
            "Any Size Drink $6.00  " & ControlChars.CrLf &
            " " & ControlChars.CrLf &
            "Make it a:" & ControlChars.CrLf &
            "Double + $2.00" & ControlChars.CrLf &
            "Triple       $9.00" & ControlChars.CrLf &
            "" & ControlChars.CrLf &
            "Garnishes  $.25 each" & ControlChars.CrLf &
            "" & ControlChars.CrLf &
            "Burger     $6.00"
        pcbDrink.Image = My.Resources.theWorks
    End Sub
    Private Sub Button1_Click_1(sender As Object, e As EventArgs) Handles btnOrderExit.Click
        'Brings up frmEnjoy
        frmEnjoy.Show()
    End Sub
End Class
