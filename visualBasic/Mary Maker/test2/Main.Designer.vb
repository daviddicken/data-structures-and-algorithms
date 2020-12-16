<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmMary
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
        Me.gprHold = New System.Windows.Forms.GroupBox()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.grpShots = New System.Windows.Forms.GroupBox()
        Me.rdoNone = New System.Windows.Forms.RadioButton()
        Me.rdoTriple = New System.Windows.Forms.RadioButton()
        Me.rdoDouble = New System.Windows.Forms.RadioButton()
        Me.rdoSingle = New System.Windows.Forms.RadioButton()
        Me.grpBurger = New System.Windows.Forms.GroupBox()
        Me.rdoBurgerNo = New System.Windows.Forms.RadioButton()
        Me.rdoBurgerYes = New System.Windows.Forms.RadioButton()
        Me.grpRocks = New System.Windows.Forms.GroupBox()
        Me.rdoNo = New System.Windows.Forms.RadioButton()
        Me.rdoYes = New System.Windows.Forms.RadioButton()
        Me.grpSpice = New System.Windows.Forms.GroupBox()
        Me.rdoSpicy = New System.Windows.Forms.RadioButton()
        Me.rdoHot = New System.Windows.Forms.RadioButton()
        Me.rdoMild = New System.Windows.Forms.RadioButton()
        Me.rdoBland = New System.Windows.Forms.RadioButton()
        Me.grpRim = New System.Windows.Forms.GroupBox()
        Me.rdoNoSalt = New System.Windows.Forms.RadioButton()
        Me.rdoOldBay = New System.Windows.Forms.RadioButton()
        Me.rdoBBQrub = New System.Windows.Forms.RadioButton()
        Me.rdoBacSalt = New System.Windows.Forms.RadioButton()
        Me.rdoCelsalt = New System.Windows.Forms.RadioButton()
        Me.rdoSalt = New System.Windows.Forms.RadioButton()
        Me.grpBase = New System.Windows.Forms.GroupBox()
        Me.rdoClam = New System.Windows.Forms.RadioButton()
        Me.rdoTom = New System.Windows.Forms.RadioButton()
        Me.grpLiquor = New System.Windows.Forms.GroupBox()
        Me.rdoVirgin = New System.Windows.Forms.RadioButton()
        Me.rdoRum = New System.Windows.Forms.RadioButton()
        Me.rdoWhiskey = New System.Windows.Forms.RadioButton()
        Me.rdoTequila = New System.Windows.Forms.RadioButton()
        Me.rdoVodka = New System.Windows.Forms.RadioButton()
        Me.grpGarnish = New System.Windows.Forms.GroupBox()
        Me.ckbCelery = New System.Windows.Forms.CheckBox()
        Me.ckbPeperoni = New System.Windows.Forms.CheckBox()
        Me.ckbAsparagus = New System.Windows.Forms.CheckBox()
        Me.ckbLime = New System.Windows.Forms.CheckBox()
        Me.ckbJalapenos = New System.Windows.Forms.CheckBox()
        Me.ckbOnions = New System.Windows.Forms.CheckBox()
        Me.ckbBacon = New System.Windows.Forms.CheckBox()
        Me.ckbOlives = New System.Windows.Forms.CheckBox()
        Me.ckbPrawns = New System.Windows.Forms.CheckBox()
        Me.ckbPickle = New System.Windows.Forms.CheckBox()
        Me.ckbLemon = New System.Windows.Forms.CheckBox()
        Me.ckbBeans = New System.Windows.Forms.CheckBox()
        Me.btnMix = New System.Windows.Forms.Button()
        Me.grpSize = New System.Windows.Forms.GroupBox()
        Me.rdoS22oz = New System.Windows.Forms.RadioButton()
        Me.rdoS16oz = New System.Windows.Forms.RadioButton()
        Me.rdoS8oz = New System.Windows.Forms.RadioButton()
        Me.lblGrandTotal = New System.Windows.Forms.Label()
        Me.lblName = New System.Windows.Forms.Label()
        Me.pcbDrink = New System.Windows.Forms.PictureBox()
        Me.lblSubName = New System.Windows.Forms.Label()
        Me.lblSummary = New System.Windows.Forms.Label()
        Me.lblTax = New System.Windows.Forms.Label()
        Me.lblSubTotal = New System.Windows.Forms.Label()
        Me.lblStaticSub = New System.Windows.Forms.Label()
        Me.lblStaticTax = New System.Windows.Forms.Label()
        Me.lblStaticGrand = New System.Windows.Forms.Label()
        Me.lblSuggTip = New System.Windows.Forms.Label()
        Me.btnOrderExit = New System.Windows.Forms.Button()
        Me.btnReCalc = New System.Windows.Forms.Button()
        Me.nudTip = New System.Windows.Forms.NumericUpDown()
        Me.gprHold.SuspendLayout()
        Me.grpShots.SuspendLayout()
        Me.grpBurger.SuspendLayout()
        Me.grpRocks.SuspendLayout()
        Me.grpSpice.SuspendLayout()
        Me.grpRim.SuspendLayout()
        Me.grpBase.SuspendLayout()
        Me.grpLiquor.SuspendLayout()
        Me.grpGarnish.SuspendLayout()
        Me.grpSize.SuspendLayout()
        CType(Me.pcbDrink, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.nudTip, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'gprHold
        '
        Me.gprHold.Controls.Add(Me.btnClear)
        Me.gprHold.Controls.Add(Me.grpShots)
        Me.gprHold.Controls.Add(Me.grpBurger)
        Me.gprHold.Controls.Add(Me.grpRocks)
        Me.gprHold.Controls.Add(Me.grpSpice)
        Me.gprHold.Controls.Add(Me.grpRim)
        Me.gprHold.Controls.Add(Me.grpBase)
        Me.gprHold.Controls.Add(Me.grpLiquor)
        Me.gprHold.Controls.Add(Me.grpGarnish)
        Me.gprHold.Controls.Add(Me.btnMix)
        Me.gprHold.Controls.Add(Me.grpSize)
        Me.gprHold.Font = New System.Drawing.Font("Segoe Print", 8.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gprHold.Location = New System.Drawing.Point(36, 12)
        Me.gprHold.Name = "gprHold"
        Me.gprHold.Size = New System.Drawing.Size(216, 735)
        Me.gprHold.TabIndex = 0
        Me.gprHold.TabStop = False
        Me.gprHold.Text = "Build Your Drink:"
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(30, 706)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 23)
        Me.btnClear.TabIndex = 12
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'grpShots
        '
        Me.grpShots.Controls.Add(Me.rdoNone)
        Me.grpShots.Controls.Add(Me.rdoTriple)
        Me.grpShots.Controls.Add(Me.rdoDouble)
        Me.grpShots.Controls.Add(Me.rdoSingle)
        Me.grpShots.Location = New System.Drawing.Point(6, 132)
        Me.grpShots.Name = "grpShots"
        Me.grpShots.Size = New System.Drawing.Size(200, 66)
        Me.grpShots.TabIndex = 11
        Me.grpShots.TabStop = False
        Me.grpShots.Text = "Shots"
        '
        'rdoNone
        '
        Me.rdoNone.AutoSize = True
        Me.rdoNone.Location = New System.Drawing.Point(9, 37)
        Me.rdoNone.Name = "rdoNone"
        Me.rdoNone.Size = New System.Drawing.Size(55, 23)
        Me.rdoNone.TabIndex = 9
        Me.rdoNone.Text = "None"
        Me.rdoNone.UseVisualStyleBackColor = True
        '
        'rdoTriple
        '
        Me.rdoTriple.AutoSize = True
        Me.rdoTriple.Location = New System.Drawing.Point(123, 16)
        Me.rdoTriple.Name = "rdoTriple"
        Me.rdoTriple.Size = New System.Drawing.Size(59, 23)
        Me.rdoTriple.TabIndex = 8
        Me.rdoTriple.Text = "Triple"
        Me.rdoTriple.UseVisualStyleBackColor = True
        '
        'rdoDouble
        '
        Me.rdoDouble.AutoSize = True
        Me.rdoDouble.Checked = True
        Me.rdoDouble.Location = New System.Drawing.Point(63, 16)
        Me.rdoDouble.Name = "rdoDouble"
        Me.rdoDouble.Size = New System.Drawing.Size(64, 23)
        Me.rdoDouble.TabIndex = 7
        Me.rdoDouble.TabStop = True
        Me.rdoDouble.Text = "Double"
        Me.rdoDouble.UseVisualStyleBackColor = True
        '
        'rdoSingle
        '
        Me.rdoSingle.AutoSize = True
        Me.rdoSingle.Location = New System.Drawing.Point(9, 16)
        Me.rdoSingle.Name = "rdoSingle"
        Me.rdoSingle.Size = New System.Drawing.Size(59, 23)
        Me.rdoSingle.TabIndex = 6
        Me.rdoSingle.Text = "Single"
        Me.rdoSingle.UseVisualStyleBackColor = True
        '
        'grpBurger
        '
        Me.grpBurger.Controls.Add(Me.rdoBurgerNo)
        Me.grpBurger.Controls.Add(Me.rdoBurgerYes)
        Me.grpBurger.Location = New System.Drawing.Point(9, 657)
        Me.grpBurger.Name = "grpBurger"
        Me.grpBurger.Size = New System.Drawing.Size(200, 47)
        Me.grpBurger.TabIndex = 7
        Me.grpBurger.TabStop = False
        Me.grpBurger.Text = "Burger"
        '
        'rdoBurgerNo
        '
        Me.rdoBurgerNo.AutoSize = True
        Me.rdoBurgerNo.Checked = True
        Me.rdoBurgerNo.Location = New System.Drawing.Point(120, 18)
        Me.rdoBurgerNo.Name = "rdoBurgerNo"
        Me.rdoBurgerNo.Size = New System.Drawing.Size(42, 23)
        Me.rdoBurgerNo.TabIndex = 1
        Me.rdoBurgerNo.TabStop = True
        Me.rdoBurgerNo.Text = "No"
        Me.rdoBurgerNo.UseVisualStyleBackColor = True
        '
        'rdoBurgerYes
        '
        Me.rdoBurgerYes.AutoSize = True
        Me.rdoBurgerYes.Location = New System.Drawing.Point(11, 18)
        Me.rdoBurgerYes.Name = "rdoBurgerYes"
        Me.rdoBurgerYes.Size = New System.Drawing.Size(45, 23)
        Me.rdoBurgerYes.TabIndex = 0
        Me.rdoBurgerYes.Text = "Yes"
        Me.rdoBurgerYes.UseVisualStyleBackColor = True
        '
        'grpRocks
        '
        Me.grpRocks.Controls.Add(Me.rdoNo)
        Me.grpRocks.Controls.Add(Me.rdoYes)
        Me.grpRocks.Location = New System.Drawing.Point(6, 76)
        Me.grpRocks.Name = "grpRocks"
        Me.grpRocks.Size = New System.Drawing.Size(200, 50)
        Me.grpRocks.TabIndex = 0
        Me.grpRocks.TabStop = False
        Me.grpRocks.Text = "Rocks"
        '
        'rdoNo
        '
        Me.rdoNo.AutoSize = True
        Me.rdoNo.Location = New System.Drawing.Point(124, 17)
        Me.rdoNo.Name = "rdoNo"
        Me.rdoNo.Size = New System.Drawing.Size(42, 23)
        Me.rdoNo.TabIndex = 3
        Me.rdoNo.Text = "No"
        Me.rdoNo.UseVisualStyleBackColor = True
        '
        'rdoYes
        '
        Me.rdoYes.AutoSize = True
        Me.rdoYes.Checked = True
        Me.rdoYes.Location = New System.Drawing.Point(9, 17)
        Me.rdoYes.Name = "rdoYes"
        Me.rdoYes.Size = New System.Drawing.Size(45, 23)
        Me.rdoYes.TabIndex = 2
        Me.rdoYes.TabStop = True
        Me.rdoYes.Text = "Yes"
        Me.rdoYes.UseVisualStyleBackColor = True
        '
        'grpSpice
        '
        Me.grpSpice.Controls.Add(Me.rdoSpicy)
        Me.grpSpice.Controls.Add(Me.rdoHot)
        Me.grpSpice.Controls.Add(Me.rdoMild)
        Me.grpSpice.Controls.Add(Me.rdoBland)
        Me.grpSpice.Location = New System.Drawing.Point(6, 324)
        Me.grpSpice.Name = "grpSpice"
        Me.grpSpice.Size = New System.Drawing.Size(200, 62)
        Me.grpSpice.TabIndex = 6
        Me.grpSpice.TabStop = False
        Me.grpSpice.Text = "Spice"
        '
        'rdoSpicy
        '
        Me.rdoSpicy.AutoSize = True
        Me.rdoSpicy.Location = New System.Drawing.Point(9, 35)
        Me.rdoSpicy.Name = "rdoSpicy"
        Me.rdoSpicy.Size = New System.Drawing.Size(61, 23)
        Me.rdoSpicy.TabIndex = 11
        Me.rdoSpicy.Text = "Woah!"
        Me.rdoSpicy.UseVisualStyleBackColor = True
        '
        'rdoHot
        '
        Me.rdoHot.AutoSize = True
        Me.rdoHot.Location = New System.Drawing.Point(79, 35)
        Me.rdoHot.Name = "rdoHot"
        Me.rdoHot.Size = New System.Drawing.Size(119, 23)
        Me.rdoHot.TabIndex = 10
        Me.rdoHot.Text = "Burn Me Twice!!"
        Me.rdoHot.UseVisualStyleBackColor = True
        '
        'rdoMild
        '
        Me.rdoMild.AutoSize = True
        Me.rdoMild.Location = New System.Drawing.Point(79, 17)
        Me.rdoMild.Name = "rdoMild"
        Me.rdoMild.Size = New System.Drawing.Size(74, 23)
        Me.rdoMild.TabIndex = 9
        Me.rdoMild.Text = "Feelin' It"
        Me.rdoMild.UseVisualStyleBackColor = True
        '
        'rdoBland
        '
        Me.rdoBland.AutoSize = True
        Me.rdoBland.Checked = True
        Me.rdoBland.Location = New System.Drawing.Point(9, 17)
        Me.rdoBland.Name = "rdoBland"
        Me.rdoBland.Size = New System.Drawing.Size(55, 23)
        Me.rdoBland.TabIndex = 8
        Me.rdoBland.TabStop = True
        Me.rdoBland.Text = "None"
        Me.rdoBland.UseVisualStyleBackColor = True
        '
        'grpRim
        '
        Me.grpRim.Controls.Add(Me.rdoNoSalt)
        Me.grpRim.Controls.Add(Me.rdoOldBay)
        Me.grpRim.Controls.Add(Me.rdoBBQrub)
        Me.grpRim.Controls.Add(Me.rdoBacSalt)
        Me.grpRim.Controls.Add(Me.rdoCelsalt)
        Me.grpRim.Controls.Add(Me.rdoSalt)
        Me.grpRim.Location = New System.Drawing.Point(9, 560)
        Me.grpRim.Name = "grpRim"
        Me.grpRim.Size = New System.Drawing.Size(200, 91)
        Me.grpRim.TabIndex = 4
        Me.grpRim.TabStop = False
        Me.grpRim.Text = "Rim"
        '
        'rdoNoSalt
        '
        Me.rdoNoSalt.AutoSize = True
        Me.rdoNoSalt.Location = New System.Drawing.Point(120, 60)
        Me.rdoNoSalt.Name = "rdoNoSalt"
        Me.rdoNoSalt.Size = New System.Drawing.Size(55, 23)
        Me.rdoNoSalt.TabIndex = 11
        Me.rdoNoSalt.Text = "None"
        Me.rdoNoSalt.UseVisualStyleBackColor = True
        '
        'rdoOldBay
        '
        Me.rdoOldBay.AutoSize = True
        Me.rdoOldBay.Location = New System.Drawing.Point(11, 60)
        Me.rdoOldBay.Name = "rdoOldBay"
        Me.rdoOldBay.Size = New System.Drawing.Size(70, 23)
        Me.rdoOldBay.TabIndex = 10
        Me.rdoOldBay.Text = "Old Bay"
        Me.rdoOldBay.UseVisualStyleBackColor = True
        '
        'rdoBBQrub
        '
        Me.rdoBBQrub.AutoSize = True
        Me.rdoBBQrub.Location = New System.Drawing.Point(120, 37)
        Me.rdoBBQrub.Name = "rdoBBQrub"
        Me.rdoBBQrub.Size = New System.Drawing.Size(75, 23)
        Me.rdoBBQrub.TabIndex = 9
        Me.rdoBBQrub.Text = "BBQ rub"
        Me.rdoBBQrub.UseVisualStyleBackColor = True
        '
        'rdoBacSalt
        '
        Me.rdoBacSalt.AutoSize = True
        Me.rdoBacSalt.Location = New System.Drawing.Point(120, 15)
        Me.rdoBacSalt.Name = "rdoBacSalt"
        Me.rdoBacSalt.Size = New System.Drawing.Size(85, 23)
        Me.rdoBacSalt.TabIndex = 8
        Me.rdoBacSalt.Text = "Bacon Salt"
        Me.rdoBacSalt.UseVisualStyleBackColor = True
        '
        'rdoCelsalt
        '
        Me.rdoCelsalt.AutoSize = True
        Me.rdoCelsalt.Location = New System.Drawing.Point(11, 37)
        Me.rdoCelsalt.Name = "rdoCelsalt"
        Me.rdoCelsalt.Size = New System.Drawing.Size(85, 23)
        Me.rdoCelsalt.TabIndex = 7
        Me.rdoCelsalt.Text = "Celery salt"
        Me.rdoCelsalt.UseVisualStyleBackColor = True
        '
        'rdoSalt
        '
        Me.rdoSalt.AutoSize = True
        Me.rdoSalt.Checked = True
        Me.rdoSalt.Location = New System.Drawing.Point(11, 15)
        Me.rdoSalt.Name = "rdoSalt"
        Me.rdoSalt.Size = New System.Drawing.Size(48, 23)
        Me.rdoSalt.TabIndex = 6
        Me.rdoSalt.TabStop = True
        Me.rdoSalt.Text = "Salt"
        Me.rdoSalt.UseVisualStyleBackColor = True
        '
        'grpBase
        '
        Me.grpBase.Controls.Add(Me.rdoClam)
        Me.grpBase.Controls.Add(Me.rdoTom)
        Me.grpBase.Location = New System.Drawing.Point(6, 204)
        Me.grpBase.Name = "grpBase"
        Me.grpBase.Size = New System.Drawing.Size(200, 46)
        Me.grpBase.TabIndex = 3
        Me.grpBase.TabStop = False
        Me.grpBase.Text = "Base"
        '
        'rdoClam
        '
        Me.rdoClam.AutoSize = True
        Me.rdoClam.Location = New System.Drawing.Point(124, 15)
        Me.rdoClam.Name = "rdoClam"
        Me.rdoClam.Size = New System.Drawing.Size(72, 23)
        Me.rdoClam.TabIndex = 3
        Me.rdoClam.Text = "Clamato"
        Me.rdoClam.UseVisualStyleBackColor = True
        '
        'rdoTom
        '
        Me.rdoTom.AutoSize = True
        Me.rdoTom.Checked = True
        Me.rdoTom.Location = New System.Drawing.Point(9, 15)
        Me.rdoTom.Name = "rdoTom"
        Me.rdoTom.Size = New System.Drawing.Size(68, 23)
        Me.rdoTom.TabIndex = 2
        Me.rdoTom.TabStop = True
        Me.rdoTom.Text = "Tomato"
        Me.rdoTom.UseVisualStyleBackColor = True
        '
        'grpLiquor
        '
        Me.grpLiquor.Controls.Add(Me.rdoVirgin)
        Me.grpLiquor.Controls.Add(Me.rdoRum)
        Me.grpLiquor.Controls.Add(Me.rdoWhiskey)
        Me.grpLiquor.Controls.Add(Me.rdoTequila)
        Me.grpLiquor.Controls.Add(Me.rdoVodka)
        Me.grpLiquor.Location = New System.Drawing.Point(6, 248)
        Me.grpLiquor.Name = "grpLiquor"
        Me.grpLiquor.Size = New System.Drawing.Size(200, 70)
        Me.grpLiquor.TabIndex = 5
        Me.grpLiquor.TabStop = False
        Me.grpLiquor.Text = "Liquor"
        '
        'rdoVirgin
        '
        Me.rdoVirgin.AutoSize = True
        Me.rdoVirgin.Location = New System.Drawing.Point(63, 41)
        Me.rdoVirgin.Name = "rdoVirgin"
        Me.rdoVirgin.Size = New System.Drawing.Size(55, 23)
        Me.rdoVirgin.TabIndex = 9
        Me.rdoVirgin.Text = "None"
        Me.rdoVirgin.UseVisualStyleBackColor = True
        '
        'rdoRum
        '
        Me.rdoRum.AutoSize = True
        Me.rdoRum.Location = New System.Drawing.Point(9, 41)
        Me.rdoRum.Name = "rdoRum"
        Me.rdoRum.Size = New System.Drawing.Size(53, 23)
        Me.rdoRum.TabIndex = 8
        Me.rdoRum.Text = "Rum"
        Me.rdoRum.UseVisualStyleBackColor = True
        '
        'rdoWhiskey
        '
        Me.rdoWhiskey.AutoSize = True
        Me.rdoWhiskey.Location = New System.Drawing.Point(124, 17)
        Me.rdoWhiskey.Name = "rdoWhiskey"
        Me.rdoWhiskey.Size = New System.Drawing.Size(71, 23)
        Me.rdoWhiskey.TabIndex = 7
        Me.rdoWhiskey.Text = "Whiskey"
        Me.rdoWhiskey.UseVisualStyleBackColor = True
        '
        'rdoTequila
        '
        Me.rdoTequila.AutoSize = True
        Me.rdoTequila.Location = New System.Drawing.Point(63, 17)
        Me.rdoTequila.Name = "rdoTequila"
        Me.rdoTequila.Size = New System.Drawing.Size(65, 23)
        Me.rdoTequila.TabIndex = 6
        Me.rdoTequila.Text = "Tequila"
        Me.rdoTequila.UseVisualStyleBackColor = True
        '
        'rdoVodka
        '
        Me.rdoVodka.AutoSize = True
        Me.rdoVodka.Checked = True
        Me.rdoVodka.Location = New System.Drawing.Point(9, 17)
        Me.rdoVodka.Name = "rdoVodka"
        Me.rdoVodka.Size = New System.Drawing.Size(60, 23)
        Me.rdoVodka.TabIndex = 5
        Me.rdoVodka.TabStop = True
        Me.rdoVodka.Text = "Vodka"
        Me.rdoVodka.UseVisualStyleBackColor = True
        '
        'grpGarnish
        '
        Me.grpGarnish.Controls.Add(Me.ckbCelery)
        Me.grpGarnish.Controls.Add(Me.ckbPeperoni)
        Me.grpGarnish.Controls.Add(Me.ckbAsparagus)
        Me.grpGarnish.Controls.Add(Me.ckbLime)
        Me.grpGarnish.Controls.Add(Me.ckbJalapenos)
        Me.grpGarnish.Controls.Add(Me.ckbOnions)
        Me.grpGarnish.Controls.Add(Me.ckbBacon)
        Me.grpGarnish.Controls.Add(Me.ckbOlives)
        Me.grpGarnish.Controls.Add(Me.ckbPrawns)
        Me.grpGarnish.Controls.Add(Me.ckbPickle)
        Me.grpGarnish.Controls.Add(Me.ckbLemon)
        Me.grpGarnish.Controls.Add(Me.ckbBeans)
        Me.grpGarnish.Location = New System.Drawing.Point(9, 392)
        Me.grpGarnish.Name = "grpGarnish"
        Me.grpGarnish.Size = New System.Drawing.Size(200, 162)
        Me.grpGarnish.TabIndex = 4
        Me.grpGarnish.TabStop = False
        Me.grpGarnish.Text = "Garnish"
        '
        'ckbCelery
        '
        Me.ckbCelery.AutoSize = True
        Me.ckbCelery.Checked = True
        Me.ckbCelery.CheckState = System.Windows.Forms.CheckState.Checked
        Me.ckbCelery.Location = New System.Drawing.Point(88, 66)
        Me.ckbCelery.Name = "ckbCelery"
        Me.ckbCelery.Size = New System.Drawing.Size(63, 23)
        Me.ckbCelery.TabIndex = 24
        Me.ckbCelery.Text = "Celery"
        Me.ckbCelery.UseVisualStyleBackColor = True
        '
        'ckbPeperoni
        '
        Me.ckbPeperoni.AutoSize = True
        Me.ckbPeperoni.Location = New System.Drawing.Point(88, 134)
        Me.ckbPeperoni.Name = "ckbPeperoni"
        Me.ckbPeperoni.Size = New System.Drawing.Size(77, 23)
        Me.ckbPeperoni.TabIndex = 23
        Me.ckbPeperoni.Text = "Peperoni"
        Me.ckbPeperoni.UseVisualStyleBackColor = True
        '
        'ckbAsparagus
        '
        Me.ckbAsparagus.AutoSize = True
        Me.ckbAsparagus.Location = New System.Drawing.Point(88, 114)
        Me.ckbAsparagus.Name = "ckbAsparagus"
        Me.ckbAsparagus.Size = New System.Drawing.Size(86, 23)
        Me.ckbAsparagus.TabIndex = 22
        Me.ckbAsparagus.Text = "Asparugus"
        Me.ckbAsparagus.UseVisualStyleBackColor = True
        '
        'ckbLime
        '
        Me.ckbLime.AutoSize = True
        Me.ckbLime.Checked = True
        Me.ckbLime.CheckState = System.Windows.Forms.CheckState.Checked
        Me.ckbLime.Location = New System.Drawing.Point(88, 90)
        Me.ckbLime.Name = "ckbLime"
        Me.ckbLime.Size = New System.Drawing.Size(55, 23)
        Me.ckbLime.TabIndex = 21
        Me.ckbLime.Text = "Lime"
        Me.ckbLime.UseVisualStyleBackColor = True
        '
        'ckbJalapenos
        '
        Me.ckbJalapenos.AutoSize = True
        Me.ckbJalapenos.Location = New System.Drawing.Point(88, 43)
        Me.ckbJalapenos.Name = "ckbJalapenos"
        Me.ckbJalapenos.Size = New System.Drawing.Size(81, 23)
        Me.ckbJalapenos.TabIndex = 20
        Me.ckbJalapenos.Text = "Jalapenos"
        Me.ckbJalapenos.UseVisualStyleBackColor = True
        '
        'ckbOnions
        '
        Me.ckbOnions.AutoSize = True
        Me.ckbOnions.Location = New System.Drawing.Point(88, 19)
        Me.ckbOnions.Name = "ckbOnions"
        Me.ckbOnions.Size = New System.Drawing.Size(108, 23)
        Me.ckbOnions.TabIndex = 19
        Me.ckbOnions.Text = "Pickled Onions"
        Me.ckbOnions.UseVisualStyleBackColor = True
        '
        'ckbBacon
        '
        Me.ckbBacon.AutoSize = True
        Me.ckbBacon.Location = New System.Drawing.Point(8, 134)
        Me.ckbBacon.Name = "ckbBacon"
        Me.ckbBacon.Size = New System.Drawing.Size(61, 23)
        Me.ckbBacon.TabIndex = 18
        Me.ckbBacon.Text = "Bacon"
        Me.ckbBacon.UseVisualStyleBackColor = True
        '
        'ckbOlives
        '
        Me.ckbOlives.AutoSize = True
        Me.ckbOlives.Checked = True
        Me.ckbOlives.CheckState = System.Windows.Forms.CheckState.Checked
        Me.ckbOlives.Location = New System.Drawing.Point(9, 114)
        Me.ckbOlives.Name = "ckbOlives"
        Me.ckbOlives.Size = New System.Drawing.Size(60, 23)
        Me.ckbOlives.TabIndex = 17
        Me.ckbOlives.Text = "Olives"
        Me.ckbOlives.UseVisualStyleBackColor = True
        '
        'ckbPrawns
        '
        Me.ckbPrawns.AutoSize = True
        Me.ckbPrawns.Location = New System.Drawing.Point(9, 90)
        Me.ckbPrawns.Name = "ckbPrawns"
        Me.ckbPrawns.Size = New System.Drawing.Size(70, 23)
        Me.ckbPrawns.TabIndex = 16
        Me.ckbPrawns.Text = "Prawns"
        Me.ckbPrawns.UseVisualStyleBackColor = True
        '
        'ckbPickle
        '
        Me.ckbPickle.AutoSize = True
        Me.ckbPickle.Location = New System.Drawing.Point(8, 66)
        Me.ckbPickle.Name = "ckbPickle"
        Me.ckbPickle.Size = New System.Drawing.Size(60, 23)
        Me.ckbPickle.TabIndex = 15
        Me.ckbPickle.Text = "Pickle"
        Me.ckbPickle.UseVisualStyleBackColor = True
        '
        'ckbLemon
        '
        Me.ckbLemon.AutoSize = True
        Me.ckbLemon.Location = New System.Drawing.Point(9, 43)
        Me.ckbLemon.Name = "ckbLemon"
        Me.ckbLemon.Size = New System.Drawing.Size(65, 23)
        Me.ckbLemon.TabIndex = 14
        Me.ckbLemon.Text = "Lemon"
        Me.ckbLemon.UseVisualStyleBackColor = True
        '
        'ckbBeans
        '
        Me.ckbBeans.AutoSize = True
        Me.ckbBeans.Location = New System.Drawing.Point(9, 19)
        Me.ckbBeans.Name = "ckbBeans"
        Me.ckbBeans.Size = New System.Drawing.Size(60, 23)
        Me.ckbBeans.TabIndex = 13
        Me.ckbBeans.Text = "Beans"
        Me.ckbBeans.UseVisualStyleBackColor = True
        '
        'btnMix
        '
        Me.btnMix.Location = New System.Drawing.Point(127, 706)
        Me.btnMix.Name = "btnMix"
        Me.btnMix.Size = New System.Drawing.Size(75, 23)
        Me.btnMix.TabIndex = 2
        Me.btnMix.Text = "Mix"
        Me.btnMix.UseVisualStyleBackColor = True
        '
        'grpSize
        '
        Me.grpSize.Controls.Add(Me.rdoS22oz)
        Me.grpSize.Controls.Add(Me.rdoS16oz)
        Me.grpSize.Controls.Add(Me.rdoS8oz)
        Me.grpSize.Location = New System.Drawing.Point(6, 24)
        Me.grpSize.Name = "grpSize"
        Me.grpSize.Size = New System.Drawing.Size(200, 46)
        Me.grpSize.TabIndex = 0
        Me.grpSize.TabStop = False
        Me.grpSize.Text = "Size"
        '
        'rdoS22oz
        '
        Me.rdoS22oz.AutoSize = True
        Me.rdoS22oz.Location = New System.Drawing.Point(124, 17)
        Me.rdoS22oz.Name = "rdoS22oz"
        Me.rdoS22oz.Size = New System.Drawing.Size(55, 23)
        Me.rdoS22oz.TabIndex = 5
        Me.rdoS22oz.Text = "22oz"
        Me.rdoS22oz.UseVisualStyleBackColor = True
        '
        'rdoS16oz
        '
        Me.rdoS16oz.AutoSize = True
        Me.rdoS16oz.Checked = True
        Me.rdoS16oz.Location = New System.Drawing.Point(63, 17)
        Me.rdoS16oz.Name = "rdoS16oz"
        Me.rdoS16oz.Size = New System.Drawing.Size(55, 23)
        Me.rdoS16oz.TabIndex = 4
        Me.rdoS16oz.TabStop = True
        Me.rdoS16oz.Text = "16oz"
        Me.rdoS16oz.UseVisualStyleBackColor = True
        '
        'rdoS8oz
        '
        Me.rdoS8oz.AutoSize = True
        Me.rdoS8oz.Location = New System.Drawing.Point(14, 17)
        Me.rdoS8oz.Name = "rdoS8oz"
        Me.rdoS8oz.Size = New System.Drawing.Size(47, 23)
        Me.rdoS8oz.TabIndex = 3
        Me.rdoS8oz.Text = "8oz"
        Me.rdoS8oz.UseVisualStyleBackColor = True
        '
        'lblGrandTotal
        '
        Me.lblGrandTotal.Font = New System.Drawing.Font("Microsoft Sans Serif", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGrandTotal.Location = New System.Drawing.Point(368, 769)
        Me.lblGrandTotal.Name = "lblGrandTotal"
        Me.lblGrandTotal.Size = New System.Drawing.Size(107, 44)
        Me.lblGrandTotal.TabIndex = 1
        Me.lblGrandTotal.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblName
        '
        Me.lblName.Font = New System.Drawing.Font("Monotype Corsiva", 26.25!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblName.Location = New System.Drawing.Point(1135, 12)
        Me.lblName.Name = "lblName"
        Me.lblName.Size = New System.Drawing.Size(172, 87)
        Me.lblName.TabIndex = 11
        Me.lblName.Text = "Bloody" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & " Mary"
        Me.lblName.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'pcbDrink
        '
        Me.pcbDrink.Image = Global.test2.My.Resources.Resources.theWorks
        Me.pcbDrink.Location = New System.Drawing.Point(1130, 102)
        Me.pcbDrink.Name = "pcbDrink"
        Me.pcbDrink.Size = New System.Drawing.Size(190, 304)
        Me.pcbDrink.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.pcbDrink.TabIndex = 12
        Me.pcbDrink.TabStop = False
        '
        'lblSubName
        '
        Me.lblSubName.Font = New System.Drawing.Font("Harlow Solid Italic", 21.75!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSubName.Location = New System.Drawing.Point(1130, 409)
        Me.lblSubName.Name = "lblSubName"
        Me.lblSubName.Size = New System.Drawing.Size(190, 91)
        Me.lblSubName.TabIndex = 13
        Me.lblSubName.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'lblSummary
        '
        Me.lblSummary.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblSummary.Location = New System.Drawing.Point(1142, 514)
        Me.lblSummary.Name = "lblSummary"
        Me.lblSummary.Size = New System.Drawing.Size(165, 277)
        Me.lblSummary.TabIndex = 14
        Me.lblSummary.Text = "" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Any Size Drink $6.00  " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Make it a: " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Double   + $2.00" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Triple         $9.00" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & _
    "" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Garnishes  $.25  each" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Burger       $6.00                  "
        '
        'lblTax
        '
        Me.lblTax.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTax.Location = New System.Drawing.Point(387, 724)
        Me.lblTax.Name = "lblTax"
        Me.lblTax.Size = New System.Drawing.Size(79, 23)
        Me.lblTax.TabIndex = 15
        Me.lblTax.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblSubTotal
        '
        Me.lblSubTotal.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSubTotal.Location = New System.Drawing.Point(387, 701)
        Me.lblSubTotal.Name = "lblSubTotal"
        Me.lblSubTotal.Size = New System.Drawing.Size(79, 23)
        Me.lblSubTotal.TabIndex = 16
        Me.lblSubTotal.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblStaticSub
        '
        Me.lblStaticSub.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticSub.Location = New System.Drawing.Point(258, 701)
        Me.lblStaticSub.Name = "lblStaticSub"
        Me.lblStaticSub.Size = New System.Drawing.Size(113, 23)
        Me.lblStaticSub.TabIndex = 17
        Me.lblStaticSub.Text = "Sub Total:"
        Me.lblStaticSub.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblStaticTax
        '
        Me.lblStaticTax.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticTax.Location = New System.Drawing.Point(292, 724)
        Me.lblStaticTax.Name = "lblStaticTax"
        Me.lblStaticTax.Size = New System.Drawing.Size(79, 23)
        Me.lblStaticTax.TabIndex = 18
        Me.lblStaticTax.Text = "Tax:"
        Me.lblStaticTax.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblStaticGrand
        '
        Me.lblStaticGrand.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblStaticGrand.Location = New System.Drawing.Point(223, 783)
        Me.lblStaticGrand.Name = "lblStaticGrand"
        Me.lblStaticGrand.Size = New System.Drawing.Size(148, 23)
        Me.lblStaticGrand.TabIndex = 19
        Me.lblStaticGrand.Text = "Grand Total:"
        Me.lblStaticGrand.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'lblSuggTip
        '
        Me.lblSuggTip.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSuggTip.Location = New System.Drawing.Point(215, 750)
        Me.lblSuggTip.Name = "lblSuggTip"
        Me.lblSuggTip.Size = New System.Drawing.Size(156, 23)
        Me.lblSuggTip.TabIndex = 22
        Me.lblSuggTip.Text = "Suggested Tip:"
        Me.lblSuggTip.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'btnOrderExit
        '
        Me.btnOrderExit.Location = New System.Drawing.Point(36, 783)
        Me.btnOrderExit.Name = "btnOrderExit"
        Me.btnOrderExit.Size = New System.Drawing.Size(214, 23)
        Me.btnOrderExit.TabIndex = 25
        Me.btnOrderExit.Text = "Order && Exit"
        Me.btnOrderExit.UseVisualStyleBackColor = True
        '
        'btnReCalc
        '
        Me.btnReCalc.Location = New System.Drawing.Point(483, 744)
        Me.btnReCalc.Name = "btnReCalc"
        Me.btnReCalc.Size = New System.Drawing.Size(85, 39)
        Me.btnReCalc.TabIndex = 26
        Me.btnReCalc.Text = "Re-Calculate" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Total"
        Me.btnReCalc.UseVisualStyleBackColor = True
        '
        'nudTip
        '
        Me.nudTip.BackColor = System.Drawing.Color.Bisque
        Me.nudTip.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.nudTip.DecimalPlaces = 2
        Me.nudTip.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.nudTip.Location = New System.Drawing.Point(377, 750)
        Me.nudTip.Name = "nudTip"
        Me.nudTip.Size = New System.Drawing.Size(100, 25)
        Me.nudTip.TabIndex = 27
        Me.nudTip.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'frmMary
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.Bisque
        Me.BackgroundImage = Global.test2.My.Resources.Resources.Cs115_logo
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.ClientSize = New System.Drawing.Size(1384, 820)
        Me.Controls.Add(Me.nudTip)
        Me.Controls.Add(Me.btnReCalc)
        Me.Controls.Add(Me.btnOrderExit)
        Me.Controls.Add(Me.lblSuggTip)
        Me.Controls.Add(Me.lblStaticGrand)
        Me.Controls.Add(Me.lblStaticTax)
        Me.Controls.Add(Me.lblStaticSub)
        Me.Controls.Add(Me.lblSubTotal)
        Me.Controls.Add(Me.lblTax)
        Me.Controls.Add(Me.lblSummary)
        Me.Controls.Add(Me.lblSubName)
        Me.Controls.Add(Me.pcbDrink)
        Me.Controls.Add(Me.lblName)
        Me.Controls.Add(Me.lblGrandTotal)
        Me.Controls.Add(Me.gprHold)
        Me.DoubleBuffered = True
        Me.MaximizeBox = False
        Me.MaximumSize = New System.Drawing.Size(1400, 858)
        Me.MinimumSize = New System.Drawing.Size(1400, 858)
        Me.Name = "frmMary"
        Me.Text = "Bloody Mary Maker"
        Me.gprHold.ResumeLayout(False)
        Me.grpShots.ResumeLayout(False)
        Me.grpShots.PerformLayout()
        Me.grpBurger.ResumeLayout(False)
        Me.grpBurger.PerformLayout()
        Me.grpRocks.ResumeLayout(False)
        Me.grpRocks.PerformLayout()
        Me.grpSpice.ResumeLayout(False)
        Me.grpSpice.PerformLayout()
        Me.grpRim.ResumeLayout(False)
        Me.grpRim.PerformLayout()
        Me.grpBase.ResumeLayout(False)
        Me.grpBase.PerformLayout()
        Me.grpLiquor.ResumeLayout(False)
        Me.grpLiquor.PerformLayout()
        Me.grpGarnish.ResumeLayout(False)
        Me.grpGarnish.PerformLayout()
        Me.grpSize.ResumeLayout(False)
        Me.grpSize.PerformLayout()
        CType(Me.pcbDrink, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.nudTip, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents gprHold As System.Windows.Forms.GroupBox
    Friend WithEvents btnMix As System.Windows.Forms.Button
    Friend WithEvents grpSize As System.Windows.Forms.GroupBox
    Friend WithEvents grpRocks As System.Windows.Forms.GroupBox
    Friend WithEvents lblGrandTotal As System.Windows.Forms.Label
    Friend WithEvents grpGarnish As System.Windows.Forms.GroupBox
    Friend WithEvents grpBase As System.Windows.Forms.GroupBox
    Friend WithEvents grpRim As System.Windows.Forms.GroupBox
    Friend WithEvents grpSpice As System.Windows.Forms.GroupBox
    Friend WithEvents grpLiquor As System.Windows.Forms.GroupBox
    Friend WithEvents grpBurger As System.Windows.Forms.GroupBox
    Friend WithEvents rdoBurgerNo As System.Windows.Forms.RadioButton
    Friend WithEvents rdoBurgerYes As System.Windows.Forms.RadioButton
    Friend WithEvents lblName As System.Windows.Forms.Label
    Friend WithEvents pcbDrink As System.Windows.Forms.PictureBox
    Friend WithEvents grpShots As System.Windows.Forms.GroupBox
    Friend WithEvents lblSubName As System.Windows.Forms.Label
    Friend WithEvents lblSummary As System.Windows.Forms.Label
    Friend WithEvents rdoNone As System.Windows.Forms.RadioButton
    Friend WithEvents rdoTriple As System.Windows.Forms.RadioButton
    Friend WithEvents rdoDouble As System.Windows.Forms.RadioButton
    Friend WithEvents rdoSingle As System.Windows.Forms.RadioButton
    Friend WithEvents rdoSpicy As System.Windows.Forms.RadioButton
    Friend WithEvents rdoHot As System.Windows.Forms.RadioButton
    Friend WithEvents rdoMild As System.Windows.Forms.RadioButton
    Friend WithEvents rdoBland As System.Windows.Forms.RadioButton
    Friend WithEvents rdoNoSalt As System.Windows.Forms.RadioButton
    Friend WithEvents rdoOldBay As System.Windows.Forms.RadioButton
    Friend WithEvents rdoBBQrub As System.Windows.Forms.RadioButton
    Friend WithEvents rdoBacSalt As System.Windows.Forms.RadioButton
    Friend WithEvents rdoCelsalt As System.Windows.Forms.RadioButton
    Friend WithEvents rdoSalt As System.Windows.Forms.RadioButton
    Friend WithEvents rdoClam As System.Windows.Forms.RadioButton
    Friend WithEvents rdoTom As System.Windows.Forms.RadioButton
    Friend WithEvents rdoVirgin As System.Windows.Forms.RadioButton
    Friend WithEvents rdoRum As System.Windows.Forms.RadioButton
    Friend WithEvents rdoWhiskey As System.Windows.Forms.RadioButton
    Friend WithEvents rdoTequila As System.Windows.Forms.RadioButton
    Friend WithEvents rdoVodka As System.Windows.Forms.RadioButton
    Friend WithEvents ckbCelery As System.Windows.Forms.CheckBox
    Friend WithEvents ckbPeperoni As System.Windows.Forms.CheckBox
    Friend WithEvents ckbAsparagus As System.Windows.Forms.CheckBox
    Friend WithEvents ckbLime As System.Windows.Forms.CheckBox
    Friend WithEvents ckbJalapenos As System.Windows.Forms.CheckBox
    Friend WithEvents ckbOnions As System.Windows.Forms.CheckBox
    Friend WithEvents ckbBacon As System.Windows.Forms.CheckBox
    Friend WithEvents ckbOlives As System.Windows.Forms.CheckBox
    Friend WithEvents ckbPrawns As System.Windows.Forms.CheckBox
    Friend WithEvents ckbPickle As System.Windows.Forms.CheckBox
    Friend WithEvents ckbLemon As System.Windows.Forms.CheckBox
    Friend WithEvents ckbBeans As System.Windows.Forms.CheckBox
    Friend WithEvents rdoNo As System.Windows.Forms.RadioButton
    Friend WithEvents rdoYes As System.Windows.Forms.RadioButton
    Friend WithEvents rdoS22oz As System.Windows.Forms.RadioButton
    Friend WithEvents rdoS16oz As System.Windows.Forms.RadioButton
    Friend WithEvents rdoS8oz As System.Windows.Forms.RadioButton
    Friend WithEvents btnClear As System.Windows.Forms.Button
    Friend WithEvents lblTax As System.Windows.Forms.Label
    Friend WithEvents lblSubTotal As System.Windows.Forms.Label
    Friend WithEvents lblStaticSub As System.Windows.Forms.Label
    Friend WithEvents lblStaticTax As System.Windows.Forms.Label
    Friend WithEvents lblStaticGrand As System.Windows.Forms.Label
    Friend WithEvents lblSuggTip As System.Windows.Forms.Label
    Friend WithEvents btnOrderExit As System.Windows.Forms.Button
    Friend WithEvents btnReCalc As System.Windows.Forms.Button
    Friend WithEvents nudTip As System.Windows.Forms.NumericUpDown

End Class
