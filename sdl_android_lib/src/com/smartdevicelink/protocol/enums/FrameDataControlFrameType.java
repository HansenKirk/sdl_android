package com.smartdevicelink.protocol.enums;

import java.util.Vector;

import com.smartdevicelink.util.ByteEnumer;

public class FrameDataControlFrameType extends ByteEnumer {
	private static Vector<FrameDataControlFrameType> theList = new Vector<FrameDataControlFrameType>();
	public static Vector<FrameDataControlFrameType> getList() { return theList; } 

	@SuppressWarnings("unused")
    private byte _i = 0x00;

	protected FrameDataControlFrameType(byte value, String name) {super(value, name);}
	public final static FrameDataControlFrameType Heartbeat = new FrameDataControlFrameType((byte)0x0, "Heartbeat");
	public final static FrameDataControlFrameType StartSession = new FrameDataControlFrameType((byte)0x01, "StartSession");
	public final static FrameDataControlFrameType StartSessionACK = new FrameDataControlFrameType((byte)0x02, "StartSessionACK");
	public final static FrameDataControlFrameType StartSessionNACK = new FrameDataControlFrameType((byte)0x03, "StartSessionNACK");
	public final static FrameDataControlFrameType EndSession = new FrameDataControlFrameType((byte)0x04, "EndSession");
	public final static FrameDataControlFrameType EndSessionACK = new FrameDataControlFrameType((byte)0x05, "EndSessionACK");
	public final static FrameDataControlFrameType EndSessionNACK = new FrameDataControlFrameType((byte)0x06, "EndSessionNACK");
	public final static FrameDataControlFrameType HeartbeatACK = new FrameDataControlFrameType((byte)0xFF, "HeartbeatACK");

	static {
		theList.addElement(Heartbeat);
		theList.addElement(StartSession);
		theList.addElement(StartSessionACK);
		theList.addElement(StartSessionNACK);
		theList.addElement(EndSession);	
		theList.addElement(EndSessionACK);
		theList.addElement(EndSessionNACK);
		theList.addElement(HeartbeatACK);
	}

	public static FrameDataControlFrameType valueOf(String passedButton) {
		return (FrameDataControlFrameType) get(theList, passedButton);
	} // end-method

	public static FrameDataControlFrameType[] values() {
		return (FrameDataControlFrameType[]) theList.toArray();
	} // end-method
} // end-class