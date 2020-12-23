// ORM class for table 'tblnz_mailmetainfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:40:53 NZDT 2020
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

public class tblnz_mailmetainfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngMailItemKey = (Integer)value;
      }
    });
    setters.put("flngMailTypeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngMailTypeKey = (Integer)value;
      }
    });
    setters.put("flngNameAddressHash", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngNameAddressHash = (Integer)value;
      }
    });
    setters.put("flngMailBatchKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngMailBatchKey = (Integer)value;
      }
    });
    setters.put("fstrAddressee", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrAddressee = (String)value;
      }
    });
    setters.put("fstrAddressBlock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrAddressBlock = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrPostCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrPostCode = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrCountry = (String)value;
      }
    });
    setters.put("flngOriCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngOriCustomerKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fstrRecipientIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrRecipientIRD = (String)value;
      }
    });
    setters.put("fstrIRDLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrIRDLevel = (String)value;
      }
    });
    setters.put("fstrAccountType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrAccountType = (String)value;
      }
    });
    setters.put("fintAddressProfile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintAddressProfile = (Integer)value;
      }
    });
    setters.put("fintAddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintAddressKey = (Integer)value;
      }
    });
    setters.put("fintSimplexAfterPage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintSimplexAfterPage = (Integer)value;
      }
    });
    setters.put("fblnDuplex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fblnDuplex = (Integer)value;
      }
    });
    setters.put("flngPageCount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.flngPageCount = (Integer)value;
      }
    });
    setters.put("fstrPaperSize", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrPaperSize = (String)value;
      }
    });
    setters.put("fstrPerforationPages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrPerforationPages = (String)value;
      }
    });
    setters.put("fstrSheetCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrSheetCode = (String)value;
      }
    });
    setters.put("fintFeeder1Count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintFeeder1Count = (Integer)value;
      }
    });
    setters.put("fintFeeder2Count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintFeeder2Count = (Integer)value;
      }
    });
    setters.put("fintFeeder3Count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintFeeder3Count = (Integer)value;
      }
    });
    setters.put("fintFeeder4Count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintFeeder4Count = (Integer)value;
      }
    });
    setters.put("fintFeeder5Count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintFeeder5Count = (Integer)value;
      }
    });
    setters.put("fintFeeder6Count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fintFeeder6Count = (Integer)value;
      }
    });
    setters.put("fstrFeatures", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrFeatures = (String)value;
      }
    });
    setters.put("fstrPageOrientationData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrPageOrientationData = (String)value;
      }
    });
    setters.put("fstrOtherID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrOtherID = (String)value;
      }
    });
    setters.put("fblnAgentMail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fblnAgentMail = (Integer)value;
      }
    });
    setters.put("fblnInsertPresent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fblnInsertPresent = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_mailmetainfo.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_mailmetainfo() {
    init0();
  }
  private Integer flngMailItemKey;
  public Integer get_flngMailItemKey() {
    return flngMailItemKey;
  }
  public void set_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
  }
  public tblnz_mailmetainfo with_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
    return this;
  }
  private Integer flngMailTypeKey;
  public Integer get_flngMailTypeKey() {
    return flngMailTypeKey;
  }
  public void set_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
  }
  public tblnz_mailmetainfo with_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
    return this;
  }
  private Integer flngNameAddressHash;
  public Integer get_flngNameAddressHash() {
    return flngNameAddressHash;
  }
  public void set_flngNameAddressHash(Integer flngNameAddressHash) {
    this.flngNameAddressHash = flngNameAddressHash;
  }
  public tblnz_mailmetainfo with_flngNameAddressHash(Integer flngNameAddressHash) {
    this.flngNameAddressHash = flngNameAddressHash;
    return this;
  }
  private Integer flngMailBatchKey;
  public Integer get_flngMailBatchKey() {
    return flngMailBatchKey;
  }
  public void set_flngMailBatchKey(Integer flngMailBatchKey) {
    this.flngMailBatchKey = flngMailBatchKey;
  }
  public tblnz_mailmetainfo with_flngMailBatchKey(Integer flngMailBatchKey) {
    this.flngMailBatchKey = flngMailBatchKey;
    return this;
  }
  private String fstrAddressee;
  public String get_fstrAddressee() {
    return fstrAddressee;
  }
  public void set_fstrAddressee(String fstrAddressee) {
    this.fstrAddressee = fstrAddressee;
  }
  public tblnz_mailmetainfo with_fstrAddressee(String fstrAddressee) {
    this.fstrAddressee = fstrAddressee;
    return this;
  }
  private String fstrAddressBlock;
  public String get_fstrAddressBlock() {
    return fstrAddressBlock;
  }
  public void set_fstrAddressBlock(String fstrAddressBlock) {
    this.fstrAddressBlock = fstrAddressBlock;
  }
  public tblnz_mailmetainfo with_fstrAddressBlock(String fstrAddressBlock) {
    this.fstrAddressBlock = fstrAddressBlock;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblnz_mailmetainfo with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrPostCode;
  public String get_fstrPostCode() {
    return fstrPostCode;
  }
  public void set_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
  }
  public tblnz_mailmetainfo with_fstrPostCode(String fstrPostCode) {
    this.fstrPostCode = fstrPostCode;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblnz_mailmetainfo with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private Integer flngOriCustomerKey;
  public Integer get_flngOriCustomerKey() {
    return flngOriCustomerKey;
  }
  public void set_flngOriCustomerKey(Integer flngOriCustomerKey) {
    this.flngOriCustomerKey = flngOriCustomerKey;
  }
  public tblnz_mailmetainfo with_flngOriCustomerKey(Integer flngOriCustomerKey) {
    this.flngOriCustomerKey = flngOriCustomerKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblnz_mailmetainfo with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private String fstrRecipientIRD;
  public String get_fstrRecipientIRD() {
    return fstrRecipientIRD;
  }
  public void set_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
  }
  public tblnz_mailmetainfo with_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
    return this;
  }
  private String fstrIRDLevel;
  public String get_fstrIRDLevel() {
    return fstrIRDLevel;
  }
  public void set_fstrIRDLevel(String fstrIRDLevel) {
    this.fstrIRDLevel = fstrIRDLevel;
  }
  public tblnz_mailmetainfo with_fstrIRDLevel(String fstrIRDLevel) {
    this.fstrIRDLevel = fstrIRDLevel;
    return this;
  }
  private String fstrAccountType;
  public String get_fstrAccountType() {
    return fstrAccountType;
  }
  public void set_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
  }
  public tblnz_mailmetainfo with_fstrAccountType(String fstrAccountType) {
    this.fstrAccountType = fstrAccountType;
    return this;
  }
  private Integer fintAddressProfile;
  public Integer get_fintAddressProfile() {
    return fintAddressProfile;
  }
  public void set_fintAddressProfile(Integer fintAddressProfile) {
    this.fintAddressProfile = fintAddressProfile;
  }
  public tblnz_mailmetainfo with_fintAddressProfile(Integer fintAddressProfile) {
    this.fintAddressProfile = fintAddressProfile;
    return this;
  }
  private Integer fintAddressKey;
  public Integer get_fintAddressKey() {
    return fintAddressKey;
  }
  public void set_fintAddressKey(Integer fintAddressKey) {
    this.fintAddressKey = fintAddressKey;
  }
  public tblnz_mailmetainfo with_fintAddressKey(Integer fintAddressKey) {
    this.fintAddressKey = fintAddressKey;
    return this;
  }
  private Integer fintSimplexAfterPage;
  public Integer get_fintSimplexAfterPage() {
    return fintSimplexAfterPage;
  }
  public void set_fintSimplexAfterPage(Integer fintSimplexAfterPage) {
    this.fintSimplexAfterPage = fintSimplexAfterPage;
  }
  public tblnz_mailmetainfo with_fintSimplexAfterPage(Integer fintSimplexAfterPage) {
    this.fintSimplexAfterPage = fintSimplexAfterPage;
    return this;
  }
  private Integer fblnDuplex;
  public Integer get_fblnDuplex() {
    return fblnDuplex;
  }
  public void set_fblnDuplex(Integer fblnDuplex) {
    this.fblnDuplex = fblnDuplex;
  }
  public tblnz_mailmetainfo with_fblnDuplex(Integer fblnDuplex) {
    this.fblnDuplex = fblnDuplex;
    return this;
  }
  private Integer flngPageCount;
  public Integer get_flngPageCount() {
    return flngPageCount;
  }
  public void set_flngPageCount(Integer flngPageCount) {
    this.flngPageCount = flngPageCount;
  }
  public tblnz_mailmetainfo with_flngPageCount(Integer flngPageCount) {
    this.flngPageCount = flngPageCount;
    return this;
  }
  private String fstrPaperSize;
  public String get_fstrPaperSize() {
    return fstrPaperSize;
  }
  public void set_fstrPaperSize(String fstrPaperSize) {
    this.fstrPaperSize = fstrPaperSize;
  }
  public tblnz_mailmetainfo with_fstrPaperSize(String fstrPaperSize) {
    this.fstrPaperSize = fstrPaperSize;
    return this;
  }
  private String fstrPerforationPages;
  public String get_fstrPerforationPages() {
    return fstrPerforationPages;
  }
  public void set_fstrPerforationPages(String fstrPerforationPages) {
    this.fstrPerforationPages = fstrPerforationPages;
  }
  public tblnz_mailmetainfo with_fstrPerforationPages(String fstrPerforationPages) {
    this.fstrPerforationPages = fstrPerforationPages;
    return this;
  }
  private String fstrSheetCode;
  public String get_fstrSheetCode() {
    return fstrSheetCode;
  }
  public void set_fstrSheetCode(String fstrSheetCode) {
    this.fstrSheetCode = fstrSheetCode;
  }
  public tblnz_mailmetainfo with_fstrSheetCode(String fstrSheetCode) {
    this.fstrSheetCode = fstrSheetCode;
    return this;
  }
  private Integer fintFeeder1Count;
  public Integer get_fintFeeder1Count() {
    return fintFeeder1Count;
  }
  public void set_fintFeeder1Count(Integer fintFeeder1Count) {
    this.fintFeeder1Count = fintFeeder1Count;
  }
  public tblnz_mailmetainfo with_fintFeeder1Count(Integer fintFeeder1Count) {
    this.fintFeeder1Count = fintFeeder1Count;
    return this;
  }
  private Integer fintFeeder2Count;
  public Integer get_fintFeeder2Count() {
    return fintFeeder2Count;
  }
  public void set_fintFeeder2Count(Integer fintFeeder2Count) {
    this.fintFeeder2Count = fintFeeder2Count;
  }
  public tblnz_mailmetainfo with_fintFeeder2Count(Integer fintFeeder2Count) {
    this.fintFeeder2Count = fintFeeder2Count;
    return this;
  }
  private Integer fintFeeder3Count;
  public Integer get_fintFeeder3Count() {
    return fintFeeder3Count;
  }
  public void set_fintFeeder3Count(Integer fintFeeder3Count) {
    this.fintFeeder3Count = fintFeeder3Count;
  }
  public tblnz_mailmetainfo with_fintFeeder3Count(Integer fintFeeder3Count) {
    this.fintFeeder3Count = fintFeeder3Count;
    return this;
  }
  private Integer fintFeeder4Count;
  public Integer get_fintFeeder4Count() {
    return fintFeeder4Count;
  }
  public void set_fintFeeder4Count(Integer fintFeeder4Count) {
    this.fintFeeder4Count = fintFeeder4Count;
  }
  public tblnz_mailmetainfo with_fintFeeder4Count(Integer fintFeeder4Count) {
    this.fintFeeder4Count = fintFeeder4Count;
    return this;
  }
  private Integer fintFeeder5Count;
  public Integer get_fintFeeder5Count() {
    return fintFeeder5Count;
  }
  public void set_fintFeeder5Count(Integer fintFeeder5Count) {
    this.fintFeeder5Count = fintFeeder5Count;
  }
  public tblnz_mailmetainfo with_fintFeeder5Count(Integer fintFeeder5Count) {
    this.fintFeeder5Count = fintFeeder5Count;
    return this;
  }
  private Integer fintFeeder6Count;
  public Integer get_fintFeeder6Count() {
    return fintFeeder6Count;
  }
  public void set_fintFeeder6Count(Integer fintFeeder6Count) {
    this.fintFeeder6Count = fintFeeder6Count;
  }
  public tblnz_mailmetainfo with_fintFeeder6Count(Integer fintFeeder6Count) {
    this.fintFeeder6Count = fintFeeder6Count;
    return this;
  }
  private String fstrFeatures;
  public String get_fstrFeatures() {
    return fstrFeatures;
  }
  public void set_fstrFeatures(String fstrFeatures) {
    this.fstrFeatures = fstrFeatures;
  }
  public tblnz_mailmetainfo with_fstrFeatures(String fstrFeatures) {
    this.fstrFeatures = fstrFeatures;
    return this;
  }
  private String fstrPageOrientationData;
  public String get_fstrPageOrientationData() {
    return fstrPageOrientationData;
  }
  public void set_fstrPageOrientationData(String fstrPageOrientationData) {
    this.fstrPageOrientationData = fstrPageOrientationData;
  }
  public tblnz_mailmetainfo with_fstrPageOrientationData(String fstrPageOrientationData) {
    this.fstrPageOrientationData = fstrPageOrientationData;
    return this;
  }
  private String fstrOtherID;
  public String get_fstrOtherID() {
    return fstrOtherID;
  }
  public void set_fstrOtherID(String fstrOtherID) {
    this.fstrOtherID = fstrOtherID;
  }
  public tblnz_mailmetainfo with_fstrOtherID(String fstrOtherID) {
    this.fstrOtherID = fstrOtherID;
    return this;
  }
  private Integer fblnAgentMail;
  public Integer get_fblnAgentMail() {
    return fblnAgentMail;
  }
  public void set_fblnAgentMail(Integer fblnAgentMail) {
    this.fblnAgentMail = fblnAgentMail;
  }
  public tblnz_mailmetainfo with_fblnAgentMail(Integer fblnAgentMail) {
    this.fblnAgentMail = fblnAgentMail;
    return this;
  }
  private Integer fblnInsertPresent;
  public Integer get_fblnInsertPresent() {
    return fblnInsertPresent;
  }
  public void set_fblnInsertPresent(Integer fblnInsertPresent) {
    this.fblnInsertPresent = fblnInsertPresent;
  }
  public tblnz_mailmetainfo with_fblnInsertPresent(Integer fblnInsertPresent) {
    this.fblnInsertPresent = fblnInsertPresent;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_mailmetainfo with_fstrWho(String fstrWho) {
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
  public tblnz_mailmetainfo with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_mailmetainfo)) {
      return false;
    }
    tblnz_mailmetainfo that = (tblnz_mailmetainfo) o;
    boolean equal = true;
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngNameAddressHash == null ? that.flngNameAddressHash == null : this.flngNameAddressHash.equals(that.flngNameAddressHash));
    equal = equal && (this.flngMailBatchKey == null ? that.flngMailBatchKey == null : this.flngMailBatchKey.equals(that.flngMailBatchKey));
    equal = equal && (this.fstrAddressee == null ? that.fstrAddressee == null : this.fstrAddressee.equals(that.fstrAddressee));
    equal = equal && (this.fstrAddressBlock == null ? that.fstrAddressBlock == null : this.fstrAddressBlock.equals(that.fstrAddressBlock));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.flngOriCustomerKey == null ? that.flngOriCustomerKey == null : this.flngOriCustomerKey.equals(that.flngOriCustomerKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrIRDLevel == null ? that.fstrIRDLevel == null : this.fstrIRDLevel.equals(that.fstrIRDLevel));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fintAddressProfile == null ? that.fintAddressProfile == null : this.fintAddressProfile.equals(that.fintAddressProfile));
    equal = equal && (this.fintAddressKey == null ? that.fintAddressKey == null : this.fintAddressKey.equals(that.fintAddressKey));
    equal = equal && (this.fintSimplexAfterPage == null ? that.fintSimplexAfterPage == null : this.fintSimplexAfterPage.equals(that.fintSimplexAfterPage));
    equal = equal && (this.fblnDuplex == null ? that.fblnDuplex == null : this.fblnDuplex.equals(that.fblnDuplex));
    equal = equal && (this.flngPageCount == null ? that.flngPageCount == null : this.flngPageCount.equals(that.flngPageCount));
    equal = equal && (this.fstrPaperSize == null ? that.fstrPaperSize == null : this.fstrPaperSize.equals(that.fstrPaperSize));
    equal = equal && (this.fstrPerforationPages == null ? that.fstrPerforationPages == null : this.fstrPerforationPages.equals(that.fstrPerforationPages));
    equal = equal && (this.fstrSheetCode == null ? that.fstrSheetCode == null : this.fstrSheetCode.equals(that.fstrSheetCode));
    equal = equal && (this.fintFeeder1Count == null ? that.fintFeeder1Count == null : this.fintFeeder1Count.equals(that.fintFeeder1Count));
    equal = equal && (this.fintFeeder2Count == null ? that.fintFeeder2Count == null : this.fintFeeder2Count.equals(that.fintFeeder2Count));
    equal = equal && (this.fintFeeder3Count == null ? that.fintFeeder3Count == null : this.fintFeeder3Count.equals(that.fintFeeder3Count));
    equal = equal && (this.fintFeeder4Count == null ? that.fintFeeder4Count == null : this.fintFeeder4Count.equals(that.fintFeeder4Count));
    equal = equal && (this.fintFeeder5Count == null ? that.fintFeeder5Count == null : this.fintFeeder5Count.equals(that.fintFeeder5Count));
    equal = equal && (this.fintFeeder6Count == null ? that.fintFeeder6Count == null : this.fintFeeder6Count.equals(that.fintFeeder6Count));
    equal = equal && (this.fstrFeatures == null ? that.fstrFeatures == null : this.fstrFeatures.equals(that.fstrFeatures));
    equal = equal && (this.fstrPageOrientationData == null ? that.fstrPageOrientationData == null : this.fstrPageOrientationData.equals(that.fstrPageOrientationData));
    equal = equal && (this.fstrOtherID == null ? that.fstrOtherID == null : this.fstrOtherID.equals(that.fstrOtherID));
    equal = equal && (this.fblnAgentMail == null ? that.fblnAgentMail == null : this.fblnAgentMail.equals(that.fblnAgentMail));
    equal = equal && (this.fblnInsertPresent == null ? that.fblnInsertPresent == null : this.fblnInsertPresent.equals(that.fblnInsertPresent));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_mailmetainfo)) {
      return false;
    }
    tblnz_mailmetainfo that = (tblnz_mailmetainfo) o;
    boolean equal = true;
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngNameAddressHash == null ? that.flngNameAddressHash == null : this.flngNameAddressHash.equals(that.flngNameAddressHash));
    equal = equal && (this.flngMailBatchKey == null ? that.flngMailBatchKey == null : this.flngMailBatchKey.equals(that.flngMailBatchKey));
    equal = equal && (this.fstrAddressee == null ? that.fstrAddressee == null : this.fstrAddressee.equals(that.fstrAddressee));
    equal = equal && (this.fstrAddressBlock == null ? that.fstrAddressBlock == null : this.fstrAddressBlock.equals(that.fstrAddressBlock));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrPostCode == null ? that.fstrPostCode == null : this.fstrPostCode.equals(that.fstrPostCode));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.flngOriCustomerKey == null ? that.flngOriCustomerKey == null : this.flngOriCustomerKey.equals(that.flngOriCustomerKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrIRDLevel == null ? that.fstrIRDLevel == null : this.fstrIRDLevel.equals(that.fstrIRDLevel));
    equal = equal && (this.fstrAccountType == null ? that.fstrAccountType == null : this.fstrAccountType.equals(that.fstrAccountType));
    equal = equal && (this.fintAddressProfile == null ? that.fintAddressProfile == null : this.fintAddressProfile.equals(that.fintAddressProfile));
    equal = equal && (this.fintAddressKey == null ? that.fintAddressKey == null : this.fintAddressKey.equals(that.fintAddressKey));
    equal = equal && (this.fintSimplexAfterPage == null ? that.fintSimplexAfterPage == null : this.fintSimplexAfterPage.equals(that.fintSimplexAfterPage));
    equal = equal && (this.fblnDuplex == null ? that.fblnDuplex == null : this.fblnDuplex.equals(that.fblnDuplex));
    equal = equal && (this.flngPageCount == null ? that.flngPageCount == null : this.flngPageCount.equals(that.flngPageCount));
    equal = equal && (this.fstrPaperSize == null ? that.fstrPaperSize == null : this.fstrPaperSize.equals(that.fstrPaperSize));
    equal = equal && (this.fstrPerforationPages == null ? that.fstrPerforationPages == null : this.fstrPerforationPages.equals(that.fstrPerforationPages));
    equal = equal && (this.fstrSheetCode == null ? that.fstrSheetCode == null : this.fstrSheetCode.equals(that.fstrSheetCode));
    equal = equal && (this.fintFeeder1Count == null ? that.fintFeeder1Count == null : this.fintFeeder1Count.equals(that.fintFeeder1Count));
    equal = equal && (this.fintFeeder2Count == null ? that.fintFeeder2Count == null : this.fintFeeder2Count.equals(that.fintFeeder2Count));
    equal = equal && (this.fintFeeder3Count == null ? that.fintFeeder3Count == null : this.fintFeeder3Count.equals(that.fintFeeder3Count));
    equal = equal && (this.fintFeeder4Count == null ? that.fintFeeder4Count == null : this.fintFeeder4Count.equals(that.fintFeeder4Count));
    equal = equal && (this.fintFeeder5Count == null ? that.fintFeeder5Count == null : this.fintFeeder5Count.equals(that.fintFeeder5Count));
    equal = equal && (this.fintFeeder6Count == null ? that.fintFeeder6Count == null : this.fintFeeder6Count.equals(that.fintFeeder6Count));
    equal = equal && (this.fstrFeatures == null ? that.fstrFeatures == null : this.fstrFeatures.equals(that.fstrFeatures));
    equal = equal && (this.fstrPageOrientationData == null ? that.fstrPageOrientationData == null : this.fstrPageOrientationData.equals(that.fstrPageOrientationData));
    equal = equal && (this.fstrOtherID == null ? that.fstrOtherID == null : this.fstrOtherID.equals(that.fstrOtherID));
    equal = equal && (this.fblnAgentMail == null ? that.fblnAgentMail == null : this.fblnAgentMail.equals(that.fblnAgentMail));
    equal = equal && (this.fblnInsertPresent == null ? that.fblnInsertPresent == null : this.fblnInsertPresent.equals(that.fblnInsertPresent));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngMailItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngNameAddressHash = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngMailBatchKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrAddressee = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAddressBlock = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(9, __dbResults);
    this.flngOriCustomerKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrIRDLevel = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(14, __dbResults);
    this.fintAddressProfile = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fintAddressKey = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fintSimplexAfterPage = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnDuplex = JdbcWritableBridge.readInteger(18, __dbResults);
    this.flngPageCount = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrPaperSize = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrPerforationPages = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrSheetCode = JdbcWritableBridge.readString(22, __dbResults);
    this.fintFeeder1Count = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fintFeeder2Count = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fintFeeder3Count = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fintFeeder4Count = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fintFeeder5Count = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fintFeeder6Count = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrFeatures = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrPageOrientationData = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrOtherID = JdbcWritableBridge.readString(31, __dbResults);
    this.fblnAgentMail = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnInsertPresent = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(35, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngMailItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngNameAddressHash = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngMailBatchKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrAddressee = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrAddressBlock = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrPostCode = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(9, __dbResults);
    this.flngOriCustomerKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrIRDLevel = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrAccountType = JdbcWritableBridge.readString(14, __dbResults);
    this.fintAddressProfile = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fintAddressKey = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fintSimplexAfterPage = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnDuplex = JdbcWritableBridge.readInteger(18, __dbResults);
    this.flngPageCount = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fstrPaperSize = JdbcWritableBridge.readString(20, __dbResults);
    this.fstrPerforationPages = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrSheetCode = JdbcWritableBridge.readString(22, __dbResults);
    this.fintFeeder1Count = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fintFeeder2Count = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fintFeeder3Count = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fintFeeder4Count = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fintFeeder5Count = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fintFeeder6Count = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrFeatures = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrPageOrientationData = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrOtherID = JdbcWritableBridge.readString(31, __dbResults);
    this.fblnAgentMail = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnInsertPresent = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(35, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngMailItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNameAddressHash, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailBatchKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressee, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressBlock, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOriCustomerKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDLevel, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressProfile, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressKey, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSimplexAfterPage, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplex, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPageCount, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaperSize, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPerforationPages, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSheetCode, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder1Count, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder2Count, 24 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder3Count, 25 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder4Count, 26 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder5Count, 27 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder6Count, 28 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrFeatures, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPageOrientationData, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherID, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAgentMail, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInsertPresent, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 35 + __off, 93, __dbStmt);
    return 35;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngMailItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNameAddressHash, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailBatchKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressee, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressBlock, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPostCode, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngOriCustomerKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIRDLevel, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountType, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressProfile, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAddressKey, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSimplexAfterPage, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDuplex, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPageCount, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPaperSize, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPerforationPages, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrSheetCode, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder1Count, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder2Count, 24 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder3Count, 25 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder4Count, 26 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder5Count, 27 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFeeder6Count, 28 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrFeatures, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPageOrientationData, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrOtherID, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAgentMail, 32 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnInsertPresent, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 35 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngMailItemKey = null;
    } else {
    this.flngMailItemKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailTypeKey = null;
    } else {
    this.flngMailTypeKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngNameAddressHash = null;
    } else {
    this.flngNameAddressHash = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailBatchKey = null;
    } else {
    this.flngMailBatchKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressee = null;
    } else {
    this.fstrAddressee = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressBlock = null;
    } else {
    this.fstrAddressBlock = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPostCode = null;
    } else {
    this.fstrPostCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngOriCustomerKey = null;
    } else {
    this.flngOriCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientIRD = null;
    } else {
    this.fstrRecipientIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIRDLevel = null;
    } else {
    this.fstrIRDLevel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountType = null;
    } else {
    this.fstrAccountType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintAddressProfile = null;
    } else {
    this.fintAddressProfile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAddressKey = null;
    } else {
    this.fintAddressKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSimplexAfterPage = null;
    } else {
    this.fintSimplexAfterPage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDuplex = null;
    } else {
    this.fblnDuplex = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPageCount = null;
    } else {
    this.flngPageCount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPaperSize = null;
    } else {
    this.fstrPaperSize = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPerforationPages = null;
    } else {
    this.fstrPerforationPages = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSheetCode = null;
    } else {
    this.fstrSheetCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintFeeder1Count = null;
    } else {
    this.fintFeeder1Count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFeeder2Count = null;
    } else {
    this.fintFeeder2Count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFeeder3Count = null;
    } else {
    this.fintFeeder3Count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFeeder4Count = null;
    } else {
    this.fintFeeder4Count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFeeder5Count = null;
    } else {
    this.fintFeeder5Count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFeeder6Count = null;
    } else {
    this.fintFeeder6Count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFeatures = null;
    } else {
    this.fstrFeatures = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPageOrientationData = null;
    } else {
    this.fstrPageOrientationData = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOtherID = null;
    } else {
    this.fstrOtherID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAgentMail = null;
    } else {
    this.fblnAgentMail = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnInsertPresent = null;
    } else {
    this.fblnInsertPresent = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.flngMailTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailTypeKey);
    }
    if (null == this.flngNameAddressHash) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNameAddressHash);
    }
    if (null == this.flngMailBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailBatchKey);
    }
    if (null == this.fstrAddressee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressee);
    }
    if (null == this.fstrAddressBlock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressBlock);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.flngOriCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOriCustomerKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fstrIRDLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDLevel);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fintAddressProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressProfile);
    }
    if (null == this.fintAddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressKey);
    }
    if (null == this.fintSimplexAfterPage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSimplexAfterPage);
    }
    if (null == this.fblnDuplex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplex);
    }
    if (null == this.flngPageCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPageCount);
    }
    if (null == this.fstrPaperSize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaperSize);
    }
    if (null == this.fstrPerforationPages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPerforationPages);
    }
    if (null == this.fstrSheetCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSheetCode);
    }
    if (null == this.fintFeeder1Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder1Count);
    }
    if (null == this.fintFeeder2Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder2Count);
    }
    if (null == this.fintFeeder3Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder3Count);
    }
    if (null == this.fintFeeder4Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder4Count);
    }
    if (null == this.fintFeeder5Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder5Count);
    }
    if (null == this.fintFeeder6Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder6Count);
    }
    if (null == this.fstrFeatures) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFeatures);
    }
    if (null == this.fstrPageOrientationData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPageOrientationData);
    }
    if (null == this.fstrOtherID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherID);
    }
    if (null == this.fblnAgentMail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAgentMail);
    }
    if (null == this.fblnInsertPresent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInsertPresent);
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
    if (null == this.flngMailItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailItemKey);
    }
    if (null == this.flngMailTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailTypeKey);
    }
    if (null == this.flngNameAddressHash) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNameAddressHash);
    }
    if (null == this.flngMailBatchKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailBatchKey);
    }
    if (null == this.fstrAddressee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressee);
    }
    if (null == this.fstrAddressBlock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressBlock);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrPostCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPostCode);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.flngOriCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngOriCustomerKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fstrIRDLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIRDLevel);
    }
    if (null == this.fstrAccountType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountType);
    }
    if (null == this.fintAddressProfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressProfile);
    }
    if (null == this.fintAddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAddressKey);
    }
    if (null == this.fintSimplexAfterPage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSimplexAfterPage);
    }
    if (null == this.fblnDuplex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDuplex);
    }
    if (null == this.flngPageCount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPageCount);
    }
    if (null == this.fstrPaperSize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPaperSize);
    }
    if (null == this.fstrPerforationPages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPerforationPages);
    }
    if (null == this.fstrSheetCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSheetCode);
    }
    if (null == this.fintFeeder1Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder1Count);
    }
    if (null == this.fintFeeder2Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder2Count);
    }
    if (null == this.fintFeeder3Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder3Count);
    }
    if (null == this.fintFeeder4Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder4Count);
    }
    if (null == this.fintFeeder5Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder5Count);
    }
    if (null == this.fintFeeder6Count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFeeder6Count);
    }
    if (null == this.fstrFeatures) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFeatures);
    }
    if (null == this.fstrPageOrientationData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPageOrientationData);
    }
    if (null == this.fstrOtherID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOtherID);
    }
    if (null == this.fblnAgentMail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAgentMail);
    }
    if (null == this.fblnInsertPresent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnInsertPresent);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNameAddressHash==null?"\\N":"" + flngNameAddressHash, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailBatchKey==null?"\\N":"" + flngMailBatchKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressee==null?"\\N":fstrAddressee, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressBlock==null?"\\N":fstrAddressBlock, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOriCustomerKey==null?"\\N":"" + flngOriCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDLevel==null?"\\N":fstrIRDLevel, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressProfile==null?"\\N":"" + fintAddressProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressKey==null?"\\N":"" + fintAddressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSimplexAfterPage==null?"\\N":"" + fintSimplexAfterPage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplex==null?"\\N":"" + fblnDuplex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPageCount==null?"\\N":"" + flngPageCount, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaperSize==null?"\\N":fstrPaperSize, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPerforationPages==null?"\\N":fstrPerforationPages, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSheetCode==null?"\\N":fstrSheetCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder1Count==null?"\\N":"" + fintFeeder1Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder2Count==null?"\\N":"" + fintFeeder2Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder3Count==null?"\\N":"" + fintFeeder3Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder4Count==null?"\\N":"" + fintFeeder4Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder5Count==null?"\\N":"" + fintFeeder5Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder6Count==null?"\\N":"" + fintFeeder6Count, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFeatures==null?"\\N":fstrFeatures, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPageOrientationData==null?"\\N":fstrPageOrientationData, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherID==null?"\\N":fstrOtherID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAgentMail==null?"\\N":"" + fblnAgentMail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInsertPresent==null?"\\N":"" + fblnInsertPresent, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailItemKey==null?"\\N":"" + flngMailItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNameAddressHash==null?"\\N":"" + flngNameAddressHash, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailBatchKey==null?"\\N":"" + flngMailBatchKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressee==null?"\\N":fstrAddressee, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressBlock==null?"\\N":fstrAddressBlock, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPostCode==null?"\\N":fstrPostCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngOriCustomerKey==null?"\\N":"" + flngOriCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIRDLevel==null?"\\N":fstrIRDLevel, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountType==null?"\\N":fstrAccountType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressProfile==null?"\\N":"" + fintAddressProfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAddressKey==null?"\\N":"" + fintAddressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSimplexAfterPage==null?"\\N":"" + fintSimplexAfterPage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDuplex==null?"\\N":"" + fblnDuplex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPageCount==null?"\\N":"" + flngPageCount, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPaperSize==null?"\\N":fstrPaperSize, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPerforationPages==null?"\\N":fstrPerforationPages, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSheetCode==null?"\\N":fstrSheetCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder1Count==null?"\\N":"" + fintFeeder1Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder2Count==null?"\\N":"" + fintFeeder2Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder3Count==null?"\\N":"" + fintFeeder3Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder4Count==null?"\\N":"" + fintFeeder4Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder5Count==null?"\\N":"" + fintFeeder5Count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFeeder6Count==null?"\\N":"" + fintFeeder6Count, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFeatures==null?"\\N":fstrFeatures, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPageOrientationData==null?"\\N":fstrPageOrientationData, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOtherID==null?"\\N":fstrOtherID, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAgentMail==null?"\\N":"" + fblnAgentMail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnInsertPresent==null?"\\N":"" + fblnInsertPresent, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailTypeKey = null; } else {
      this.flngMailTypeKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNameAddressHash = null; } else {
      this.flngNameAddressHash = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailBatchKey = null; } else {
      this.flngMailBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressee = null; } else {
      this.fstrAddressee = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressBlock = null; } else {
      this.fstrAddressBlock = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOriCustomerKey = null; } else {
      this.flngOriCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDLevel = null; } else {
      this.fstrIRDLevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressProfile = null; } else {
      this.fintAddressProfile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressKey = null; } else {
      this.fintAddressKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSimplexAfterPage = null; } else {
      this.fintSimplexAfterPage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplex = null; } else {
      this.fblnDuplex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPageCount = null; } else {
      this.flngPageCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaperSize = null; } else {
      this.fstrPaperSize = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPerforationPages = null; } else {
      this.fstrPerforationPages = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSheetCode = null; } else {
      this.fstrSheetCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder1Count = null; } else {
      this.fintFeeder1Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder2Count = null; } else {
      this.fintFeeder2Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder3Count = null; } else {
      this.fintFeeder3Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder4Count = null; } else {
      this.fintFeeder4Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder5Count = null; } else {
      this.fintFeeder5Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder6Count = null; } else {
      this.fintFeeder6Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFeatures = null; } else {
      this.fstrFeatures = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPageOrientationData = null; } else {
      this.fstrPageOrientationData = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherID = null; } else {
      this.fstrOtherID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAgentMail = null; } else {
      this.fblnAgentMail = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInsertPresent = null; } else {
      this.fblnInsertPresent = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailItemKey = null; } else {
      this.flngMailItemKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailTypeKey = null; } else {
      this.flngMailTypeKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNameAddressHash = null; } else {
      this.flngNameAddressHash = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailBatchKey = null; } else {
      this.flngMailBatchKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressee = null; } else {
      this.fstrAddressee = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAddressBlock = null; } else {
      this.fstrAddressBlock = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCity = null; } else {
      this.fstrCity = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPostCode = null; } else {
      this.fstrPostCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngOriCustomerKey = null; } else {
      this.flngOriCustomerKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientIRD = null; } else {
      this.fstrRecipientIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIRDLevel = null; } else {
      this.fstrIRDLevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountType = null; } else {
      this.fstrAccountType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressProfile = null; } else {
      this.fintAddressProfile = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAddressKey = null; } else {
      this.fintAddressKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSimplexAfterPage = null; } else {
      this.fintSimplexAfterPage = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDuplex = null; } else {
      this.fblnDuplex = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPageCount = null; } else {
      this.flngPageCount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPaperSize = null; } else {
      this.fstrPaperSize = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPerforationPages = null; } else {
      this.fstrPerforationPages = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSheetCode = null; } else {
      this.fstrSheetCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder1Count = null; } else {
      this.fintFeeder1Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder2Count = null; } else {
      this.fintFeeder2Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder3Count = null; } else {
      this.fintFeeder3Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder4Count = null; } else {
      this.fintFeeder4Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder5Count = null; } else {
      this.fintFeeder5Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFeeder6Count = null; } else {
      this.fintFeeder6Count = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFeatures = null; } else {
      this.fstrFeatures = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPageOrientationData = null; } else {
      this.fstrPageOrientationData = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOtherID = null; } else {
      this.fstrOtherID = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAgentMail = null; } else {
      this.fblnAgentMail = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnInsertPresent = null; } else {
      this.fblnInsertPresent = Integer.valueOf(__cur_str);
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
    tblnz_mailmetainfo o = (tblnz_mailmetainfo) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_mailmetainfo o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngNameAddressHash", this.flngNameAddressHash);
    __sqoop$field_map.put("flngMailBatchKey", this.flngMailBatchKey);
    __sqoop$field_map.put("fstrAddressee", this.fstrAddressee);
    __sqoop$field_map.put("fstrAddressBlock", this.fstrAddressBlock);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("flngOriCustomerKey", this.flngOriCustomerKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrIRDLevel", this.fstrIRDLevel);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fintAddressProfile", this.fintAddressProfile);
    __sqoop$field_map.put("fintAddressKey", this.fintAddressKey);
    __sqoop$field_map.put("fintSimplexAfterPage", this.fintSimplexAfterPage);
    __sqoop$field_map.put("fblnDuplex", this.fblnDuplex);
    __sqoop$field_map.put("flngPageCount", this.flngPageCount);
    __sqoop$field_map.put("fstrPaperSize", this.fstrPaperSize);
    __sqoop$field_map.put("fstrPerforationPages", this.fstrPerforationPages);
    __sqoop$field_map.put("fstrSheetCode", this.fstrSheetCode);
    __sqoop$field_map.put("fintFeeder1Count", this.fintFeeder1Count);
    __sqoop$field_map.put("fintFeeder2Count", this.fintFeeder2Count);
    __sqoop$field_map.put("fintFeeder3Count", this.fintFeeder3Count);
    __sqoop$field_map.put("fintFeeder4Count", this.fintFeeder4Count);
    __sqoop$field_map.put("fintFeeder5Count", this.fintFeeder5Count);
    __sqoop$field_map.put("fintFeeder6Count", this.fintFeeder6Count);
    __sqoop$field_map.put("fstrFeatures", this.fstrFeatures);
    __sqoop$field_map.put("fstrPageOrientationData", this.fstrPageOrientationData);
    __sqoop$field_map.put("fstrOtherID", this.fstrOtherID);
    __sqoop$field_map.put("fblnAgentMail", this.fblnAgentMail);
    __sqoop$field_map.put("fblnInsertPresent", this.fblnInsertPresent);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngNameAddressHash", this.flngNameAddressHash);
    __sqoop$field_map.put("flngMailBatchKey", this.flngMailBatchKey);
    __sqoop$field_map.put("fstrAddressee", this.fstrAddressee);
    __sqoop$field_map.put("fstrAddressBlock", this.fstrAddressBlock);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrPostCode", this.fstrPostCode);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("flngOriCustomerKey", this.flngOriCustomerKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrIRDLevel", this.fstrIRDLevel);
    __sqoop$field_map.put("fstrAccountType", this.fstrAccountType);
    __sqoop$field_map.put("fintAddressProfile", this.fintAddressProfile);
    __sqoop$field_map.put("fintAddressKey", this.fintAddressKey);
    __sqoop$field_map.put("fintSimplexAfterPage", this.fintSimplexAfterPage);
    __sqoop$field_map.put("fblnDuplex", this.fblnDuplex);
    __sqoop$field_map.put("flngPageCount", this.flngPageCount);
    __sqoop$field_map.put("fstrPaperSize", this.fstrPaperSize);
    __sqoop$field_map.put("fstrPerforationPages", this.fstrPerforationPages);
    __sqoop$field_map.put("fstrSheetCode", this.fstrSheetCode);
    __sqoop$field_map.put("fintFeeder1Count", this.fintFeeder1Count);
    __sqoop$field_map.put("fintFeeder2Count", this.fintFeeder2Count);
    __sqoop$field_map.put("fintFeeder3Count", this.fintFeeder3Count);
    __sqoop$field_map.put("fintFeeder4Count", this.fintFeeder4Count);
    __sqoop$field_map.put("fintFeeder5Count", this.fintFeeder5Count);
    __sqoop$field_map.put("fintFeeder6Count", this.fintFeeder6Count);
    __sqoop$field_map.put("fstrFeatures", this.fstrFeatures);
    __sqoop$field_map.put("fstrPageOrientationData", this.fstrPageOrientationData);
    __sqoop$field_map.put("fstrOtherID", this.fstrOtherID);
    __sqoop$field_map.put("fblnAgentMail", this.fblnAgentMail);
    __sqoop$field_map.put("fblnInsertPresent", this.fblnInsertPresent);
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
