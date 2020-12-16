Public Class Form1

    Private Sub btnToss_Click(sender As Object, e As EventArgs) Handles btnToss.Click
        Dim sideup As Integer 'indivate which side is up
        Dim rand As New Random 'random # generator

        'get random # 0-1
        '0 = tails up and 1 = heads up
        sideup = rand.Next(2)

        'display the side that is up
        If sideup = 0 Then
            'show tails pic and hide heads pic
            picTails.Visible = True
            picHeads.Visible = False
        Else
            If sideup = 1 Then
                'show heads pic and hide tails pic
                picHeads.Visible = True
                picTails.Visible = False
            End If
        End If
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub
End Class