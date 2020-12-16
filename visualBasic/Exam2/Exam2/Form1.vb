'EXAM 2

'Project: Todo list
'Descrption: This program will allow a user to keep a list of tasks they need to do. 
'They will be able to add tasks and
'delete tasks from a list, and the list will persist in a text file.

'Author
'David Dicken
'Last edited on 11/30/2015

Imports System.IO
Public Class frmMain

    Private Sub frmMain_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        '*************************************************************************
        '****Checks if file exist. If it does opens and read items to lstToDo*****
        '*************************************************************************

        If File.Exists("todo.txt") Then
            Dim readfile As StreamReader
            readfile = File.OpenText("todo.txt")
            Do Until readfile.EndOfStream
                lstToDo.Items.Add(readfile.ReadLine())
            Loop
            readfile.Close()                           'closes file
        End If

    End Sub

    Private Sub frmMain_FormClosing(sender As Object, e As FormClosingEventArgs) Handles Me.FormClosing
        '*********************************************************************************
        '*****Create or overwrite todo.txt with any changes made before closing **********
        '*********************************************************************************

        Dim writefile As StreamWriter
        writefile = File.CreateText("todo.txt")
        For Each item As String In lstToDo.Items
            writefile.WriteLine(item)
        Next
        writefile.Close()                           'close file

    End Sub

    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        '**************************************************************************
        '***If txtAdd is not empty adds txtAdd.text to end of lstToDo**************
        '**************************************************************************

        If txtAdd.Text <> " " Then
            lstToDo.Items.Add(txtAdd.Text)
            txtAdd.Text = " "
        End If

    End Sub

    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click
        '********************************************************************************
        '*******remove the selected line from listbox and disable delete button**********
        '********************************************************************************

        lstToDo.Items.RemoveAt(lstToDo.SelectedIndex)
        btnDelete.Enabled = False
    End Sub

    Private Sub lstToDo_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstToDo.SelectedIndexChanged
        '********************************************************************************
        '*****Enabled delete button when user selects a line in listbox******************
        '********************************************************************************

        btnDelete.Enabled = True

    End Sub
End Class
