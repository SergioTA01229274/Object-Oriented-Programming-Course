import javax.swing.JOptionPane;

public class Deduccion {
private PanelEntradas pe1;
	
	public float sueldoMensual, sueldoAnual, aguinaldo, aguinaldoExcento, aguinaldoGravado, primaVacacionalR,
					primaVacacionalE, primaVacacionalG, totalIngresosG, dMedicosHosp, gastosF, SGMM, hipotecarios, donativos,
					aportacionRetiro, transporteEscolar, MaxDedCol, colegiaturaTotal, totalDeducciones, montoISR, cuotaFija, 
					porcentajeExcedente, pagoExcedente, pagoTotal, deduccionPermitida, limiteMinimo;
	
	public String nombre, RFC, nivelEducativo;
	boolean permission;
	public Deduccion() {
		this.permission = true;
	}
	public Deduccion(PanelEntradas PE) {
		this.pe1 = PE;
	}
	
	public void setDatos() {
		if(verificarData() == true) {
			this.nombre = this.pe1.tfNombre.getText();
			this.RFC = this.pe1.tfRFC.getText();
			int index = this.pe1.tfEducativo.getSelectedIndex();
			switch (index) {
				case 0:
					this.nivelEducativo = "Preescolar";
					break;
				case 1:
					this.nivelEducativo = "Primaria";
					break;
				case 2:
					this.nivelEducativo = "Secundaria";
					break;
				case 3:
					this.nivelEducativo = "Profesional Tecnico";
					break;
				case 4:
					this.nivelEducativo = "Bachillerato";
					break;
			}
			this.sueldoMensual = Float.parseFloat(this.pe1.tfSueldoMensual.getText());
			this.aguinaldo = Float.parseFloat(this.pe1.tfAguinaldo.getText());
			this.primaVacacionalR = Float.parseFloat(this.pe1.tfPrimaVaca.getText());
			this.dMedicosHosp = Float.parseFloat(this.pe1.tfDMedicos.getText());
			this.gastosF = Float.parseFloat(this.pe1.tfDGastos.getText());
			this.SGMM = Float.parseFloat(this.pe1.tfSGMM.getText());
			this.hipotecarios = Float.parseFloat(this.pe1.tfHipotecarios.getText());
			this.donativos = Float.parseFloat(this.pe1.tfDonativos.getText());
			this.aportacionRetiro = Float.parseFloat(this.pe1.tfRetiro.getText());
			this.transporteEscolar = Float.parseFloat(this.pe1.tfTransEscolar.getText());
			this.colegiaturaTotal = Float.parseFloat(this.pe1.tfColegiatura.getText());
		} else {
			JOptionPane.showMessageDialog(null, "Recuerde ingresar todos los datos correctamente. Verifique sus datos.");
		}
	}
	public boolean verificarData() {
		try {
			this.aguinaldo = Float.parseFloat(this.pe1.tfAguinaldo.getText());
			this.primaVacacionalR = Float.parseFloat(this.pe1.tfPrimaVaca.getText());
			this.dMedicosHosp = Float.parseFloat(this.pe1.tfDMedicos.getText());
			this.gastosF = Float.parseFloat(this.pe1.tfDGastos.getText());
			this.SGMM = Float.parseFloat(this.pe1.tfSGMM.getText());
			this.hipotecarios = Float.parseFloat(this.pe1.tfHipotecarios.getText());
			this.donativos = Float.parseFloat(this.pe1.tfDonativos.getText());
			this.aportacionRetiro = Float.parseFloat(this.pe1.tfRetiro.getText());
			this.transporteEscolar = Float.parseFloat(this.pe1.tfTransEscolar.getText());
			this.colegiaturaTotal = Float.parseFloat(this.pe1.tfColegiatura.getText());
			this.nombre = this.pe1.tfNombre.getText();
			this.RFC = this.pe1.tfRFC.getText();
			return true;
		} catch (NumberFormatException e) {
			return false;
		} 
	}

	
	public void calcularImpuestos() {
		this.sueldoAnual = this.sueldoMensual*12;
		this.aguinaldoExcento = this.sueldoMensual/2;
		this.aguinaldoGravado = this.aguinaldo - this.aguinaldoExcento;
		this.primaVacacionalE = (float) 80.04 * 15;
		this.primaVacacionalG = this.primaVacacionalR - this.primaVacacionalE;
		if(this.primaVacacionalG < 0) {
			this.primaVacacionalG = 0;
		}
		this.totalIngresosG = this.sueldoAnual + this.aguinaldoGravado + this.primaVacacionalG;

		switch(this.nivelEducativo) {
			case "Preescolar":
				this.MaxDedCol = 14200;
				break;
			case "Primaria":
				this.MaxDedCol = 12900;
				break;
			case "Secundaria":
				this.MaxDedCol = 19900;
				break;
			case "Profesional Tecnico":
				this.MaxDedCol = 17100;
				break;
			case "Bachillerato":
				this.MaxDedCol = 24500;
				break;
		}
		this.totalDeducciones = this.dMedicosHosp + this.gastosF + this.SGMM + this.hipotecarios + this.donativos + this.transporteEscolar + this.MaxDedCol;
		this.deduccionPermitida = this.sueldoAnual + this.aguinaldo + this.primaVacacionalR; 
		this.deduccionPermitida = (float) this.deduccionPermitida / 10;
		
		//System.out.println(this.deduccionPermitida);
		if(this.aportacionRetiro > (this.deduccionPermitida)) {
			this.deduccionPermitida = this.deduccionPermitida*2;
		}else {
			this.deduccionPermitida += this.aportacionRetiro;
		}
		//System.out.println(this.deduccionPermitida);
		
		this.montoISR = this.totalIngresosG - this.deduccionPermitida;
		
		if(this.montoISR >= 0.0 && this.montoISR <= 5952.84) {
			this.cuotaFija = 0;
			this.porcentajeExcedente =(float) 1.92;
			this.limiteMinimo = (float)0.0;
		}else if(this.montoISR >= 5952.85 && this.montoISR <= 50524.92) {
			this.cuotaFija = (float)114.29;
			this.porcentajeExcedente =(float) 6.40;
			this.limiteMinimo = (float)5952.85;
		}else if(this.montoISR > 50524.93 && this.montoISR <= 88793.04) {
			this.cuotaFija = (float) 2966.91;
			this.porcentajeExcedente =(float) 10.88;
			this.limiteMinimo = (float)50524.93;
		}else if(this.montoISR > 88793.05 && this.montoISR <= 103218.00) {
			this.cuotaFija = (float)7130.48;
			this.porcentajeExcedente =(float) 16.00;
			this.limiteMinimo = (float)88793.05;
		}else if(this.montoISR > 103218.01 && this.montoISR <= 123580.20) {
			this.cuotaFija = (float) 9438.47;
			this.porcentajeExcedente =(float) 17.92;
			this.limiteMinimo = (float)103218.01;
		}else if(this.montoISR > 123580.21 && this.montoISR <= 249243.48) {
			this.cuotaFija = (float)13087.37;
			this.porcentajeExcedente =(float) 21.36;
			this.limiteMinimo = (float)123580.21;
		}else if(this.montoISR > 249243.49 && this.montoISR <= 392841.96) {
			this.cuotaFija = (float)39929.05;
			this.porcentajeExcedente =(float)23.52;
			this.limiteMinimo = (float)249243.49;
		}else if(this.montoISR > 392841.97 && this.montoISR <= 750000.00) {
			this.cuotaFija = (float)73703.41;
			this.porcentajeExcedente =(float) 30.00;
			this.limiteMinimo = (float)392841.97;
		}else if(this.montoISR > 750000.01 && this.montoISR <= 1000000.00) {
			this.cuotaFija = (float)180850.82;
			this.porcentajeExcedente =(float) 32.00;
			this.limiteMinimo = (float)750000.01;
		}else if(this.montoISR > 1000000.01 && this.montoISR <= 3000000.00) {
			this.cuotaFija = (float)260850.81;
			this.porcentajeExcedente =(float) 34.00;
			this.limiteMinimo = (float)1000000.01;
		}else {
			this.cuotaFija = (float)940850.81;
			this.porcentajeExcedente =(float) 35.00;
			this.limiteMinimo = (float)3000000.01;
		}
		
		this.pagoExcedente = (this.montoISR - this.limiteMinimo)*(this.porcentajeExcedente/100);
		this.pagoTotal = this.pagoExcedente + this.cuotaFija;
	}
	
	public String[] calcularImpuestos(String[] data) {
		this.nombre = data[0];
		this.RFC = data[1];
		this.sueldoMensual = Float.parseFloat(data[2]);
		this.sueldoAnual = this.sueldoMensual*12;
		this.aguinaldo = Float.parseFloat(data[3]);
		this.aguinaldoExcento = this.sueldoMensual/2;
		this.aguinaldoGravado = this.aguinaldo - this.aguinaldoExcento;
		this.primaVacacionalR = Float.parseFloat(data[4]);
		this.primaVacacionalE = (float) 80.04 * 15;
		this.primaVacacionalG = this.primaVacacionalR - this.primaVacacionalE;
		if(this.primaVacacionalG < 0) {
			this.primaVacacionalG = 0;
		}
		this.totalIngresosG = this.sueldoAnual + this.aguinaldoGravado + this.primaVacacionalG;
		this.dMedicosHosp = Float.parseFloat(data[5]);
		this.gastosF = Float.parseFloat(data[6]);
		this.SGMM = Float.parseFloat(data[7]);
		this.hipotecarios = Float.parseFloat(data[8]);
		this.donativos = Float.parseFloat(data[9]);
		this.aportacionRetiro = Float.parseFloat(data[10]);
		this.transporteEscolar = Float.parseFloat(data[11]);
		this.nivelEducativo = data[12];
		switch(this.nivelEducativo) {
			case "Preescolar":
				this.MaxDedCol = 14200;
				break;
			case "Primaria":
				this.MaxDedCol = 12900;
				break;
			case "Secundaria":
				this.MaxDedCol = 19900;
				break;
			case "Profesional Tecnico":
				this.MaxDedCol = 17100;
				break;
			case "Preparatoria":
				this.MaxDedCol = 24500;
				break;
		}
		this.colegiaturaTotal = Float.parseFloat(data[13]);
		if(this.colegiaturaTotal > this.MaxDedCol) {
			this.totalDeducciones = this.dMedicosHosp + this.gastosF + this.SGMM + this.hipotecarios + this.donativos + this.transporteEscolar + this.MaxDedCol;
		}else {
			this.totalDeducciones = this.dMedicosHosp + this.gastosF + this.SGMM + this.hipotecarios + this.donativos + this.transporteEscolar + this.colegiaturaTotal;
		}
		
		this.deduccionPermitida = this.sueldoAnual + this.aguinaldo + this.primaVacacionalR; 
		this.deduccionPermitida = (float) this.deduccionPermitida / 10;
		
		if(this.aportacionRetiro > (this.deduccionPermitida)) {
			this.deduccionPermitida = this.deduccionPermitida*2;
		}else {
			this.deduccionPermitida += this.aportacionRetiro;
		}
		this.montoISR = this.totalIngresosG - this.deduccionPermitida;
		
		if(this.montoISR >= 0.0 && this.montoISR <= 5952.84) {
			this.cuotaFija = 0;
			this.porcentajeExcedente =(float) 1.92;
			this.limiteMinimo = (float)0.0;
		}else if(this.montoISR >= 5952.85 && this.montoISR <= 50524.92) {
			this.cuotaFija = (float)114.29;
			this.porcentajeExcedente =(float) 6.40;
			this.limiteMinimo = (float)5952.85;
		}else if(this.montoISR > 50524.93 && this.montoISR <= 88793.04) {
			this.cuotaFija = (float) 2966.91;
			this.porcentajeExcedente =(float) 10.88;
			this.limiteMinimo = (float)50524.93;
		}else if(this.montoISR > 88793.05 && this.montoISR <= 103218.00) {
			this.cuotaFija = (float)7130.48;
			this.porcentajeExcedente =(float) 16.00;
			this.limiteMinimo = (float)88793.05;
		}else if(this.montoISR > 103218.01 && this.montoISR <= 123580.20) {
			this.cuotaFija = (float) 9438.47;
			this.porcentajeExcedente =(float) 17.92;
			this.limiteMinimo = (float)103218.01;
		}else if(this.montoISR > 123580.21 && this.montoISR <= 249243.48) {
			this.cuotaFija = (float)13087.37;
			this.porcentajeExcedente =(float) 21.36;
			this.limiteMinimo = (float)123580.21;
		}else if(this.montoISR > 249243.49 && this.montoISR <= 392841.96) {
			this.cuotaFija = (float)39929.05;
			this.porcentajeExcedente =(float)23.52;
			this.limiteMinimo = (float)249243.49;
		}else if(this.montoISR > 392841.97 && this.montoISR <= 750000.00) {
			this.cuotaFija = (float)73703.41;
			this.porcentajeExcedente =(float) 30.00;
			this.limiteMinimo = (float)392841.97;
		}else if(this.montoISR > 750000.01 && this.montoISR <= 1000000.00) {
			this.cuotaFija = (float)180850.82;
			this.porcentajeExcedente =(float) 32.00;
			this.limiteMinimo = (float)750000.01;
		}else if(this.montoISR > 1000000.01 && this.montoISR <= 3000000.00) {
			this.cuotaFija = (float)260850.81;
			this.porcentajeExcedente =(float) 34.00;
			this.limiteMinimo = (float)1000000.01;
		}else {
			this.cuotaFija = (float)940850.81;
			this.porcentajeExcedente =(float) 35.00;
			this.limiteMinimo = (float)3000000.01;
		}
		
		this.pagoExcedente = (this.montoISR - this.limiteMinimo)*(this.porcentajeExcedente/100);
		this.pagoTotal = this.pagoExcedente + this.cuotaFija;
		
		String[] datosE = new String[28];
		
		datosE[0] = this.nombre;
		datosE[1] = this.RFC;
		datosE[2] = this.sueldoMensual + "";
		datosE[3] = this.sueldoMensual + "";
		datosE[4] = this.aguinaldo + "";
		datosE[5] = this.aguinaldoExcento + "";
		datosE[6] = this.aguinaldoGravado + "";
		datosE[7] = this.primaVacacionalR + "";
		datosE[8] = this.primaVacacionalE + "";
		datosE[9] = this.primaVacacionalG + "";
		datosE[10] = this.totalIngresosG + "";
		datosE[11] = this.dMedicosHosp + "";
		datosE[12] = this.gastosF + "";
		datosE[13] = this.SGMM + "";
		datosE[14] = this.hipotecarios + "";
		datosE[15] = this.donativos + "";
		datosE[16] = this.aportacionRetiro + "";
		datosE[17] = this.transporteEscolar + "";
		datosE[18] = this.nivelEducativo;
		datosE[19] = this.MaxDedCol + "";
		datosE[20] = this.colegiaturaTotal + "";
		datosE[21] = this.totalDeducciones + "";
		datosE[22] = this.deduccionPermitida + "";
		datosE[23] = this.montoISR + "";
		datosE[24] = this.cuotaFija + "";
		datosE[25] = this.porcentajeExcedente + "";
		datosE[26] = this.pagoExcedente + "";
		datosE[27] = this.pagoTotal + "";
		return datosE;
	}
}


