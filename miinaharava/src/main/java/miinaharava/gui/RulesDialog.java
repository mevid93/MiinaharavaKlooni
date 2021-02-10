package miinaharava.gui;

/**
 * Class represents rules dialog.
 */
public class RulesDialog extends javax.swing.JDialog {

	private static final long serialVersionUID = 1L;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;

	/**
	 * Constructor.
	 *
	 * @param parent main window.
	 * @param modal  prevent input to main window while in dialog
	 */
	public RulesDialog(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	/**
	 * Method to show dialog.
	 */
	public void showDialog() {
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
		jButton1.setText("Sulje ohjeet");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
		jLabel1.setText("Miinaharavan säännöt");

		jTextArea1.setEditable(false);
		jTextArea1.setColumns(20);
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jTextArea1.setText(
				"Pelaaja klikkaa hiiren vasemmalla näppäi-\nmellä paljastamattomia ruutuja. Peli päät-\ntyy, jos pelaaja paljastaa ruudun jossa on miina. Jos ruudussa ei ole miinaa, tulee \nnäkyviin ruudun naapuriruuduissa sijaitse- \nvien miinojen määrä (max 8).\n\nMikäli naapuriruuduissa ei ole miinaa, pelipaljastaa ensin kaikki siihen yhteydessä \nolevat ruudut, joiden naapurissa ei myös-\nkään ole miinaa, sekä lisäksi tämän paljastetun alueen reunalla olevat ruudut, joiden naapurissa on miina. \n\nOikealla näppäimellä pelaaja voi merkitä lipulla paljastamattoman ruudun, jossa päättelee olevan miinan. Kun kaikki miinattomat ruudut on paljastettu, pelaaja on onnistunut ja hänen tuloksensa on käytetty aika.");
		jTextArea1.setWrapStyleWord(true);
		jScrollPane2.setViewportView(jTextArea1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(153, 153, 153))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(100, 100, 100).addComponent(jLabel1))
						.addGroup(layout.createSequentialGroup().addGap(38, 38, 38).addComponent(jScrollPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(41, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jLabel1).addGap(18, 18, 18)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButton1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}

	/**
	 * Method to close window.
	 *
	 * @param evt click event
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

}
