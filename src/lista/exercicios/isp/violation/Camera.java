/**
 * 
 */
package lista.exercicios.isp.violation;


public class Camera implements LigaDesliga {

	private boolean cameraOn;

	public boolean isCameraOn() {
		return cameraOn;
	}

	@Override
	public void ligar() {
		cameraOn = true;
	}

	@Override
	public void desligar() {
		cameraOn = false;
	}

}
