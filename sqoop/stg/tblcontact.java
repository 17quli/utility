// ORM class for table 'tblcontact'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:42:06 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tblcontact extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngContactKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.flngContactKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fintProfileNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fintProfileNumber = (Integer)value;
      }
    });
    setters.put("fstrContactType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrContactType = (String)value;
      }
    });
    setters.put("fstrPhoneType1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneType1 = (String)value;
      }
    });
    setters.put("fintCountryCode1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fintCountryCode1 = (Integer)value;
      }
    });
    setters.put("fstrCountry1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrCountry1 = (String)value;
      }
    });
    setters.put("fstrAreaCode1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrAreaCode1 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneNumber1 = (String)value;
      }
    });
    setters.put("fstrExtension1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrExtension1 = (String)value;
      }
    });
    setters.put("fstrPhoneType2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneType2 = (String)value;
      }
    });
    setters.put("fintCountryCode2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fintCountryCode2 = (Integer)value;
      }
    });
    setters.put("fstrCountry2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrCountry2 = (String)value;
      }
    });
    setters.put("fstrAreaCode2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrAreaCode2 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneNumber2 = (String)value;
      }
    });
    setters.put("fstrExtension2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrExtension2 = (String)value;
      }
    });
    setters.put("fstrPhoneType3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneType3 = (String)value;
      }
    });
    setters.put("fintCountryCode3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fintCountryCode3 = (Integer)value;
      }
    });
    setters.put("fstrCountry3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrCountry3 = (String)value;
      }
    });
    setters.put("fstrAreaCode3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrAreaCode3 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneNumber3 = (String)value;
      }
    });
    setters.put("fstrExtension3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrExtension3 = (String)value;
      }
    });
    setters.put("fstrPhoneType4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneType4 = (String)value;
      }
    });
    setters.put("fintCountryCode4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fintCountryCode4 = (Integer)value;
      }
    });
    setters.put("fstrCountry4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrCountry4 = (String)value;
      }
    });
    setters.put("fstrAreaCode4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrAreaCode4 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneNumber4 = (String)value;
      }
    });
    setters.put("fstrExtension4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrExtension4 = (String)value;
      }
    });
    setters.put("fstrPhoneType5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneType5 = (String)value;
      }
    });
    setters.put("fintCountryCode5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fintCountryCode5 = (Integer)value;
      }
    });
    setters.put("fstrCountry5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrCountry5 = (String)value;
      }
    });
    setters.put("fstrAreaCode5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrAreaCode5 = (String)value;
      }
    });
    setters.put("fstrPhoneNumber5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrPhoneNumber5 = (String)value;
      }
    });
    setters.put("fstrExtension5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrExtension5 = (String)value;
      }
    });
    setters.put("fstrContactName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrContactName = (String)value;
      }
    });
    setters.put("fstrEmail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrEmail = (String)value;
      }
    });
    setters.put("fstrNote", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrNote = (String)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblcontact.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblcontact() {
    init0();
  }
  private Integer flngContactKey;
  public Integer get_flngContactKey() {
    return flngContactKey;
  }
  public void set_flngContactKey(Integer flngContactKey) {
    this.flngContactKey = flngContactKey;
  }
  public tblcontact with_flngContactKey(Integer flngContactKey) {
    this.flngContactKey = flngContactKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblcontact with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblcontact with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblcontact with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer fintProfileNumber;
  public Integer get_fintProfileNumber() {
    return fintProfileNumber;
  }
  public void set_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
  }
  public tblcontact with_fintProfileNumber(Integer fintProfileNumber) {
    this.fintProfileNumber = fintProfileNumber;
    return this;
  }
  private String fstrContactType;
  public String get_fstrContactType() {
    return fstrContactType;
  }
  public void set_fstrContactType(String fstrContactType) {
    this.fstrContactType = fstrContactType;
  }
  public tblcontact with_fstrContactType(String fstrContactType) {
    this.fstrContactType = fstrContactType;
    return this;
  }
  private String fstrPhoneType1;
  public String get_fstrPhoneType1() {
    return fstrPhoneType1;
  }
  public void set_fstrPhoneType1(String fstrPhoneType1) {
    this.fstrPhoneType1 = fstrPhoneType1;
  }
  public tblcontact with_fstrPhoneType1(String fstrPhoneType1) {
    this.fstrPhoneType1 = fstrPhoneType1;
    return this;
  }
  private Integer fintCountryCode1;
  public Integer get_fintCountryCode1() {
    return fintCountryCode1;
  }
  public void set_fintCountryCode1(Integer fintCountryCode1) {
    this.fintCountryCode1 = fintCountryCode1;
  }
  public tblcontact with_fintCountryCode1(Integer fintCountryCode1) {
    this.fintCountryCode1 = fintCountryCode1;
    return this;
  }
  private String fstrCountry1;
  public String get_fstrCountry1() {
    return fstrCountry1;
  }
  public void set_fstrCountry1(String fstrCountry1) {
    this.fstrCountry1 = fstrCountry1;
  }
  public tblcontact with_fstrCountry1(String fstrCountry1) {
    this.fstrCountry1 = fstrCountry1;
    return this;
  }
  private String fstrAreaCode1;
  public String get_fstrAreaCode1() {
    return fstrAreaCode1;
  }
  public void set_fstrAreaCode1(String fstrAreaCode1) {
    this.fstrAreaCode1 = fstrAreaCode1;
  }
  public tblcontact with_fstrAreaCode1(String fstrAreaCode1) {
    this.fstrAreaCode1 = fstrAreaCode1;
    return this;
  }
  private String fstrPhoneNumber1;
  public String get_fstrPhoneNumber1() {
    return fstrPhoneNumber1;
  }
  public void set_fstrPhoneNumber1(String fstrPhoneNumber1) {
    this.fstrPhoneNumber1 = fstrPhoneNumber1;
  }
  public tblcontact with_fstrPhoneNumber1(String fstrPhoneNumber1) {
    this.fstrPhoneNumber1 = fstrPhoneNumber1;
    return this;
  }
  private String fstrExtension1;
  public String get_fstrExtension1() {
    return fstrExtension1;
  }
  public void set_fstrExtension1(String fstrExtension1) {
    this.fstrExtension1 = fstrExtension1;
  }
  public tblcontact with_fstrExtension1(String fstrExtension1) {
    this.fstrExtension1 = fstrExtension1;
    return this;
  }
  private String fstrPhoneType2;
  public String get_fstrPhoneType2() {
    return fstrPhoneType2;
  }
  public void set_fstrPhoneType2(String fstrPhoneType2) {
    this.fstrPhoneType2 = fstrPhoneType2;
  }
  public tblcontact with_fstrPhoneType2(String fstrPhoneType2) {
    this.fstrPhoneType2 = fstrPhoneType2;
    return this;
  }
  private Integer fintCountryCode2;
  public Integer get_fintCountryCode2() {
    return fintCountryCode2;
  }
  public void set_fintCountryCode2(Integer fintCountryCode2) {
    this.fintCountryCode2 = fintCountryCode2;
  }
  public tblcontact with_fintCountryCode2(Integer fintCountryCode2) {
    this.fintCountryCode2 = fintCountryCode2;
    return this;
  }
  private String fstrCountry2;
  public String get_fstrCountry2() {
    return fstrCountry2;
  }
  public void set_fstrCountry2(String fstrCountry2) {
    this.fstrCountry2 = fstrCountry2;
  }
  public tblcontact with_fstrCountry2(String fstrCountry2) {
    this.fstrCountry2 = fstrCountry2;
    return this;
  }
  private String fstrAreaCode2;
  public String get_fstrAreaCode2() {
    return fstrAreaCode2;
  }
  public void set_fstrAreaCode2(String fstrAreaCode2) {
    this.fstrAreaCode2 = fstrAreaCode2;
  }
  public tblcontact with_fstrAreaCode2(String fstrAreaCode2) {
    this.fstrAreaCode2 = fstrAreaCode2;
    return this;
  }
  private String fstrPhoneNumber2;
  public String get_fstrPhoneNumber2() {
    return fstrPhoneNumber2;
  }
  public void set_fstrPhoneNumber2(String fstrPhoneNumber2) {
    this.fstrPhoneNumber2 = fstrPhoneNumber2;
  }
  public tblcontact with_fstrPhoneNumber2(String fstrPhoneNumber2) {
    this.fstrPhoneNumber2 = fstrPhoneNumber2;
    return this;
  }
  private String fstrExtension2;
  public String get_fstrExtension2() {
    return fstrExtension2;
  }
  public void set_fstrExtension2(String fstrExtension2) {
    this.fstrExtension2 = fstrExtension2;
  }
  public tblcontact with_fstrExtension2(String fstrExtension2) {
    this.fstrExtension2 = fstrExtension2;
    return this;
  }
  private String fstrPhoneType3;
  public String get_fstrPhoneType3() {
    return fstrPhoneType3;
  }
  public void set_fstrPhoneType3(String fstrPhoneType3) {
    this.fstrPhoneType3 = fstrPhoneType3;
  }
  public tblcontact with_fstrPhoneType3(String fstrPhoneType3) {
    this.fstrPhoneType3 = fstrPhoneType3;
    return this;
  }
  private Integer fintCountryCode3;
  public Integer get_fintCountryCode3() {
    return fintCountryCode3;
  }
  public void set_fintCountryCode3(Integer fintCountryCode3) {
    this.fintCountryCode3 = fintCountryCode3;
  }
  public tblcontact with_fintCountryCode3(Integer fintCountryCode3) {
    this.fintCountryCode3 = fintCountryCode3;
    return this;
  }
  private String fstrCountry3;
  public String get_fstrCountry3() {
    return fstrCountry3;
  }
  public void set_fstrCountry3(String fstrCountry3) {
    this.fstrCountry3 = fstrCountry3;
  }
  public tblcontact with_fstrCountry3(String fstrCountry3) {
    this.fstrCountry3 = fstrCountry3;
    return this;
  }
  private String fstrAreaCode3;
  public String get_fstrAreaCode3() {
    return fstrAreaCode3;
  }
  public void set_fstrAreaCode3(String fstrAreaCode3) {
    this.fstrAreaCode3 = fstrAreaCode3;
  }
  public tblcontact with_fstrAreaCode3(String fstrAreaCode3) {
    this.fstrAreaCode3 = fstrAreaCode3;
    return this;
  }
  private String fstrPhoneNumber3;
  public String get_fstrPhoneNumber3() {
    return fstrPhoneNumber3;
  }
  public void set_fstrPhoneNumber3(String fstrPhoneNumber3) {
    this.fstrPhoneNumber3 = fstrPhoneNumber3;
  }
  public tblcontact with_fstrPhoneNumber3(String fstrPhoneNumber3) {
    this.fstrPhoneNumber3 = fstrPhoneNumber3;
    return this;
  }
  private String fstrExtension3;
  public String get_fstrExtension3() {
    return fstrExtension3;
  }
  public void set_fstrExtension3(String fstrExtension3) {
    this.fstrExtension3 = fstrExtension3;
  }
  public tblcontact with_fstrExtension3(String fstrExtension3) {
    this.fstrExtension3 = fstrExtension3;
    return this;
  }
  private String fstrPhoneType4;
  public String get_fstrPhoneType4() {
    return fstrPhoneType4;
  }
  public void set_fstrPhoneType4(String fstrPhoneType4) {
    this.fstrPhoneType4 = fstrPhoneType4;
  }
  public tblcontact with_fstrPhoneType4(String fstrPhoneType4) {
    this.fstrPhoneType4 = fstrPhoneType4;
    return this;
  }
  private Integer fintCountryCode4;
  public Integer get_fintCountryCode4() {
    return fintCountryCode4;
  }
  public void set_fintCountryCode4(Integer fintCountryCode4) {
    this.fintCountryCode4 = fintCountryCode4;
  }
  public tblcontact with_fintCountryCode4(Integer fintCountryCode4) {
    this.fintCountryCode4 = fintCountryCode4;
    return this;
  }
  private String fstrCountry4;
  public String get_fstrCountry4() {
    return fstrCountry4;
  }
  public void set_fstrCountry4(String fstrCountry4) {
    this.fstrCountry4 = fstrCountry4;
  }
  public tblcontact with_fstrCountry4(String fstrCountry4) {
    this.fstrCountry4 = fstrCountry4;
    return this;
  }
  private String fstrAreaCode4;
  public String get_fstrAreaCode4() {
    return fstrAreaCode4;
  }
  public void set_fstrAreaCode4(String fstrAreaCode4) {
    this.fstrAreaCode4 = fstrAreaCode4;
  }
  public tblcontact with_fstrAreaCode4(String fstrAreaCode4) {
    this.fstrAreaCode4 = fstrAreaCode4;
    return this;
  }
  private String fstrPhoneNumber4;
  public String get_fstrPhoneNumber4() {
    return fstrPhoneNumber4;
  }
  public void set_fstrPhoneNumber4(String fstrPhoneNumber4) {
    this.fstrPhoneNumber4 = fstrPhoneNumber4;
  }
  public tblcontact with_fstrPhoneNumber4(String fstrPhoneNumber4) {
    this.fstrPhoneNumber4 = fstrPhoneNumber4;
    return this;
  }
  private String fstrExtension4;
  public String get_fstrExtension4() {
    return fstrExtension4;
  }
  public void set_fstrExtension4(String fstrExtension4) {
    this.fstrExtension4 = fstrExtension4;
  }
  public tblcontact with_fstrExtension4(String fstrExtension4) {
    this.fstrExtension4 = fstrExtension4;
    return this;
  }
  private String fstrPhoneType5;
  public String get_fstrPhoneType5() {
    return fstrPhoneType5;
  }
  public void set_fstrPhoneType5(String fstrPhoneType5) {
    this.fstrPhoneType5 = fstrPhoneType5;
  }
  public tblcontact with_fstrPhoneType5(String fstrPhoneType5) {
    this.fstrPhoneType5 = fstrPhoneType5;
    return this;
  }
  private Integer fintCountryCode5;
  public Integer get_fintCountryCode5() {
    return fintCountryCode5;
  }
  public void set_fintCountryCode5(Integer fintCountryCode5) {
    this.fintCountryCode5 = fintCountryCode5;
  }
  public tblcontact with_fintCountryCode5(Integer fintCountryCode5) {
    this.fintCountryCode5 = fintCountryCode5;
    return this;
  }
  private String fstrCountry5;
  public String get_fstrCountry5() {
    return fstrCountry5;
  }
  public void set_fstrCountry5(String fstrCountry5) {
    this.fstrCountry5 = fstrCountry5;
  }
  public tblcontact with_fstrCountry5(String fstrCountry5) {
    this.fstrCountry5 = fstrCountry5;
    return this;
  }
  private String fstrAreaCode5;
  public String get_fstrAreaCode5() {
    return fstrAreaCode5;
  }
  public void set_fstrAreaCode5(String fstrAreaCode5) {
    this.fstrAreaCode5 = fstrAreaCode5;
  }
  public tblcontact with_fstrAreaCode5(String fstrAreaCode5) {
    this.fstrAreaCode5 = fstrAreaCode5;
    return this;
  }
  private String fstrPhoneNumber5;
  public String get_fstrPhoneNumber5() {
    return fstrPhoneNumber5;
  }
  public void set_fstrPhoneNumber5(String fstrPhoneNumber5) {
    this.fstrPhoneNumber5 = fstrPhoneNumber5;
  }
  public tblcontact with_fstrPhoneNumber5(String fstrPhoneNumber5) {
    this.fstrPhoneNumber5 = fstrPhoneNumber5;
    return this;
  }
  private String fstrExtension5;
  public String get_fstrExtension5() {
    return fstrExtension5;
  }
  public void set_fstrExtension5(String fstrExtension5) {
    this.fstrExtension5 = fstrExtension5;
  }
  public tblcontact with_fstrExtension5(String fstrExtension5) {
    this.fstrExtension5 = fstrExtension5;
    return this;
  }
  private String fstrContactName;
  public String get_fstrContactName() {
    return fstrContactName;
  }
  public void set_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
  }
  public tblcontact with_fstrContactName(String fstrContactName) {
    this.fstrContactName = fstrContactName;
    return this;
  }
  private String fstrEmail;
  public String get_fstrEmail() {
    return fstrEmail;
  }
  public void set_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
  }
  public tblcontact with_fstrEmail(String fstrEmail) {
    this.fstrEmail = fstrEmail;
    return this;
  }
  private String fstrNote;
  public String get_fstrNote() {
    return fstrNote;
  }
  public void set_fstrNote(String fstrNote) {
    this.fstrNote = fstrNote;
  }
  public tblcontact with_fstrNote(String fstrNote) {
    this.fstrNote = fstrNote;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblcontact with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblcontact with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblcontact with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblcontact with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcontact)) {
      return false;
    }
    tblcontact that = (tblcontact) o;
    boolean equal = true;
    equal = equal && (this.flngContactKey == null ? that.flngContactKey == null : this.flngContactKey.equals(that.flngContactKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.fstrContactType == null ? that.fstrContactType == null : this.fstrContactType.equals(that.fstrContactType));
    equal = equal && (this.fstrPhoneType1 == null ? that.fstrPhoneType1 == null : this.fstrPhoneType1.equals(that.fstrPhoneType1));
    equal = equal && (this.fintCountryCode1 == null ? that.fintCountryCode1 == null : this.fintCountryCode1.equals(that.fintCountryCode1));
    equal = equal && (this.fstrCountry1 == null ? that.fstrCountry1 == null : this.fstrCountry1.equals(that.fstrCountry1));
    equal = equal && (this.fstrAreaCode1 == null ? that.fstrAreaCode1 == null : this.fstrAreaCode1.equals(that.fstrAreaCode1));
    equal = equal && (this.fstrPhoneNumber1 == null ? that.fstrPhoneNumber1 == null : this.fstrPhoneNumber1.equals(that.fstrPhoneNumber1));
    equal = equal && (this.fstrExtension1 == null ? that.fstrExtension1 == null : this.fstrExtension1.equals(that.fstrExtension1));
    equal = equal && (this.fstrPhoneType2 == null ? that.fstrPhoneType2 == null : this.fstrPhoneType2.equals(that.fstrPhoneType2));
    equal = equal && (this.fintCountryCode2 == null ? that.fintCountryCode2 == null : this.fintCountryCode2.equals(that.fintCountryCode2));
    equal = equal && (this.fstrCountry2 == null ? that.fstrCountry2 == null : this.fstrCountry2.equals(that.fstrCountry2));
    equal = equal && (this.fstrAreaCode2 == null ? that.fstrAreaCode2 == null : this.fstrAreaCode2.equals(that.fstrAreaCode2));
    equal = equal && (this.fstrPhoneNumber2 == null ? that.fstrPhoneNumber2 == null : this.fstrPhoneNumber2.equals(that.fstrPhoneNumber2));
    equal = equal && (this.fstrExtension2 == null ? that.fstrExtension2 == null : this.fstrExtension2.equals(that.fstrExtension2));
    equal = equal && (this.fstrPhoneType3 == null ? that.fstrPhoneType3 == null : this.fstrPhoneType3.equals(that.fstrPhoneType3));
    equal = equal && (this.fintCountryCode3 == null ? that.fintCountryCode3 == null : this.fintCountryCode3.equals(that.fintCountryCode3));
    equal = equal && (this.fstrCountry3 == null ? that.fstrCountry3 == null : this.fstrCountry3.equals(that.fstrCountry3));
    equal = equal && (this.fstrAreaCode3 == null ? that.fstrAreaCode3 == null : this.fstrAreaCode3.equals(that.fstrAreaCode3));
    equal = equal && (this.fstrPhoneNumber3 == null ? that.fstrPhoneNumber3 == null : this.fstrPhoneNumber3.equals(that.fstrPhoneNumber3));
    equal = equal && (this.fstrExtension3 == null ? that.fstrExtension3 == null : this.fstrExtension3.equals(that.fstrExtension3));
    equal = equal && (this.fstrPhoneType4 == null ? that.fstrPhoneType4 == null : this.fstrPhoneType4.equals(that.fstrPhoneType4));
    equal = equal && (this.fintCountryCode4 == null ? that.fintCountryCode4 == null : this.fintCountryCode4.equals(that.fintCountryCode4));
    equal = equal && (this.fstrCountry4 == null ? that.fstrCountry4 == null : this.fstrCountry4.equals(that.fstrCountry4));
    equal = equal && (this.fstrAreaCode4 == null ? that.fstrAreaCode4 == null : this.fstrAreaCode4.equals(that.fstrAreaCode4));
    equal = equal && (this.fstrPhoneNumber4 == null ? that.fstrPhoneNumber4 == null : this.fstrPhoneNumber4.equals(that.fstrPhoneNumber4));
    equal = equal && (this.fstrExtension4 == null ? that.fstrExtension4 == null : this.fstrExtension4.equals(that.fstrExtension4));
    equal = equal && (this.fstrPhoneType5 == null ? that.fstrPhoneType5 == null : this.fstrPhoneType5.equals(that.fstrPhoneType5));
    equal = equal && (this.fintCountryCode5 == null ? that.fintCountryCode5 == null : this.fintCountryCode5.equals(that.fintCountryCode5));
    equal = equal && (this.fstrCountry5 == null ? that.fstrCountry5 == null : this.fstrCountry5.equals(that.fstrCountry5));
    equal = equal && (this.fstrAreaCode5 == null ? that.fstrAreaCode5 == null : this.fstrAreaCode5.equals(that.fstrAreaCode5));
    equal = equal && (this.fstrPhoneNumber5 == null ? that.fstrPhoneNumber5 == null : this.fstrPhoneNumber5.equals(that.fstrPhoneNumber5));
    equal = equal && (this.fstrExtension5 == null ? that.fstrExtension5 == null : this.fstrExtension5.equals(that.fstrExtension5));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrNote == null ? that.fstrNote == null : this.fstrNote.equals(that.fstrNote));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblcontact)) {
      return false;
    }
    tblcontact that = (tblcontact) o;
    boolean equal = true;
    equal = equal && (this.flngContactKey == null ? that.flngContactKey == null : this.flngContactKey.equals(that.flngContactKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fintProfileNumber == null ? that.fintProfileNumber == null : this.fintProfileNumber.equals(that.fintProfileNumber));
    equal = equal && (this.fstrContactType == null ? that.fstrContactType == null : this.fstrContactType.equals(that.fstrContactType));
    equal = equal && (this.fstrPhoneType1 == null ? that.fstrPhoneType1 == null : this.fstrPhoneType1.equals(that.fstrPhoneType1));
    equal = equal && (this.fintCountryCode1 == null ? that.fintCountryCode1 == null : this.fintCountryCode1.equals(that.fintCountryCode1));
    equal = equal && (this.fstrCountry1 == null ? that.fstrCountry1 == null : this.fstrCountry1.equals(that.fstrCountry1));
    equal = equal && (this.fstrAreaCode1 == null ? that.fstrAreaCode1 == null : this.fstrAreaCode1.equals(that.fstrAreaCode1));
    equal = equal && (this.fstrPhoneNumber1 == null ? that.fstrPhoneNumber1 == null : this.fstrPhoneNumber1.equals(that.fstrPhoneNumber1));
    equal = equal && (this.fstrExtension1 == null ? that.fstrExtension1 == null : this.fstrExtension1.equals(that.fstrExtension1));
    equal = equal && (this.fstrPhoneType2 == null ? that.fstrPhoneType2 == null : this.fstrPhoneType2.equals(that.fstrPhoneType2));
    equal = equal && (this.fintCountryCode2 == null ? that.fintCountryCode2 == null : this.fintCountryCode2.equals(that.fintCountryCode2));
    equal = equal && (this.fstrCountry2 == null ? that.fstrCountry2 == null : this.fstrCountry2.equals(that.fstrCountry2));
    equal = equal && (this.fstrAreaCode2 == null ? that.fstrAreaCode2 == null : this.fstrAreaCode2.equals(that.fstrAreaCode2));
    equal = equal && (this.fstrPhoneNumber2 == null ? that.fstrPhoneNumber2 == null : this.fstrPhoneNumber2.equals(that.fstrPhoneNumber2));
    equal = equal && (this.fstrExtension2 == null ? that.fstrExtension2 == null : this.fstrExtension2.equals(that.fstrExtension2));
    equal = equal && (this.fstrPhoneType3 == null ? that.fstrPhoneType3 == null : this.fstrPhoneType3.equals(that.fstrPhoneType3));
    equal = equal && (this.fintCountryCode3 == null ? that.fintCountryCode3 == null : this.fintCountryCode3.equals(that.fintCountryCode3));
    equal = equal && (this.fstrCountry3 == null ? that.fstrCountry3 == null : this.fstrCountry3.equals(that.fstrCountry3));
    equal = equal && (this.fstrAreaCode3 == null ? that.fstrAreaCode3 == null : this.fstrAreaCode3.equals(that.fstrAreaCode3));
    equal = equal && (this.fstrPhoneNumber3 == null ? that.fstrPhoneNumber3 == null : this.fstrPhoneNumber3.equals(that.fstrPhoneNumber3));
    equal = equal && (this.fstrExtension3 == null ? that.fstrExtension3 == null : this.fstrExtension3.equals(that.fstrExtension3));
    equal = equal && (this.fstrPhoneType4 == null ? that.fstrPhoneType4 == null : this.fstrPhoneType4.equals(that.fstrPhoneType4));
    equal = equal && (this.fintCountryCode4 == null ? that.fintCountryCode4 == null : this.fintCountryCode4.equals(that.fintCountryCode4));
    equal = equal && (this.fstrCountry4 == null ? that.fstrCountry4 == null : this.fstrCountry4.equals(that.fstrCountry4));
    equal = equal && (this.fstrAreaCode4 == null ? that.fstrAreaCode4 == null : this.fstrAreaCode4.equals(that.fstrAreaCode4));
    equal = equal && (this.fstrPhoneNumber4 == null ? that.fstrPhoneNumber4 == null : this.fstrPhoneNumber4.equals(that.fstrPhoneNumber4));
    equal = equal && (this.fstrExtension4 == null ? that.fstrExtension4 == null : this.fstrExtension4.equals(that.fstrExtension4));
    equal = equal && (this.fstrPhoneType5 == null ? that.fstrPhoneType5 == null : this.fstrPhoneType5.equals(that.fstrPhoneType5));
    equal = equal && (this.fintCountryCode5 == null ? that.fintCountryCode5 == null : this.fintCountryCode5.equals(that.fintCountryCode5));
    equal = equal && (this.fstrCountry5 == null ? that.fstrCountry5 == null : this.fstrCountry5.equals(that.fstrCountry5));
    equal = equal && (this.fstrAreaCode5 == null ? that.fstrAreaCode5 == null : this.fstrAreaCode5.equals(that.fstrAreaCode5));
    equal = equal && (this.fstrPhoneNumber5 == null ? that.fstrPhoneNumber5 == null : this.fstrPhoneNumber5.equals(that.fstrPhoneNumber5));
    equal = equal && (this.fstrExtension5 == null ? that.fstrExtension5 == null : this.fstrExtension5.equals(that.fstrExtension5));
    equal = equal && (this.fstrContactName == null ? that.fstrContactName == null : this.fstrContactName.equals(that.fstrContactName));
    equal = equal && (this.fstrEmail == null ? that.fstrEmail == null : this.fstrEmail.equals(that.fstrEmail));
    equal = equal && (this.fstrNote == null ? that.fstrNote == null : this.fstrNote.equals(that.fstrNote));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngContactKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrContactType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPhoneType1 = JdbcWritableBridge.readString(7, __dbResults);
    this.fintCountryCode1 = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrCountry1 = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAreaCode1 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrPhoneNumber1 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrExtension1 = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPhoneType2 = JdbcWritableBridge.readString(13, __dbResults);
    this.fintCountryCode2 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrCountry2 = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrAreaCode2 = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrPhoneNumber2 = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrExtension2 = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrPhoneType3 = JdbcWritableBridge.readString(19, __dbResults);
    this.fintCountryCode3 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrCountry3 = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrAreaCode3 = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrPhoneNumber3 = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrExtension3 = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPhoneType4 = JdbcWritableBridge.readString(25, __dbResults);
    this.fintCountryCode4 = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fstrCountry4 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrAreaCode4 = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrPhoneNumber4 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrExtension4 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrPhoneType5 = JdbcWritableBridge.readString(31, __dbResults);
    this.fintCountryCode5 = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fstrCountry5 = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrAreaCode5 = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrPhoneNumber5 = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrExtension5 = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrNote = JdbcWritableBridge.readString(39, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(42, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(43, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngContactKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintProfileNumber = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrContactType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrPhoneType1 = JdbcWritableBridge.readString(7, __dbResults);
    this.fintCountryCode1 = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fstrCountry1 = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrAreaCode1 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrPhoneNumber1 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrExtension1 = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrPhoneType2 = JdbcWritableBridge.readString(13, __dbResults);
    this.fintCountryCode2 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fstrCountry2 = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrAreaCode2 = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrPhoneNumber2 = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrExtension2 = JdbcWritableBridge.readString(18, __dbResults);
    this.fstrPhoneType3 = JdbcWritableBridge.readString(19, __dbResults);
    this.fintCountryCode3 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrCountry3 = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrAreaCode3 = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrPhoneNumber3 = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrExtension3 = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPhoneType4 = JdbcWritableBridge.readString(25, __dbResults);
    this.fintCountryCode4 = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fstrCountry4 = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrAreaCode4 = JdbcWritableBridge.readString(28, __dbResults);
    this.fstrPhoneNumber4 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrExtension4 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrPhoneType5 = JdbcWritableBridge.readString(31, __dbResults);
    this.fintCountryCode5 = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fstrCountry5 = JdbcWritableBridge.readString(33, __dbResults);
    this.fstrAreaCode5 = JdbcWritableBridge.readString(34, __dbResults);
    this.fstrPhoneNumber5 = JdbcWritableBridge.readString(35, __dbResults);
    this.fstrExtension5 = JdbcWritableBridge.readString(36, __dbResults);
    this.fstrContactName = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrEmail = JdbcWritableBridge.readString(38, __dbResults);
    this.fstrNote = JdbcWritableBridge.readString(39, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(41, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(42, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(43, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngContactKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType1, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode1, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry1, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode1, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber1, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension1, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType2, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode2, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry2, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode2, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber2, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension2, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType3, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode3, 20 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry3, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode3, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber3, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension3, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType4, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode4, 26 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry4, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode4, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber4, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension4, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType5, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode5, 32 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry5, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode5, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber5, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension5, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNote, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 40 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 43 + __off, 93, __dbStmt);
    return 43;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngContactKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintProfileNumber, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType1, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode1, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry1, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode1, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber1, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension1, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType2, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode2, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry2, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode2, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber2, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension2, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType3, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode3, 20 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry3, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode3, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber3, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension3, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType4, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode4, 26 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry4, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode4, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber4, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension4, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneType5, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode5, 32 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry5, 33 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode5, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber5, 35 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExtension5, 36 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrContactName, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmail, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrNote, 39 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 40 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 41 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 42 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 43 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngContactKey = null;
    } else {
    this.flngContactKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintProfileNumber = null;
    } else {
    this.fintProfileNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactType = null;
    } else {
    this.fstrContactType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType1 = null;
    } else {
    this.fstrPhoneType1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode1 = null;
    } else {
    this.fintCountryCode1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry1 = null;
    } else {
    this.fstrCountry1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode1 = null;
    } else {
    this.fstrAreaCode1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber1 = null;
    } else {
    this.fstrPhoneNumber1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension1 = null;
    } else {
    this.fstrExtension1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType2 = null;
    } else {
    this.fstrPhoneType2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode2 = null;
    } else {
    this.fintCountryCode2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry2 = null;
    } else {
    this.fstrCountry2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode2 = null;
    } else {
    this.fstrAreaCode2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber2 = null;
    } else {
    this.fstrPhoneNumber2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension2 = null;
    } else {
    this.fstrExtension2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType3 = null;
    } else {
    this.fstrPhoneType3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode3 = null;
    } else {
    this.fintCountryCode3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry3 = null;
    } else {
    this.fstrCountry3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode3 = null;
    } else {
    this.fstrAreaCode3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber3 = null;
    } else {
    this.fstrPhoneNumber3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension3 = null;
    } else {
    this.fstrExtension3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType4 = null;
    } else {
    this.fstrPhoneType4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode4 = null;
    } else {
    this.fintCountryCode4 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry4 = null;
    } else {
    this.fstrCountry4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode4 = null;
    } else {
    this.fstrAreaCode4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber4 = null;
    } else {
    this.fstrPhoneNumber4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension4 = null;
    } else {
    this.fstrExtension4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneType5 = null;
    } else {
    this.fstrPhoneType5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode5 = null;
    } else {
    this.fintCountryCode5 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry5 = null;
    } else {
    this.fstrCountry5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode5 = null;
    } else {
    this.fstrAreaCode5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber5 = null;
    } else {
    this.fstrPhoneNumber5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExtension5 = null;
    } else {
    this.fstrExtension5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContactName = null;
    } else {
    this.fstrContactName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmail = null;
    } else {
    this.fstrEmail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrNote = null;
    } else {
    this.fstrNote = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.flngContactKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngContactKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.fstrContactType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactType);
    }
    if (null == this.fstrPhoneType1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType1);
    }
    if (null == this.fintCountryCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode1);
    }
    if (null == this.fstrCountry1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry1);
    }
    if (null == this.fstrAreaCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode1);
    }
    if (null == this.fstrPhoneNumber1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber1);
    }
    if (null == this.fstrExtension1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension1);
    }
    if (null == this.fstrPhoneType2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType2);
    }
    if (null == this.fintCountryCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode2);
    }
    if (null == this.fstrCountry2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry2);
    }
    if (null == this.fstrAreaCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode2);
    }
    if (null == this.fstrPhoneNumber2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber2);
    }
    if (null == this.fstrExtension2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension2);
    }
    if (null == this.fstrPhoneType3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType3);
    }
    if (null == this.fintCountryCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode3);
    }
    if (null == this.fstrCountry3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry3);
    }
    if (null == this.fstrAreaCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode3);
    }
    if (null == this.fstrPhoneNumber3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber3);
    }
    if (null == this.fstrExtension3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension3);
    }
    if (null == this.fstrPhoneType4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType4);
    }
    if (null == this.fintCountryCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode4);
    }
    if (null == this.fstrCountry4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry4);
    }
    if (null == this.fstrAreaCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode4);
    }
    if (null == this.fstrPhoneNumber4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber4);
    }
    if (null == this.fstrExtension4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension4);
    }
    if (null == this.fstrPhoneType5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType5);
    }
    if (null == this.fintCountryCode5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode5);
    }
    if (null == this.fstrCountry5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry5);
    }
    if (null == this.fstrAreaCode5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode5);
    }
    if (null == this.fstrPhoneNumber5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber5);
    }
    if (null == this.fstrExtension5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension5);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNote);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.flngContactKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngContactKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fintProfileNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintProfileNumber);
    }
    if (null == this.fstrContactType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactType);
    }
    if (null == this.fstrPhoneType1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType1);
    }
    if (null == this.fintCountryCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode1);
    }
    if (null == this.fstrCountry1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry1);
    }
    if (null == this.fstrAreaCode1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode1);
    }
    if (null == this.fstrPhoneNumber1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber1);
    }
    if (null == this.fstrExtension1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension1);
    }
    if (null == this.fstrPhoneType2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType2);
    }
    if (null == this.fintCountryCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode2);
    }
    if (null == this.fstrCountry2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry2);
    }
    if (null == this.fstrAreaCode2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode2);
    }
    if (null == this.fstrPhoneNumber2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber2);
    }
    if (null == this.fstrExtension2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension2);
    }
    if (null == this.fstrPhoneType3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType3);
    }
    if (null == this.fintCountryCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode3);
    }
    if (null == this.fstrCountry3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry3);
    }
    if (null == this.fstrAreaCode3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode3);
    }
    if (null == this.fstrPhoneNumber3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber3);
    }
    if (null == this.fstrExtension3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension3);
    }
    if (null == this.fstrPhoneType4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType4);
    }
    if (null == this.fintCountryCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode4);
    }
    if (null == this.fstrCountry4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry4);
    }
    if (null == this.fstrAreaCode4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode4);
    }
    if (null == this.fstrPhoneNumber4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber4);
    }
    if (null == this.fstrExtension4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension4);
    }
    if (null == this.fstrPhoneType5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneType5);
    }
    if (null == this.fintCountryCode5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode5);
    }
    if (null == this.fstrCountry5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry5);
    }
    if (null == this.fstrAreaCode5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode5);
    }
    if (null == this.fstrPhoneNumber5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber5);
    }
    if (null == this.fstrExtension5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExtension5);
    }
    if (null == this.fstrContactName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContactName);
    }
    if (null == this.fstrEmail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmail);
    }
    if (null == this.fstrNote) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrNote);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(flngContactKey==null?"\\N":"" + flngContactKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactType==null?"\\N":fstrContactType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType1==null?"\\N":fstrPhoneType1, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode1==null?"\\N":"" + fintCountryCode1, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry1==null?"\\N":fstrCountry1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode1==null?"\\N":fstrAreaCode1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber1==null?"\\N":fstrPhoneNumber1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension1==null?"\\N":fstrExtension1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType2==null?"\\N":fstrPhoneType2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode2==null?"\\N":"" + fintCountryCode2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry2==null?"\\N":fstrCountry2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode2==null?"\\N":fstrAreaCode2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber2==null?"\\N":fstrPhoneNumber2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension2==null?"\\N":fstrExtension2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType3==null?"\\N":fstrPhoneType3, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode3==null?"\\N":"" + fintCountryCode3, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry3==null?"\\N":fstrCountry3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode3==null?"\\N":fstrAreaCode3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber3==null?"\\N":fstrPhoneNumber3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension3==null?"\\N":fstrExtension3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType4==null?"\\N":fstrPhoneType4, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode4==null?"\\N":"" + fintCountryCode4, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry4==null?"\\N":fstrCountry4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode4==null?"\\N":fstrAreaCode4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber4==null?"\\N":fstrPhoneNumber4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension4==null?"\\N":fstrExtension4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType5==null?"\\N":fstrPhoneType5, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode5==null?"\\N":"" + fintCountryCode5, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry5==null?"\\N":fstrCountry5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode5==null?"\\N":fstrAreaCode5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber5==null?"\\N":fstrPhoneNumber5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension5==null?"\\N":fstrExtension5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNote==null?"\\N":fstrNote, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(flngContactKey==null?"\\N":"" + flngContactKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintProfileNumber==null?"\\N":"" + fintProfileNumber, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactType==null?"\\N":fstrContactType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType1==null?"\\N":fstrPhoneType1, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode1==null?"\\N":"" + fintCountryCode1, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry1==null?"\\N":fstrCountry1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode1==null?"\\N":fstrAreaCode1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber1==null?"\\N":fstrPhoneNumber1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension1==null?"\\N":fstrExtension1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType2==null?"\\N":fstrPhoneType2, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode2==null?"\\N":"" + fintCountryCode2, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry2==null?"\\N":fstrCountry2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode2==null?"\\N":fstrAreaCode2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber2==null?"\\N":fstrPhoneNumber2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension2==null?"\\N":fstrExtension2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType3==null?"\\N":fstrPhoneType3, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode3==null?"\\N":"" + fintCountryCode3, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry3==null?"\\N":fstrCountry3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode3==null?"\\N":fstrAreaCode3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber3==null?"\\N":fstrPhoneNumber3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension3==null?"\\N":fstrExtension3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType4==null?"\\N":fstrPhoneType4, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode4==null?"\\N":"" + fintCountryCode4, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry4==null?"\\N":fstrCountry4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode4==null?"\\N":fstrAreaCode4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber4==null?"\\N":fstrPhoneNumber4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension4==null?"\\N":fstrExtension4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneType5==null?"\\N":fstrPhoneType5, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode5==null?"\\N":"" + fintCountryCode5, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry5==null?"\\N":fstrCountry5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode5==null?"\\N":fstrAreaCode5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber5==null?"\\N":fstrPhoneNumber5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExtension5==null?"\\N":fstrExtension5, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContactName==null?"\\N":fstrContactName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmail==null?"\\N":fstrEmail, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrNote==null?"\\N":fstrNote, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngContactKey = null; } else {
      this.flngContactKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactType = null; } else {
      this.fstrContactType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType1 = null; } else {
      this.fstrPhoneType1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode1 = null; } else {
      this.fintCountryCode1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry1 = null; } else {
      this.fstrCountry1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode1 = null; } else {
      this.fstrAreaCode1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber1 = null; } else {
      this.fstrPhoneNumber1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension1 = null; } else {
      this.fstrExtension1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType2 = null; } else {
      this.fstrPhoneType2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode2 = null; } else {
      this.fintCountryCode2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry2 = null; } else {
      this.fstrCountry2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode2 = null; } else {
      this.fstrAreaCode2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber2 = null; } else {
      this.fstrPhoneNumber2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension2 = null; } else {
      this.fstrExtension2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType3 = null; } else {
      this.fstrPhoneType3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode3 = null; } else {
      this.fintCountryCode3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry3 = null; } else {
      this.fstrCountry3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode3 = null; } else {
      this.fstrAreaCode3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber3 = null; } else {
      this.fstrPhoneNumber3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension3 = null; } else {
      this.fstrExtension3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType4 = null; } else {
      this.fstrPhoneType4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode4 = null; } else {
      this.fintCountryCode4 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry4 = null; } else {
      this.fstrCountry4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode4 = null; } else {
      this.fstrAreaCode4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber4 = null; } else {
      this.fstrPhoneNumber4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension4 = null; } else {
      this.fstrExtension4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType5 = null; } else {
      this.fstrPhoneType5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode5 = null; } else {
      this.fintCountryCode5 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry5 = null; } else {
      this.fstrCountry5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode5 = null; } else {
      this.fstrAreaCode5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber5 = null; } else {
      this.fstrPhoneNumber5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension5 = null; } else {
      this.fstrExtension5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNote = null; } else {
      this.fstrNote = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngContactKey = null; } else {
      this.flngContactKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintProfileNumber = null; } else {
      this.fintProfileNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactType = null; } else {
      this.fstrContactType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType1 = null; } else {
      this.fstrPhoneType1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode1 = null; } else {
      this.fintCountryCode1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry1 = null; } else {
      this.fstrCountry1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode1 = null; } else {
      this.fstrAreaCode1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber1 = null; } else {
      this.fstrPhoneNumber1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension1 = null; } else {
      this.fstrExtension1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType2 = null; } else {
      this.fstrPhoneType2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode2 = null; } else {
      this.fintCountryCode2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry2 = null; } else {
      this.fstrCountry2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode2 = null; } else {
      this.fstrAreaCode2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber2 = null; } else {
      this.fstrPhoneNumber2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension2 = null; } else {
      this.fstrExtension2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType3 = null; } else {
      this.fstrPhoneType3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode3 = null; } else {
      this.fintCountryCode3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry3 = null; } else {
      this.fstrCountry3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode3 = null; } else {
      this.fstrAreaCode3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber3 = null; } else {
      this.fstrPhoneNumber3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension3 = null; } else {
      this.fstrExtension3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType4 = null; } else {
      this.fstrPhoneType4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode4 = null; } else {
      this.fintCountryCode4 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry4 = null; } else {
      this.fstrCountry4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode4 = null; } else {
      this.fstrAreaCode4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber4 = null; } else {
      this.fstrPhoneNumber4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension4 = null; } else {
      this.fstrExtension4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneType5 = null; } else {
      this.fstrPhoneType5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode5 = null; } else {
      this.fintCountryCode5 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry5 = null; } else {
      this.fstrCountry5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode5 = null; } else {
      this.fstrAreaCode5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber5 = null; } else {
      this.fstrPhoneNumber5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExtension5 = null; } else {
      this.fstrExtension5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContactName = null; } else {
      this.fstrContactName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmail = null; } else {
      this.fstrEmail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrNote = null; } else {
      this.fstrNote = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblcontact o = (tblcontact) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblcontact o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngContactKey", this.flngContactKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("fstrContactType", this.fstrContactType);
    __sqoop$field_map.put("fstrPhoneType1", this.fstrPhoneType1);
    __sqoop$field_map.put("fintCountryCode1", this.fintCountryCode1);
    __sqoop$field_map.put("fstrCountry1", this.fstrCountry1);
    __sqoop$field_map.put("fstrAreaCode1", this.fstrAreaCode1);
    __sqoop$field_map.put("fstrPhoneNumber1", this.fstrPhoneNumber1);
    __sqoop$field_map.put("fstrExtension1", this.fstrExtension1);
    __sqoop$field_map.put("fstrPhoneType2", this.fstrPhoneType2);
    __sqoop$field_map.put("fintCountryCode2", this.fintCountryCode2);
    __sqoop$field_map.put("fstrCountry2", this.fstrCountry2);
    __sqoop$field_map.put("fstrAreaCode2", this.fstrAreaCode2);
    __sqoop$field_map.put("fstrPhoneNumber2", this.fstrPhoneNumber2);
    __sqoop$field_map.put("fstrExtension2", this.fstrExtension2);
    __sqoop$field_map.put("fstrPhoneType3", this.fstrPhoneType3);
    __sqoop$field_map.put("fintCountryCode3", this.fintCountryCode3);
    __sqoop$field_map.put("fstrCountry3", this.fstrCountry3);
    __sqoop$field_map.put("fstrAreaCode3", this.fstrAreaCode3);
    __sqoop$field_map.put("fstrPhoneNumber3", this.fstrPhoneNumber3);
    __sqoop$field_map.put("fstrExtension3", this.fstrExtension3);
    __sqoop$field_map.put("fstrPhoneType4", this.fstrPhoneType4);
    __sqoop$field_map.put("fintCountryCode4", this.fintCountryCode4);
    __sqoop$field_map.put("fstrCountry4", this.fstrCountry4);
    __sqoop$field_map.put("fstrAreaCode4", this.fstrAreaCode4);
    __sqoop$field_map.put("fstrPhoneNumber4", this.fstrPhoneNumber4);
    __sqoop$field_map.put("fstrExtension4", this.fstrExtension4);
    __sqoop$field_map.put("fstrPhoneType5", this.fstrPhoneType5);
    __sqoop$field_map.put("fintCountryCode5", this.fintCountryCode5);
    __sqoop$field_map.put("fstrCountry5", this.fstrCountry5);
    __sqoop$field_map.put("fstrAreaCode5", this.fstrAreaCode5);
    __sqoop$field_map.put("fstrPhoneNumber5", this.fstrPhoneNumber5);
    __sqoop$field_map.put("fstrExtension5", this.fstrExtension5);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrNote", this.fstrNote);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngContactKey", this.flngContactKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fintProfileNumber", this.fintProfileNumber);
    __sqoop$field_map.put("fstrContactType", this.fstrContactType);
    __sqoop$field_map.put("fstrPhoneType1", this.fstrPhoneType1);
    __sqoop$field_map.put("fintCountryCode1", this.fintCountryCode1);
    __sqoop$field_map.put("fstrCountry1", this.fstrCountry1);
    __sqoop$field_map.put("fstrAreaCode1", this.fstrAreaCode1);
    __sqoop$field_map.put("fstrPhoneNumber1", this.fstrPhoneNumber1);
    __sqoop$field_map.put("fstrExtension1", this.fstrExtension1);
    __sqoop$field_map.put("fstrPhoneType2", this.fstrPhoneType2);
    __sqoop$field_map.put("fintCountryCode2", this.fintCountryCode2);
    __sqoop$field_map.put("fstrCountry2", this.fstrCountry2);
    __sqoop$field_map.put("fstrAreaCode2", this.fstrAreaCode2);
    __sqoop$field_map.put("fstrPhoneNumber2", this.fstrPhoneNumber2);
    __sqoop$field_map.put("fstrExtension2", this.fstrExtension2);
    __sqoop$field_map.put("fstrPhoneType3", this.fstrPhoneType3);
    __sqoop$field_map.put("fintCountryCode3", this.fintCountryCode3);
    __sqoop$field_map.put("fstrCountry3", this.fstrCountry3);
    __sqoop$field_map.put("fstrAreaCode3", this.fstrAreaCode3);
    __sqoop$field_map.put("fstrPhoneNumber3", this.fstrPhoneNumber3);
    __sqoop$field_map.put("fstrExtension3", this.fstrExtension3);
    __sqoop$field_map.put("fstrPhoneType4", this.fstrPhoneType4);
    __sqoop$field_map.put("fintCountryCode4", this.fintCountryCode4);
    __sqoop$field_map.put("fstrCountry4", this.fstrCountry4);
    __sqoop$field_map.put("fstrAreaCode4", this.fstrAreaCode4);
    __sqoop$field_map.put("fstrPhoneNumber4", this.fstrPhoneNumber4);
    __sqoop$field_map.put("fstrExtension4", this.fstrExtension4);
    __sqoop$field_map.put("fstrPhoneType5", this.fstrPhoneType5);
    __sqoop$field_map.put("fintCountryCode5", this.fintCountryCode5);
    __sqoop$field_map.put("fstrCountry5", this.fstrCountry5);
    __sqoop$field_map.put("fstrAreaCode5", this.fstrAreaCode5);
    __sqoop$field_map.put("fstrPhoneNumber5", this.fstrPhoneNumber5);
    __sqoop$field_map.put("fstrExtension5", this.fstrExtension5);
    __sqoop$field_map.put("fstrContactName", this.fstrContactName);
    __sqoop$field_map.put("fstrEmail", this.fstrEmail);
    __sqoop$field_map.put("fstrNote", this.fstrNote);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
