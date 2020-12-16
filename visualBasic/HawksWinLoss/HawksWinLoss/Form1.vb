'Group 16 Project 4

'Project: Seahawks Win/Loss Stats
'Descrption: A form that reads and writes to a file allowing a user to enter/edit game scores
'and display overall stats and stats vs. individual teams

'Authors: 
'David Dicken
'Jake Nannery
'Evan Dukes
'Michael Nardozzi
'Last edited on 11/30/2015

Imports System.IO
Public Class frmHawks
    Dim hawksWrite As StreamWriter      'streamwriter variable
    Dim hawksRead As StreamReader       'streamreader variable
    Dim strDate(1000) As String         'date array
    Dim hometeam(1000) As String        'hometeam array
    Dim homescore(1000) As Integer      'homescore array
    Dim awayteam(1000) As String        'awayteam array
    Dim awayscore(1000) As Integer      'awayscore array
    Dim count As Integer = 0            'variable to hold a count of games
    Dim currentIndex As Integer = 0     'variable for currentIndex

    Private Sub frmHawks_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        'Play Lunch audio clip
        My.Computer.Audio.Play(My.Resources.lynch, AudioPlayMode.Background)

        'opens file to read to arrays
        If File.Exists("Seahawks.txt") Then              'checks if file exists
            hawksRead = File.OpenText("Seahawks.txt")    'opens file to read
            Do While Not hawksRead.EndOfStream           'test if all of the file has been read
                strDate(count) = hawksRead.ReadLine()    'adds 1st line in file to array dtdate
                hometeam(count) = hawksRead.ReadLine()   'adds 2nd line in file to array hometeam
                homescore(count) = hawksRead.ReadLine()  'ect
                awayteam(count) = hawksRead.ReadLine()   'ect
                awayscore(count) = hawksRead.ReadLine()  'ect
                count += 1                               'add 1 to count 
            Loop
            currentIndex += 1
            populateScores(currentIndex)                 'poulate info into listbox
            hawksRead.Close()                            'close file
        End If
    End Sub

    Private Sub WriteFile()
        'open file to write to
        hawksWrite = File.CreateText("Seahawks.txt")
        For index As Integer = 0 To count - 1
            hawksWrite.WriteLine(strDate(index))   'write date to file
            hawksWrite.WriteLine(hometeam(index))  'write hometeam to file
            hawksWrite.WriteLine(homescore(index)) 'write homescore to file
            hawksWrite.WriteLine(awayteam(index))  'write awayteam to file
            hawksWrite.WriteLine(awayscore(index)) 'write awayscore to file
        Next
        hawksWrite.Close()
    End Sub

    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click

        'delete selected elements out of the arrays
        DeleteElement(strDate)
        DeleteElement(hometeam)
        DeleteElement(homescore)
        DeleteElement(awayteam)
        DeleteElement(awayscore)

        count -= 1                     'subtract 1 from count for the game 
        '                               that got deleted

        lbxScores.Items.Clear()                       'clears list box
        populateScores(currentIndex)                  're populate
        btnDelete.Enabled = False                     'disable the delete button again
        btnEdit.Enabled = False                       'disable the edit button again

    End Sub

    Private Sub DeleteElement(array As Array)
        'Private sub to delete element from selected array
        Dim selected As Integer                   'variable to hold selected index value

        selected = lbxScores.SelectedIndex        'sets selected variable to be the selected index

        For i = selected To UBound(array) - 1     'take selected element in a array 
            array(i) = array(i + 1)               'and adds 1 to index to push it out of the array
        Next i

    End Sub

    Private Sub ClearTxt()     'resets text and comboboxes
        cbxHome.Text = " "
        cbxAway.Text = " "
        txtHomeScore.Text = " "
        txtAwayScore.Text = " "
    End Sub

    Private Sub ClearLabels()   'clears labels in Vs. section
        lblCompAvg.Text = " "
        lblCompTie.Text = " "
        lblCompTotal.Text = " "
        lblCompOppAvg.Text = " "
        lblCompWinPerc.Text = " "
        lblCompWinLoss.Text = " "
        lblCompOppTotal.Text = " "
    End Sub

    Private Sub lbxScores_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbxScores.SelectedIndexChanged

        'enables the correct buttons once line is selected on list box
        btnDelete.Enabled = True
        btnEdit.Enabled = True
        ClearTxt()
        btnAdd.Text = "Add"
    End Sub

    Private Sub populateScores(index As Integer)
        Dim points As Integer = 0
        Dim pointsAgainst As Integer = 0
        Dim pointsAvg As Double
        Dim pointsAgainstAvg As Double
        Dim wins As Double
        Dim losses As Double
        Dim winPerc As Double
        Dim tie As Integer

        '*********************************************************************
        '***********Populates lbxScore with date, teams and scores************
        '*********************************************************************
        For index = 0 To count - 1

            'Adds items from arrays to a line in the listbox
            lbxScores.Items.Add(strDate(index) & " " & homescore(index) & " " &
            hometeam(index) & " " & vbTab &
            awayscore(index) & " " & awayteam(index))

            'get scores for averages
            If hometeam(index) = "Seahawks" Then   'this section
                points += homescore(index)         'checks weither Seahawks
                pointsAgainst += awayscore(index)  'are away or home
            Else                                   'then adds the apropriate
                points += awayscore(index)         'points to the
                pointsAgainst += homescore(index)  'apropriate variable
            End If

            'figure out if Seahawks won or tied and add to wins or tie variable
            ' to help figure out win percentage
            If homescore(index) = awayscore(index) Then
                tie += 1
                wins += 0.5
            ElseIf hometeam(index) = "Seahawks" And homescore(index) > awayscore(index) Then
                wins += 1
            ElseIf awayteam(index) = "Seahawks" And awayscore(index) > homescore(index) Then
                wins += 1
            End If

        Next
        Try
            'Get Stats
            losses = count - wins
            winPerc = wins / count
            pointsAvg = points / (count)
            pointsAgainstAvg = pointsAgainst / (count)

            'Display Stats
            lblTie.Text = tie
            lblTotalPoints.Text = points
            lblOppPoints.Text = pointsAgainst
            lblAvgPoints.Text = CInt(pointsAvg)
            lblWinPerc.Text = winPerc.ToString("n3")
            lblMainWinLoss.Text = wins & " / " & losses
            lblAvgOppPoints.Text = CInt(pointsAgainstAvg)
        Catch
        End Try
    End Sub

    '**********************************************************************************
    '*********next 2 sub's prevent user from selecting Seahawks vs Seahwaks ***********
    '**********************************************************************************
    Private Sub cbxHome_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbxHome.SelectedIndexChanged
        If Not cbxHome.Text = "Seahawks" Then
            cbxAway.Text = "Seahawks"
            'cbxAway.Enabled = False
        Else
            'cbxAway.Enabled = True
            If cbxAway.Text = "Seahawks" Then
                cbxAway.Text = " "
            End If
        End If
    End Sub

    Private Sub cbxAway_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbxAway.SelectedIndexChanged
        If Not cbxAway.Text = "Seahawks" Then
            cbxHome.Text = "Seahawks"
            'cbxHome.Enabled = False
        Else
            'cbxHome.Enabled = True
            If cbxHome.Text = "Seahawks" Then
                cbxHome.Text = " "
            End If
        End If
    End Sub

    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        Dim intTest As Integer
        '*************************************************************************************
        '********************Checks to see that user entered info in all feilds **************
        '*************************************************************************************

        If dtpDate.Text <> String.Empty And cbxHome.Text <> " " And
                  txtHomeScore.Text <> String.Empty And cbxAway.Text <> " " And
                  txtAwayScore.Text <> String.Empty Then

            'runs tryparse to make sure scores are integers, then check to make sure they are + #'s
            If Integer.TryParse(txtAwayScore.Text, intTest) Then
                If txtAwayScore.Text >= 0 Then
                    If Integer.TryParse(txtHomeScore.Text, intTest) Then
                        If txtHomeScore.Text >= 0 Then

                            If btnAdd.Text = "Add" Then

                                strDate(count) = dtpDate.Text          ' sends users input
                                hometeam(count) = cbxHome.Text         ' to the end of the
                                awayteam(count) = cbxAway.Text         ' arrays
                                homescore(count) = txtHomeScore.Text
                                awayscore(count) = txtAwayScore.Text

                                count += 1                             'adds one to the count
                                lbxScores.Items.Clear()                'clears lbxScores
                                populateScores(currentIndex)           're-populates list
                                WriteFile()                            'writes changes to the file
                                ClearTxt()                             'clears textboxes
                                btnDelete.Enabled = False              'prevents user from useing delete 
                                btnEdit.Enabled = False                'or edit if no item selected in list box

                            Else
                                Dim selected As Integer                'variable to hold the selected index
                                selected = lbxScores.SelectedIndex     'stores the selected index in variable to use to
                                '                                       edit proper element in array

                                'edits the array at selected spot
                                strDate(selected) = dtpDate.Text
                                hometeam(selected) = cbxHome.Text
                                awayteam(selected) = cbxAway.Text
                                homescore(selected) = txtHomeScore.Text
                                awayscore(selected) = txtAwayScore.Text

                                lbxScores.Items.Clear()                'clears listbox
                                populateScores(currentIndex)           'repopulates listbox
                                ClearTxt()                             'clear textboxes
                                btnAdd.Text = "Add"                    'Change Add button text back to Add
                                btnDelete.Enabled = False              'Disable Delete button
                                btnEdit.Enabled = False                'Disable Edit button

                            End If
                        Else
                            MessageBox.Show("Please use integer equal to or greater then 0 for the Hometeam's Score")  'asks user to use a + integer 
                        End If
                    Else
                        MessageBox.Show("Please use a integer equal to or greater then 0 for the Hometeam's Score.")  'asks user to use a + integer
                    End If
                Else
                    MessageBox.Show("Please use a integer equal to or greater then 0 for the Awayteam's Score.")  'asks user to use a + integer
                End If
            Else
                MessageBox.Show("Please use a integer equal to or greater then 0 for the Awayteam's Score.")  'asks user to use a + integer
            End If
        Else
            MessageBox.Show("Please enter info in all feilds.")  'display message box if user hasn't entered all info
        End If
    End Sub

    Private Sub btnEdit_Click(sender As Object, e As EventArgs) Handles btnEdit.Click
        Dim selected As Integer                'variable to hold selectedindex value

        selected = lbxScores.SelectedIndex     'assign selectedindex value to variable

        '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        'Uses selected variable to tell what elements in the arrays to display
        '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        dtpDate.Text = strDate(selected)
        cbxHome.Text = hometeam(selected)
        cbxAway.Text = awayteam(selected)
        txtHomeScore.Text = homescore(selected)
        txtAwayScore.Text = awayscore(selected)
        btnAdd.Text = "Save Changes"
        btnDelete.Enabled = False

    End Sub

    Private Sub cbxCompare_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbxCompare.SelectedIndexChanged
        ClearLabels()                             'clears stats from last team compare
        lbxCompare.Items.Clear()                  'clear any previous items from listbox

        Dim tie As Double                         'variable to hold tie games
        Dim wins As Double                        'variable to hold wins
        Dim winPerc As Double                     'variable to hold win %
        Dim pointsAvg As Double                   'variable to hold avg points scored
        Dim losses As Double = 0                  'variable to hold games lost
        Dim points As Integer = 0                 'variable to hold total points scored by Hawks
        Dim CompCount As Integer = 0              'variable to track games
        Dim pointsAgainstAvg As Double            'variable to hold avg points againts Hawks
        Dim pointsAgainst As Integer = 0          'variable to hold points scored against Hawks

        Try
            For index = 0 To count - 1

                '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                'Displays elements of the index if the hometeam index matches team user seleced
                '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

                If cbxCompare.Text = hometeam(index) Then
                    lbxCompare.Items.Add(strDate(index) & " " & homescore(index) & " " &
                                       hometeam(index) & " " & vbTab &
                                      awayscore(index) & " " & awayteam(index))

                    CompCount += 1                         'keeping count of games

                    '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    '~~~~~~~~~~~~~~~~~~~~~~~~get scores for averages~~~~~~~~~~~~~~~~~~~~~~~
                    '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

                    If hometeam(index) = "Seahawks" Then   'this section
                        points += homescore(index)         'checks weither Seahawks
                        pointsAgainst += awayscore(index)  'are away or home
                    Else                                   'then add the apropriate
                        points += awayscore(index)         'points to the
                        pointsAgainst += homescore(index)  'apropriate variable

                    End If

                    '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    '~~~~~~figure out if Seahawks won or tied and add to wins or tie variable
                    '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

                    If homescore(index) = awayscore(index) Then
                        tie += 1
                        wins += 0.5
                    ElseIf hometeam(index) = "Seahawks" And homescore(index) > awayscore(index) Then
                        wins += 1
                    ElseIf awayteam(index) = "Seahawks" And awayscore(index) > homescore(index) Then
                        wins += 1
                    End If
                ElseIf cbxCompare.Text = awayteam(index) Then
                    lbxCompare.Items.Add(strDate(index) & " " & homescore(index) & " " &
                    hometeam(index) & " " & vbTab &
                    awayscore(index) & " " & awayteam(index))

                    CompCount += 1                         'keeps count of games for math later
                    'get scores for averages
                    If hometeam(index) = "Seahawks" Then   'this section
                        points += homescore(index)         'checks weither Seahawks
                        pointsAgainst += awayscore(index)  'are away or home
                    Else                                   'then add the apropriate
                        points += awayscore(index)         'points to the
                        pointsAgainst += homescore(index)  'apropriate variable
                    End If


                    '~~~~~~figure out if Seahawks won or tied and add to wins or tie variable

                    If homescore(index) = awayscore(index) Then
                        tie += 1
                        wins += 0.5
                    ElseIf hometeam(index) = "Seahawks" And homescore(index) > awayscore(index) Then
                        wins += 1
                    ElseIf awayteam(index) = "Seahawks" And awayscore(index) > homescore(index) Then
                        wins += 1
                    End If
                End If
            Next

            'Get stats
            losses = CompCount - wins
            winPerc = wins / CompCount
            pointsAvg = points / (CompCount)
            pointsAgainstAvg = pointsAgainst / (CompCount)

            'Display Stats
            lblCompTie.Text = tie
            lblCompTotal.Text = points
            lblCompAvg.Text = CInt(pointsAvg)
            lblCompOppTotal.Text = pointsAgainst
            lblCompWinLoss.Text = wins & " / " & losses
            lblCompOppAvg.Text = CInt(pointsAgainstAvg)
            lblCompWinPerc.Text = winPerc.ToString("n3")

        Catch
        End Try
    End Sub

    Private Sub SaveToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles tsmSave.Click
        'Saves file
        WriteFile()
    End Sub

    Private Sub AboutToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles tsmAbout.Click
        'Displays info about the program
        MessageBox.Show("Group 16 Project 4" & ControlChars.CrLf &
                        ControlChars.CrLf &
        "Project: Seahawks Win/Loss Stats" & ControlChars.CrLf &
        ControlChars.CrLf &
        "Descrption: A form that reads and writes to a file allowing" & ControlChars.CrLf &
        "a user to enter/edit game scores and display overall stats" & ControlChars.CrLf &
        "and stats vs. individual teams" & ControlChars.CrLf &
        ControlChars.CrLf &
        "Authors:" & ControlChars.CrLf &
        "David Dicken" & ControlChars.CrLf &
        "Jake Nannery" & ControlChars.CrLf &
        "Evan Dukes" & ControlChars.CrLf &
        "Michael Nardozzi")

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'Closes form
        Me.Close()

    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles tsmExit.Click
        'Closes form
        Me.Close()

    End Sub
    Private Sub frmHawks_FormClosing(sender As Object, e As FormClosingEventArgs) Handles Me.FormClosing
        'writes any changes before closing
        WriteFile()

    End Sub
End Class
