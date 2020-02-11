package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;


public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method
		rpcclient.connect();
		byte[] bSend = RPCUtils.marshallInteger(RPCID, 0);
		byte[] bReceived = rpcclient.call(bSend);
		int temp = RPCUtils.unmarshallInteger(bReceived);
		
		
//		if (true) {
//			throw new UnsupportedOperationException(TODO.method());
//		}
		
		return temp;
	}
	
}
