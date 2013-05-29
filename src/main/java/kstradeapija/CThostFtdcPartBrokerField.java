package kstradeapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd\u037e\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0571\ufffd<br>
 * <i>native declaration : linuxapi/CTP/KSUserApiStructEx.h:478</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("kstradeapija") 
public class CThostFtdcPartBrokerField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(1) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(3) 
	public int IsActive() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(3) 
	public CThostFtdcPartBrokerField IsActive(int IsActive) {
		this.io.setIntField(this, 3, IsActive);
		return this;
	}
	public CThostFtdcPartBrokerField() {
		super();
	}
	public CThostFtdcPartBrokerField(Pointer pointer) {
		super(pointer);
	}
}