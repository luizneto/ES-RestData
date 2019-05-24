package ua.es.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class DataModel {

	//Id de identifica��o da camera
	@Id
	@Column(name = "CameraID", nullable = false)
	private long cameraID;
	
	//Timestamp da imagem
	@Column(name = "Moment", nullable = false)
	private Timestamp moment;
		
	//N�mero de pessoas na imagem
	@Column(name = "Num_person", nullable = false)
	private int numPerson;	

	//M�dia do n�mero de pessoas
	@Column(name = "Avg_numb_person", nullable = false)
	private double avgNumbPerson;	

	//N�mero do desvio
	@Column(name = "deviation", nullable = false)
	private double deviation;

	public long getCameraID() {
		return cameraID;
	}

	public void setCameraID(long cameraID) {
		this.cameraID = cameraID;
	}

	public Timestamp getMoment() {
		return moment;
	}

	public void setTimeStamp(Timestamp moment) {
		this.moment = moment;
	}

	public int getNumPerson() {
		return numPerson;
	}

	public void setNumPerson(int numPerson) {
		this.numPerson = numPerson;
	}

	public double getAvgNumbPerson() {
		return avgNumbPerson;
	}

	public void setAvgNumbPerson(int avgNumbPerson) {
		this.avgNumbPerson = avgNumbPerson;
	}

	public double getDeviation() {
		return deviation;
	}

	public void setDeviation(int deviation) {
		this.deviation = deviation;
	}

	@Override
	public String toString() {
		return "Data [cameraID=" + cameraID + ", moment=" + moment + ", numPerson=" + numPerson + ", avgNumbPerson="
				+ avgNumbPerson + ", deviation=" + deviation + "]";
	}


	
}
