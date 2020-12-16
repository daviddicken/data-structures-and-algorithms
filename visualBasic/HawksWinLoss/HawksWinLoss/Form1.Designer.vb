<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmHawks
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmHawks))
        Me.lblStaticDate = New System.Windows.Forms.Label()
        Me.lblStaticHome = New System.Windows.Forms.Label()
        Me.lblStaticHscore = New System.Windows.Forms.Label()
        Me.lblStaticAway = New System.Windows.Forms.Label()
        Me.lblStaticAscore = New System.Windows.Forms.Label()
        Me.lbxScores = New System.Windows.Forms.ListBox()
        Me.cbxHome = New System.Windows.Forms.ComboBox()
        Me.cbxAway = New System.Windows.Forms.ComboBox()
        Me.btnAdd = New System.Windows.Forms.Button()
        Me.btnDelete = New System.Windows.Forms.Button()
        Me.cbxCompare = New System.Windows.Forms.ComboBox()
        Me.lbxCompare = New System.Windows.Forms.ListBox()
        Me.lblStaticPoint4 = New System.Windows.Forms.Label()
        Me.lblAvgOppPoints = New System.Windows.Forms.Label()
        Me.lblAvgPoints = New System.Windows.Forms.Label()
        Me.lblStaticPointsAgainst = New System.Windows.Forms.Label()
        Me.lblStaticAvg = New System.Windows.Forms.Label()
        Me.lblWinPerc = New System.Windows.Forms.Label()
        Me.lblStaticWinPerc = New System.Windows.Forms.Label()
        Me.lblStaticWL = New System.Windows.Forms.Label()
        Me.lblMainWinLoss = New System.Windows.Forms.Label()
        Me.btnEdit = New System.Windows.Forms.Button()
        Me.lblStaticTie = New System.Windows.Forms.Label()
        Me.lblTie = New System.Windows.Forms.Label()
        Me.txtHomeScore = New System.Windows.Forms.TextBox()
        Me.txtAwayScore = New System.Windows.Forms.TextBox()
        Me.lblStaticTotal = New System.Windows.Forms.Label()
        Me.lblTotalPoints = New System.Windows.Forms.Label()
        Me.lblOppPoints = New System.Windows.Forms.Label()
        Me.lblStaticAvg2 = New System.Windows.Forms.Label()
        Me.lblStaticTotal2 = New System.Windows.Forms.Label()
        Me.lblVs = New System.Windows.Forms.Label()
        Me.lblStaticVsTotal2 = New System.Windows.Forms.Label()
        Me.lblStaticVsAvg2 = New System.Windows.Forms.Label()
        Me.lblCompOppTotal = New System.Windows.Forms.Label()
        Me.lblCompTotal = New System.Windows.Forms.Label()
        Me.lblStaticVsTotal = New System.Windows.Forms.Label()
        Me.lblCompTie = New System.Windows.Forms.Label()
        Me.lblStaticVsTie = New System.Windows.Forms.Label()
        Me.lblCompWinLoss = New System.Windows.Forms.Label()
        Me.lblStaticVsWL = New System.Windows.Forms.Label()
        Me.lblStaticVsWinPerc = New System.Windows.Forms.Label()
        Me.lblCompWinPerc = New System.Windows.Forms.Label()
        Me.lblStaticVsAvg = New System.Windows.Forms.Label()
        Me.lblStaticVsPointsOpp = New System.Windows.Forms.Label()
        Me.lblCompAvg = New System.Windows.Forms.Label()
        Me.lblCompOppAvg = New System.Windows.Forms.Label()
        Me.lblStaticVsPoints4 = New System.Windows.Forms.Label()
        Me.lblSeahaawks = New System.Windows.Forms.Label()
        Me.mspHawks = New System.Windows.Forms.MenuStrip()
        Me.tsmFile = New System.Windows.Forms.ToolStripMenuItem()
        Me.tsmSave = New System.Windows.Forms.ToolStripMenuItem()
        Me.tsmExit = New System.Windows.Forms.ToolStripMenuItem()
        Me.tsmHelp = New System.Windows.Forms.ToolStripMenuItem()
        Me.tsmAbout = New System.Windows.Forms.ToolStripMenuItem()
        Me.dtpDate = New System.Windows.Forms.DateTimePicker()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.mspHawks.SuspendLayout()
        Me.SuspendLayout()
        '
        'lblStaticDate
        '
        Me.lblStaticDate.AutoSize = True
        Me.lblStaticDate.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticDate.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticDate.Location = New System.Drawing.Point(44, 506)
        Me.lblStaticDate.Name = "lblStaticDate"
        Me.lblStaticDate.Size = New System.Drawing.Size(30, 13)
        Me.lblStaticDate.TabIndex = 6
        Me.lblStaticDate.Text = "Date"
        '
        'lblStaticHome
        '
        Me.lblStaticHome.AutoSize = True
        Me.lblStaticHome.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticHome.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticHome.Location = New System.Drawing.Point(127, 507)
        Me.lblStaticHome.Name = "lblStaticHome"
        Me.lblStaticHome.Size = New System.Drawing.Size(35, 13)
        Me.lblStaticHome.TabIndex = 7
        Me.lblStaticHome.Text = "Home"
        '
        'lblStaticHscore
        '
        Me.lblStaticHscore.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticHscore.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticHscore.Location = New System.Drawing.Point(229, 507)
        Me.lblStaticHscore.Name = "lblStaticHscore"
        Me.lblStaticHscore.Size = New System.Drawing.Size(47, 13)
        Me.lblStaticHscore.TabIndex = 8
        Me.lblStaticHscore.Text = "Score"
        Me.lblStaticHscore.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'lblStaticAway
        '
        Me.lblStaticAway.AutoSize = True
        Me.lblStaticAway.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticAway.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticAway.Location = New System.Drawing.Point(319, 507)
        Me.lblStaticAway.Name = "lblStaticAway"
        Me.lblStaticAway.Size = New System.Drawing.Size(33, 13)
        Me.lblStaticAway.TabIndex = 9
        Me.lblStaticAway.Text = "Away"
        '
        'lblStaticAscore
        '
        Me.lblStaticAscore.AutoSize = True
        Me.lblStaticAscore.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticAscore.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticAscore.Location = New System.Drawing.Point(415, 506)
        Me.lblStaticAscore.Name = "lblStaticAscore"
        Me.lblStaticAscore.Size = New System.Drawing.Size(35, 13)
        Me.lblStaticAscore.TabIndex = 10
        Me.lblStaticAscore.Text = "Score"
        '
        'lbxScores
        '
        Me.lbxScores.BackColor = System.Drawing.Color.MidnightBlue
        Me.lbxScores.Font = New System.Drawing.Font("Courier New", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lbxScores.ForeColor = System.Drawing.Color.Lime
        Me.lbxScores.FormattingEnabled = True
        Me.lbxScores.ItemHeight = 14
        Me.lbxScores.Location = New System.Drawing.Point(8, 292)
        Me.lbxScores.Name = "lbxScores"
        Me.lbxScores.Size = New System.Drawing.Size(289, 172)
        Me.lbxScores.TabIndex = 12
        '
        'cbxHome
        '
        Me.cbxHome.BackColor = System.Drawing.Color.Lime
        Me.cbxHome.FormattingEnabled = True
        Me.cbxHome.Items.AddRange(New Object() {"49ers", "Bears", "Bengals", "Bills", "Broncos", "Browns", "Buccaneers", "Cardinals", "Chargers", "Chiefs", "Colts", "Cowboys", "Dolphins", "Eagles", "Falcons", "Giants", "Jaguars", "Jets", "Lions", "Packers", "Panthers", "Patriots", "Raiders", "Rams", "Ravens", "Redskins", "Saints", "Seahawks", "Steelers", "Texans", "Titans", "Vikings"})
        Me.cbxHome.Location = New System.Drawing.Point(100, 483)
        Me.cbxHome.Name = "cbxHome"
        Me.cbxHome.Size = New System.Drawing.Size(121, 21)
        Me.cbxHome.Sorted = True
        Me.cbxHome.TabIndex = 13
        '
        'cbxAway
        '
        Me.cbxAway.BackColor = System.Drawing.Color.Lime
        Me.cbxAway.FormattingEnabled = True
        Me.cbxAway.Items.AddRange(New Object() {"49ers", "Bears", "Bengals", "Bills", "Broncos", "Browns", "Buccaneers", "Cardinals", "Chargers", "Chiefs", "Colts", "Cowboys", "Dolphins", "Eagles", "Falcons", "Giants", "Jaguars", "Jets", "Lions", "Packers", "Panthers", "Patriots", "Raiders", "Rams", "Ravens", "Redskins", "Saints", "Seahawks", "Steelers", "Texans", "Titans", "Vikings"})
        Me.cbxAway.Location = New System.Drawing.Point(282, 482)
        Me.cbxAway.Name = "cbxAway"
        Me.cbxAway.Size = New System.Drawing.Size(121, 21)
        Me.cbxAway.Sorted = True
        Me.cbxAway.TabIndex = 14
        '
        'btnAdd
        '
        Me.btnAdd.BackColor = System.Drawing.Color.Lime
        Me.btnAdd.Location = New System.Drawing.Point(469, 483)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(86, 37)
        Me.btnAdd.TabIndex = 15
        Me.btnAdd.Text = "Add"
        Me.btnAdd.UseVisualStyleBackColor = False
        '
        'btnDelete
        '
        Me.btnDelete.BackColor = System.Drawing.Color.Lime
        Me.btnDelete.Enabled = False
        Me.btnDelete.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnDelete.Location = New System.Drawing.Point(8, 263)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.Size = New System.Drawing.Size(75, 23)
        Me.btnDelete.TabIndex = 16
        Me.btnDelete.Text = "Delete Line"
        Me.btnDelete.UseVisualStyleBackColor = False
        '
        'cbxCompare
        '
        Me.cbxCompare.BackColor = System.Drawing.Color.Lime
        Me.cbxCompare.FormattingEnabled = True
        Me.cbxCompare.Items.AddRange(New Object() {"49ers", "Bears", "Bengals", "Bills", "Broncos", "Browns", "Buccaneers", "Cardinals", "Chargers", "Chiefs", "Colts", "Cowboys", "Dolphins", "Eagles", "Falcons", "Giants", "Jaguars", "Jets", "Lions", "Packers", "Panthers", "Patriots", "Raiders", "Rams", "Ravens", "Redskins", "Saints", "Steelers", "Texans", "Titans", "Vikings"})
        Me.cbxCompare.Location = New System.Drawing.Point(672, 197)
        Me.cbxCompare.Name = "cbxCompare"
        Me.cbxCompare.Size = New System.Drawing.Size(114, 21)
        Me.cbxCompare.Sorted = True
        Me.cbxCompare.TabIndex = 17
        '
        'lbxCompare
        '
        Me.lbxCompare.BackColor = System.Drawing.Color.MidnightBlue
        Me.lbxCompare.Font = New System.Drawing.Font("Courier New", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lbxCompare.ForeColor = System.Drawing.Color.Lime
        Me.lbxCompare.FormattingEnabled = True
        Me.lbxCompare.ItemHeight = 14
        Me.lbxCompare.Location = New System.Drawing.Point(625, 284)
        Me.lbxCompare.Name = "lbxCompare"
        Me.lbxCompare.Size = New System.Drawing.Size(279, 172)
        Me.lbxCompare.TabIndex = 19
        '
        'lblStaticPoint4
        '
        Me.lblStaticPoint4.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticPoint4.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticPoint4.Location = New System.Drawing.Point(303, 257)
        Me.lblStaticPoint4.Name = "lblStaticPoint4"
        Me.lblStaticPoint4.Size = New System.Drawing.Size(100, 23)
        Me.lblStaticPoint4.TabIndex = 24
        Me.lblStaticPoint4.Text = "Points For:"
        Me.lblStaticPoint4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblAvgOppPoints
        '
        Me.lblAvgOppPoints.BackColor = System.Drawing.Color.Transparent
        Me.lblAvgOppPoints.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblAvgOppPoints.ForeColor = System.Drawing.Color.Lime
        Me.lblAvgOppPoints.Location = New System.Drawing.Point(302, 356)
        Me.lblAvgOppPoints.Name = "lblAvgOppPoints"
        Me.lblAvgOppPoints.Size = New System.Drawing.Size(49, 23)
        Me.lblAvgOppPoints.TabIndex = 25
        Me.lblAvgOppPoints.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblAvgPoints
        '
        Me.lblAvgPoints.BackColor = System.Drawing.Color.Transparent
        Me.lblAvgPoints.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblAvgPoints.ForeColor = System.Drawing.Color.Lime
        Me.lblAvgPoints.Location = New System.Drawing.Point(303, 293)
        Me.lblAvgPoints.Name = "lblAvgPoints"
        Me.lblAvgPoints.Size = New System.Drawing.Size(49, 23)
        Me.lblAvgPoints.TabIndex = 26
        Me.lblAvgPoints.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticPointsAgainst
        '
        Me.lblStaticPointsAgainst.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticPointsAgainst.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticPointsAgainst.Location = New System.Drawing.Point(303, 316)
        Me.lblStaticPointsAgainst.Name = "lblStaticPointsAgainst"
        Me.lblStaticPointsAgainst.Size = New System.Drawing.Size(100, 23)
        Me.lblStaticPointsAgainst.TabIndex = 27
        Me.lblStaticPointsAgainst.Text = "Points Against:"
        Me.lblStaticPointsAgainst.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticAvg
        '
        Me.lblStaticAvg.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticAvg.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticAvg.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticAvg.Location = New System.Drawing.Point(300, 275)
        Me.lblStaticAvg.Name = "lblStaticAvg"
        Me.lblStaticAvg.Size = New System.Drawing.Size(53, 18)
        Me.lblStaticAvg.TabIndex = 28
        Me.lblStaticAvg.Text = "Average"
        Me.lblStaticAvg.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblWinPerc
        '
        Me.lblWinPerc.BackColor = System.Drawing.Color.Transparent
        Me.lblWinPerc.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblWinPerc.ForeColor = System.Drawing.Color.Lime
        Me.lblWinPerc.Location = New System.Drawing.Point(303, 402)
        Me.lblWinPerc.Name = "lblWinPerc"
        Me.lblWinPerc.Size = New System.Drawing.Size(63, 23)
        Me.lblWinPerc.TabIndex = 29
        Me.lblWinPerc.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticWinPerc
        '
        Me.lblStaticWinPerc.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticWinPerc.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticWinPerc.Location = New System.Drawing.Point(303, 379)
        Me.lblStaticWinPerc.Name = "lblStaticWinPerc"
        Me.lblStaticWinPerc.Size = New System.Drawing.Size(63, 23)
        Me.lblStaticWinPerc.TabIndex = 30
        Me.lblStaticWinPerc.Text = "Win %"
        Me.lblStaticWinPerc.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticWL
        '
        Me.lblStaticWL.AutoSize = True
        Me.lblStaticWL.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticWL.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticWL.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticWL.Location = New System.Drawing.Point(334, 221)
        Me.lblStaticWL.Name = "lblStaticWL"
        Me.lblStaticWL.Size = New System.Drawing.Size(69, 13)
        Me.lblStaticWL.TabIndex = 33
        Me.lblStaticWL.Text = "Win / Loss"
        '
        'lblMainWinLoss
        '
        Me.lblMainWinLoss.BackColor = System.Drawing.Color.Transparent
        Me.lblMainWinLoss.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblMainWinLoss.ForeColor = System.Drawing.Color.Lime
        Me.lblMainWinLoss.Location = New System.Drawing.Point(322, 234)
        Me.lblMainWinLoss.Name = "lblMainWinLoss"
        Me.lblMainWinLoss.Size = New System.Drawing.Size(85, 23)
        Me.lblMainWinLoss.TabIndex = 40
        Me.lblMainWinLoss.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'btnEdit
        '
        Me.btnEdit.BackColor = System.Drawing.Color.Lime
        Me.btnEdit.Enabled = False
        Me.btnEdit.Location = New System.Drawing.Point(89, 263)
        Me.btnEdit.Name = "btnEdit"
        Me.btnEdit.Size = New System.Drawing.Size(75, 23)
        Me.btnEdit.TabIndex = 42
        Me.btnEdit.Text = "Edit Line"
        Me.btnEdit.UseVisualStyleBackColor = False
        '
        'lblStaticTie
        '
        Me.lblStaticTie.AutoSize = True
        Me.lblStaticTie.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticTie.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticTie.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticTie.Location = New System.Drawing.Point(291, 221)
        Me.lblStaticTie.Name = "lblStaticTie"
        Me.lblStaticTie.Size = New System.Drawing.Size(25, 13)
        Me.lblStaticTie.TabIndex = 45
        Me.lblStaticTie.Text = "Tie"
        '
        'lblTie
        '
        Me.lblTie.BackColor = System.Drawing.Color.Transparent
        Me.lblTie.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblTie.ForeColor = System.Drawing.Color.Lime
        Me.lblTie.Location = New System.Drawing.Point(288, 234)
        Me.lblTie.Name = "lblTie"
        Me.lblTie.Size = New System.Drawing.Size(28, 23)
        Me.lblTie.TabIndex = 46
        Me.lblTie.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'txtHomeScore
        '
        Me.txtHomeScore.BackColor = System.Drawing.Color.Lime
        Me.txtHomeScore.Location = New System.Drawing.Point(232, 482)
        Me.txtHomeScore.Name = "txtHomeScore"
        Me.txtHomeScore.Size = New System.Drawing.Size(38, 20)
        Me.txtHomeScore.TabIndex = 47
        Me.txtHomeScore.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'txtAwayScore
        '
        Me.txtAwayScore.BackColor = System.Drawing.Color.Lime
        Me.txtAwayScore.Location = New System.Drawing.Point(412, 482)
        Me.txtAwayScore.Name = "txtAwayScore"
        Me.txtAwayScore.Size = New System.Drawing.Size(38, 20)
        Me.txtAwayScore.TabIndex = 48
        Me.txtAwayScore.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'lblStaticTotal
        '
        Me.lblStaticTotal.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticTotal.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticTotal.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticTotal.Location = New System.Drawing.Point(359, 278)
        Me.lblStaticTotal.Name = "lblStaticTotal"
        Me.lblStaticTotal.Size = New System.Drawing.Size(46, 12)
        Me.lblStaticTotal.TabIndex = 49
        Me.lblStaticTotal.Text = "Total"
        Me.lblStaticTotal.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblTotalPoints
        '
        Me.lblTotalPoints.BackColor = System.Drawing.Color.Transparent
        Me.lblTotalPoints.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblTotalPoints.ForeColor = System.Drawing.Color.Lime
        Me.lblTotalPoints.Location = New System.Drawing.Point(358, 293)
        Me.lblTotalPoints.Name = "lblTotalPoints"
        Me.lblTotalPoints.Size = New System.Drawing.Size(49, 23)
        Me.lblTotalPoints.TabIndex = 50
        Me.lblTotalPoints.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblOppPoints
        '
        Me.lblOppPoints.BackColor = System.Drawing.Color.Transparent
        Me.lblOppPoints.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblOppPoints.ForeColor = System.Drawing.Color.Lime
        Me.lblOppPoints.Location = New System.Drawing.Point(358, 356)
        Me.lblOppPoints.Name = "lblOppPoints"
        Me.lblOppPoints.Size = New System.Drawing.Size(49, 23)
        Me.lblOppPoints.TabIndex = 51
        Me.lblOppPoints.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticAvg2
        '
        Me.lblStaticAvg2.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticAvg2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticAvg2.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticAvg2.Location = New System.Drawing.Point(299, 335)
        Me.lblStaticAvg2.Name = "lblStaticAvg2"
        Me.lblStaticAvg2.Size = New System.Drawing.Size(53, 18)
        Me.lblStaticAvg2.TabIndex = 52
        Me.lblStaticAvg2.Text = "Average"
        Me.lblStaticAvg2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticTotal2
        '
        Me.lblStaticTotal2.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticTotal2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticTotal2.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticTotal2.Location = New System.Drawing.Point(357, 338)
        Me.lblStaticTotal2.Name = "lblStaticTotal2"
        Me.lblStaticTotal2.Size = New System.Drawing.Size(46, 12)
        Me.lblStaticTotal2.TabIndex = 53
        Me.lblStaticTotal2.Text = "Total"
        Me.lblStaticTotal2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblVs
        '
        Me.lblVs.BackColor = System.Drawing.Color.Transparent
        Me.lblVs.Font = New System.Drawing.Font("Segoe Print", 36.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblVs.ForeColor = System.Drawing.Color.Lime
        Me.lblVs.Location = New System.Drawing.Point(662, 129)
        Me.lblVs.Name = "lblVs"
        Me.lblVs.Size = New System.Drawing.Size(113, 68)
        Me.lblVs.TabIndex = 54
        Me.lblVs.Text = "Vs."
        Me.lblVs.TextAlign = System.Drawing.ContentAlignment.BottomRight
        '
        'lblStaticVsTotal2
        '
        Me.lblStaticVsTotal2.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsTotal2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsTotal2.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsTotal2.Location = New System.Drawing.Point(792, 239)
        Me.lblStaticVsTotal2.Name = "lblStaticVsTotal2"
        Me.lblStaticVsTotal2.Size = New System.Drawing.Size(46, 12)
        Me.lblStaticVsTotal2.TabIndex = 70
        Me.lblStaticVsTotal2.Text = "Total"
        Me.lblStaticVsTotal2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsAvg2
        '
        Me.lblStaticVsAvg2.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsAvg2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsAvg2.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsAvg2.Location = New System.Drawing.Point(734, 236)
        Me.lblStaticVsAvg2.Name = "lblStaticVsAvg2"
        Me.lblStaticVsAvg2.Size = New System.Drawing.Size(53, 18)
        Me.lblStaticVsAvg2.TabIndex = 69
        Me.lblStaticVsAvg2.Text = "Average"
        Me.lblStaticVsAvg2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblCompOppTotal
        '
        Me.lblCompOppTotal.BackColor = System.Drawing.Color.Transparent
        Me.lblCompOppTotal.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompOppTotal.ForeColor = System.Drawing.Color.Lime
        Me.lblCompOppTotal.Location = New System.Drawing.Point(793, 257)
        Me.lblCompOppTotal.Name = "lblCompOppTotal"
        Me.lblCompOppTotal.Size = New System.Drawing.Size(49, 23)
        Me.lblCompOppTotal.TabIndex = 68
        Me.lblCompOppTotal.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblCompTotal
        '
        Me.lblCompTotal.BackColor = System.Drawing.Color.Transparent
        Me.lblCompTotal.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompTotal.ForeColor = System.Drawing.Color.Lime
        Me.lblCompTotal.Location = New System.Drawing.Point(680, 258)
        Me.lblCompTotal.Name = "lblCompTotal"
        Me.lblCompTotal.Size = New System.Drawing.Size(49, 23)
        Me.lblCompTotal.TabIndex = 67
        Me.lblCompTotal.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsTotal
        '
        Me.lblStaticVsTotal.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsTotal.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsTotal.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsTotal.Location = New System.Drawing.Point(681, 243)
        Me.lblStaticVsTotal.Name = "lblStaticVsTotal"
        Me.lblStaticVsTotal.Size = New System.Drawing.Size(46, 12)
        Me.lblStaticVsTotal.TabIndex = 66
        Me.lblStaticVsTotal.Text = "Total"
        Me.lblStaticVsTotal.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblCompTie
        '
        Me.lblCompTie.BackColor = System.Drawing.Color.Transparent
        Me.lblCompTie.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompTie.ForeColor = System.Drawing.Color.Lime
        Me.lblCompTie.Location = New System.Drawing.Point(795, 197)
        Me.lblCompTie.Name = "lblCompTie"
        Me.lblCompTie.Size = New System.Drawing.Size(28, 23)
        Me.lblCompTie.TabIndex = 65
        Me.lblCompTie.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsTie
        '
        Me.lblStaticVsTie.AutoSize = True
        Me.lblStaticVsTie.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsTie.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsTie.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsTie.Location = New System.Drawing.Point(798, 184)
        Me.lblStaticVsTie.Name = "lblStaticVsTie"
        Me.lblStaticVsTie.Size = New System.Drawing.Size(25, 13)
        Me.lblStaticVsTie.TabIndex = 64
        Me.lblStaticVsTie.Text = "Tie"
        '
        'lblCompWinLoss
        '
        Me.lblCompWinLoss.BackColor = System.Drawing.Color.Transparent
        Me.lblCompWinLoss.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompWinLoss.ForeColor = System.Drawing.Color.Lime
        Me.lblCompWinLoss.Location = New System.Drawing.Point(826, 197)
        Me.lblCompWinLoss.Name = "lblCompWinLoss"
        Me.lblCompWinLoss.Size = New System.Drawing.Size(85, 23)
        Me.lblCompWinLoss.TabIndex = 63
        Me.lblCompWinLoss.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsWL
        '
        Me.lblStaticVsWL.AutoSize = True
        Me.lblStaticVsWL.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsWL.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsWL.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsWL.Location = New System.Drawing.Point(835, 184)
        Me.lblStaticVsWL.Name = "lblStaticVsWL"
        Me.lblStaticVsWL.Size = New System.Drawing.Size(69, 13)
        Me.lblStaticVsWL.TabIndex = 62
        Me.lblStaticVsWL.Text = "Win / Loss"
        '
        'lblStaticVsWinPerc
        '
        Me.lblStaticVsWinPerc.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsWinPerc.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsWinPerc.Location = New System.Drawing.Point(848, 234)
        Me.lblStaticVsWinPerc.Name = "lblStaticVsWinPerc"
        Me.lblStaticVsWinPerc.Size = New System.Drawing.Size(63, 23)
        Me.lblStaticVsWinPerc.TabIndex = 61
        Me.lblStaticVsWinPerc.Text = "Win %"
        Me.lblStaticVsWinPerc.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblCompWinPerc
        '
        Me.lblCompWinPerc.BackColor = System.Drawing.Color.Transparent
        Me.lblCompWinPerc.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompWinPerc.ForeColor = System.Drawing.Color.Lime
        Me.lblCompWinPerc.Location = New System.Drawing.Point(848, 258)
        Me.lblCompWinPerc.Name = "lblCompWinPerc"
        Me.lblCompWinPerc.Size = New System.Drawing.Size(63, 23)
        Me.lblCompWinPerc.TabIndex = 60
        Me.lblCompWinPerc.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsAvg
        '
        Me.lblStaticVsAvg.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsAvg.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsAvg.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsAvg.Location = New System.Drawing.Point(622, 240)
        Me.lblStaticVsAvg.Name = "lblStaticVsAvg"
        Me.lblStaticVsAvg.Size = New System.Drawing.Size(53, 18)
        Me.lblStaticVsAvg.TabIndex = 59
        Me.lblStaticVsAvg.Text = "Average"
        Me.lblStaticVsAvg.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsPointsOpp
        '
        Me.lblStaticVsPointsOpp.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsPointsOpp.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsPointsOpp.Location = New System.Drawing.Point(738, 218)
        Me.lblStaticVsPointsOpp.Name = "lblStaticVsPointsOpp"
        Me.lblStaticVsPointsOpp.Size = New System.Drawing.Size(100, 20)
        Me.lblStaticVsPointsOpp.TabIndex = 58
        Me.lblStaticVsPointsOpp.Text = "Points Against:"
        Me.lblStaticVsPointsOpp.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblCompAvg
        '
        Me.lblCompAvg.BackColor = System.Drawing.Color.Transparent
        Me.lblCompAvg.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompAvg.ForeColor = System.Drawing.Color.Lime
        Me.lblCompAvg.Location = New System.Drawing.Point(625, 258)
        Me.lblCompAvg.Name = "lblCompAvg"
        Me.lblCompAvg.Size = New System.Drawing.Size(49, 23)
        Me.lblCompAvg.TabIndex = 57
        Me.lblCompAvg.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblCompOppAvg
        '
        Me.lblCompOppAvg.BackColor = System.Drawing.Color.Transparent
        Me.lblCompOppAvg.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCompOppAvg.ForeColor = System.Drawing.Color.Lime
        Me.lblCompOppAvg.Location = New System.Drawing.Point(737, 257)
        Me.lblCompOppAvg.Name = "lblCompOppAvg"
        Me.lblCompOppAvg.Size = New System.Drawing.Size(49, 23)
        Me.lblCompOppAvg.TabIndex = 56
        Me.lblCompOppAvg.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblStaticVsPoints4
        '
        Me.lblStaticVsPoints4.BackColor = System.Drawing.Color.Transparent
        Me.lblStaticVsPoints4.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticVsPoints4.ForeColor = System.Drawing.Color.Lime
        Me.lblStaticVsPoints4.Location = New System.Drawing.Point(648, 221)
        Me.lblStaticVsPoints4.Name = "lblStaticVsPoints4"
        Me.lblStaticVsPoints4.Size = New System.Drawing.Size(69, 27)
        Me.lblStaticVsPoints4.TabIndex = 55
        Me.lblStaticVsPoints4.Text = "Points For:"
        Me.lblStaticVsPoints4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblSeahaawks
        '
        Me.lblSeahaawks.BackColor = System.Drawing.Color.Transparent
        Me.lblSeahaawks.Font = New System.Drawing.Font("Segoe Print", 48.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSeahaawks.ForeColor = System.Drawing.Color.Lime
        Me.lblSeahaawks.Location = New System.Drawing.Point(265, 40)
        Me.lblSeahaawks.Name = "lblSeahaawks"
        Me.lblSeahaawks.Size = New System.Drawing.Size(391, 112)
        Me.lblSeahaawks.TabIndex = 71
        Me.lblSeahaawks.Text = "Seahawks"
        Me.lblSeahaawks.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'mspHawks
        '
        Me.mspHawks.BackColor = System.Drawing.Color.MidnightBlue
        Me.mspHawks.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.tsmFile, Me.tsmHelp})
        Me.mspHawks.Location = New System.Drawing.Point(0, 0)
        Me.mspHawks.Name = "mspHawks"
        Me.mspHawks.Size = New System.Drawing.Size(920, 24)
        Me.mspHawks.TabIndex = 72
        Me.mspHawks.Text = "mspHawks"
        '
        'tsmFile
        '
        Me.tsmFile.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.tsmSave, Me.tsmExit})
        Me.tsmFile.ForeColor = System.Drawing.Color.Lime
        Me.tsmFile.Name = "tsmFile"
        Me.tsmFile.Size = New System.Drawing.Size(37, 20)
        Me.tsmFile.Text = "File"
        '
        'tsmSave
        '
        Me.tsmSave.BackColor = System.Drawing.Color.MidnightBlue
        Me.tsmSave.ForeColor = System.Drawing.Color.Lime
        Me.tsmSave.Name = "tsmSave"
        Me.tsmSave.Size = New System.Drawing.Size(98, 22)
        Me.tsmSave.Text = "Save"
        '
        'tsmExit
        '
        Me.tsmExit.BackColor = System.Drawing.Color.MidnightBlue
        Me.tsmExit.ForeColor = System.Drawing.Color.Lime
        Me.tsmExit.Name = "tsmExit"
        Me.tsmExit.Size = New System.Drawing.Size(98, 22)
        Me.tsmExit.Text = "Exit"
        '
        'tsmHelp
        '
        Me.tsmHelp.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.tsmAbout})
        Me.tsmHelp.ForeColor = System.Drawing.Color.Lime
        Me.tsmHelp.Name = "tsmHelp"
        Me.tsmHelp.Size = New System.Drawing.Size(44, 20)
        Me.tsmHelp.Text = "Help"
        '
        'tsmAbout
        '
        Me.tsmAbout.BackColor = System.Drawing.Color.MidnightBlue
        Me.tsmAbout.ForeColor = System.Drawing.Color.Lime
        Me.tsmAbout.Name = "tsmAbout"
        Me.tsmAbout.Size = New System.Drawing.Size(107, 22)
        Me.tsmAbout.Text = "About"
        '
        'dtpDate
        '
        Me.dtpDate.CalendarForeColor = System.Drawing.Color.Lime
        Me.dtpDate.CalendarMonthBackground = System.Drawing.Color.Lime
        Me.dtpDate.CalendarTitleBackColor = System.Drawing.Color.Lime
        Me.dtpDate.CalendarTitleForeColor = System.Drawing.Color.Lime
        Me.dtpDate.CalendarTrailingForeColor = System.Drawing.Color.Lime
        Me.dtpDate.CustomFormat = "MM/dd/yy"
        Me.dtpDate.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.dtpDate.Location = New System.Drawing.Point(12, 484)
        Me.dtpDate.Name = "dtpDate"
        Me.dtpDate.Size = New System.Drawing.Size(82, 20)
        Me.dtpDate.TabIndex = 73
        Me.dtpDate.Value = New Date(2015, 11, 28, 0, 0, 0, 0)
        '
        'btnExit
        '
        Me.btnExit.BackColor = System.Drawing.Color.Lime
        Me.btnExit.Location = New System.Drawing.Point(836, 502)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 23)
        Me.btnExit.TabIndex = 74
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = False
        '
        'frmHawks
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = Global.HawksWinLoss.My.Resources.Resources.seattleseahawks
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.ClientSize = New System.Drawing.Size(920, 542)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.dtpDate)
        Me.Controls.Add(Me.lblSeahaawks)
        Me.Controls.Add(Me.lblStaticVsTotal2)
        Me.Controls.Add(Me.lblStaticVsAvg2)
        Me.Controls.Add(Me.lblCompOppTotal)
        Me.Controls.Add(Me.lblCompTotal)
        Me.Controls.Add(Me.lblStaticVsTotal)
        Me.Controls.Add(Me.lblCompTie)
        Me.Controls.Add(Me.lblStaticVsTie)
        Me.Controls.Add(Me.lblCompWinLoss)
        Me.Controls.Add(Me.lblStaticVsWL)
        Me.Controls.Add(Me.lblStaticVsWinPerc)
        Me.Controls.Add(Me.lblCompWinPerc)
        Me.Controls.Add(Me.lblStaticVsAvg)
        Me.Controls.Add(Me.lblStaticVsPointsOpp)
        Me.Controls.Add(Me.lblCompAvg)
        Me.Controls.Add(Me.lblCompOppAvg)
        Me.Controls.Add(Me.lblStaticVsPoints4)
        Me.Controls.Add(Me.lblVs)
        Me.Controls.Add(Me.lblStaticTotal2)
        Me.Controls.Add(Me.lblStaticAvg2)
        Me.Controls.Add(Me.lblOppPoints)
        Me.Controls.Add(Me.lblTotalPoints)
        Me.Controls.Add(Me.lblStaticTotal)
        Me.Controls.Add(Me.txtAwayScore)
        Me.Controls.Add(Me.txtHomeScore)
        Me.Controls.Add(Me.lblTie)
        Me.Controls.Add(Me.lblStaticTie)
        Me.Controls.Add(Me.btnEdit)
        Me.Controls.Add(Me.lblMainWinLoss)
        Me.Controls.Add(Me.lblStaticWL)
        Me.Controls.Add(Me.lblStaticWinPerc)
        Me.Controls.Add(Me.lblWinPerc)
        Me.Controls.Add(Me.lblStaticAvg)
        Me.Controls.Add(Me.lblStaticPointsAgainst)
        Me.Controls.Add(Me.lblAvgPoints)
        Me.Controls.Add(Me.lblAvgOppPoints)
        Me.Controls.Add(Me.lblStaticPoint4)
        Me.Controls.Add(Me.lbxCompare)
        Me.Controls.Add(Me.cbxCompare)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.cbxAway)
        Me.Controls.Add(Me.cbxHome)
        Me.Controls.Add(Me.lbxScores)
        Me.Controls.Add(Me.lblStaticAscore)
        Me.Controls.Add(Me.lblStaticAway)
        Me.Controls.Add(Me.lblStaticHscore)
        Me.Controls.Add(Me.lblStaticHome)
        Me.Controls.Add(Me.lblStaticDate)
        Me.Controls.Add(Me.mspHawks)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.MainMenuStrip = Me.mspHawks
        Me.MaximizeBox = False
        Me.MaximumSize = New System.Drawing.Size(936, 580)
        Me.MinimumSize = New System.Drawing.Size(936, 580)
        Me.Name = "frmHawks"
        Me.Text = "Seahawks Since Signing Russell Wilson"
        Me.mspHawks.ResumeLayout(False)
        Me.mspHawks.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents lblStaticDate As System.Windows.Forms.Label
    Friend WithEvents lblStaticHome As System.Windows.Forms.Label
    Friend WithEvents lblStaticHscore As System.Windows.Forms.Label
    Friend WithEvents lblStaticAway As System.Windows.Forms.Label
    Friend WithEvents lblStaticAscore As System.Windows.Forms.Label
    Friend WithEvents lbxScores As System.Windows.Forms.ListBox
    Friend WithEvents cbxHome As System.Windows.Forms.ComboBox
    Friend WithEvents cbxAway As System.Windows.Forms.ComboBox
    Friend WithEvents btnAdd As System.Windows.Forms.Button
    Friend WithEvents btnDelete As System.Windows.Forms.Button
    Friend WithEvents cbxCompare As System.Windows.Forms.ComboBox
    Friend WithEvents lbxCompare As System.Windows.Forms.ListBox
    Friend WithEvents lblStaticPoint4 As System.Windows.Forms.Label
    Friend WithEvents lblAvgOppPoints As System.Windows.Forms.Label
    Friend WithEvents lblAvgPoints As System.Windows.Forms.Label
    Friend WithEvents lblStaticPointsAgainst As System.Windows.Forms.Label
    Friend WithEvents lblStaticAvg As System.Windows.Forms.Label
    Friend WithEvents lblWinPerc As System.Windows.Forms.Label
    Friend WithEvents lblStaticWinPerc As System.Windows.Forms.Label
    Friend WithEvents lblStaticWL As System.Windows.Forms.Label
    Friend WithEvents lblMainWinLoss As System.Windows.Forms.Label
    Friend WithEvents btnEdit As System.Windows.Forms.Button
    Friend WithEvents lblStaticTie As System.Windows.Forms.Label
    Friend WithEvents lblTie As System.Windows.Forms.Label
    Friend WithEvents txtHomeScore As System.Windows.Forms.TextBox
    Friend WithEvents txtAwayScore As System.Windows.Forms.TextBox
    Friend WithEvents lblStaticTotal As System.Windows.Forms.Label
    Friend WithEvents lblTotalPoints As System.Windows.Forms.Label
    Friend WithEvents lblOppPoints As System.Windows.Forms.Label
    Friend WithEvents lblStaticAvg2 As System.Windows.Forms.Label
    Friend WithEvents lblStaticTotal2 As System.Windows.Forms.Label
    Friend WithEvents lblVs As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsTotal2 As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsAvg2 As System.Windows.Forms.Label
    Friend WithEvents lblCompOppTotal As System.Windows.Forms.Label
    Friend WithEvents lblCompTotal As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsTotal As System.Windows.Forms.Label
    Friend WithEvents lblCompTie As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsTie As System.Windows.Forms.Label
    Friend WithEvents lblCompWinLoss As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsWL As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsWinPerc As System.Windows.Forms.Label
    Friend WithEvents lblCompWinPerc As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsAvg As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsPointsOpp As System.Windows.Forms.Label
    Friend WithEvents lblCompAvg As System.Windows.Forms.Label
    Friend WithEvents lblCompOppAvg As System.Windows.Forms.Label
    Friend WithEvents lblStaticVsPoints4 As System.Windows.Forms.Label
    Friend WithEvents lblSeahaawks As System.Windows.Forms.Label
    Friend WithEvents mspHawks As System.Windows.Forms.MenuStrip
    Friend WithEvents tsmFile As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents tsmSave As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents tsmExit As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents tsmHelp As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents tsmAbout As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents dtpDate As System.Windows.Forms.DateTimePicker
    Friend WithEvents btnExit As System.Windows.Forms.Button

End Class
