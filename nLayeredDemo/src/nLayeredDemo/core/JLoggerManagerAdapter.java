package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager= new JLoggerManager();
		manager.log(message);
	}

}


//adaptasyon : ba�kas�n�n yaptigi service'leri sisteme adapte etmek.'
// adaptorum. kendisi benim interface'imi kullaniyor. ama orada kendi ismine, kend sablonuna uygun yapida (aslinda) jlogger'i cag�r�yor.
// adaptasyon oldugu icin newlesek de sakinca yok. ama injekte de edebiliriz.

// product manage'a sen art�k adaptorunu verebilirsin. diyor
