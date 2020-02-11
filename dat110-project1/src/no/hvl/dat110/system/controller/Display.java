package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class Display extends RPCStub {

	private byte RPCID = 1;

	public void write(String message) {

		// TODO
		// implement marshalling, call and unmarshalling for write RPC method
		byte[] byteMarsh = RPCUtils.marshallString(RPCID, message);
		rpcclient.call(byteMarsh);
		RPCUtils.unmarshallString(byteMarsh);

//		throw new UnsupportedOperationException(TODO.method());
	}
}
