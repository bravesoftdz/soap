package com.cxrus.soap;

import java.util.List;




import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.LoggingLevel;
import org.apache.camel.Produce;
import org.apache.camel.util.CamelLogger;
import org.cxrus.canonapi.service.AvailableStaticPagesLiveStagingResult;
import org.cxrus.canonapi.service.AvailableStaticPagesResponse;
import org.cxrus.canonapi.service.CanonService;
import org.cxrus.canonapi.service.CanonServiceService;
import org.cxrus.canonapi.service.ProductResult;

public class SOAPCaller {

	private final static CamelLogger logger = new CamelLogger(SOAPCaller.class.getCanonicalName(), LoggingLevel.INFO);
	private static CanonServiceService canonService;
	public static CanonService getCanonAPI() {
		Long now = null;
		CanonService cs = null;
		
		if (canonService == null) {
			now = System.currentTimeMillis();
			canonService = new CanonServiceService();
			logger.doLog("new CanonServiceService(): " + (System.currentTimeMillis() - now));
		}
		
		for(int i=0; i<3; i++){
			now = System.currentTimeMillis();
			cs = canonService.getCanonServicePort();
			logger.doLog("getCanonServicePort: " + (System.currentTimeMillis() - now));
			
			if(cs != null)
				break;
		}
		
		return cs;
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	public AvailableStaticPagesResponse getStaticPages(String productID){
		CanonService service = getCanonAPI();
		AvailableStaticPagesResponse a = service.gAvailableStaticPages("caleb", "aobakozue", productID,"Y", "SG", "EN");
		logger.doLog(a.getReferenceNo());
		return a;
	}
	
}
