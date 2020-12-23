// ORM class for table 'tblvisit'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 00:18:56 NZDT 2020
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

public class tblvisit extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngVisitKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngVisitKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fstrVisitSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrVisitSource = (String)value;
      }
    });
    setters.put("fstrVisitCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrVisitCategory = (String)value;
      }
    });
    setters.put("fstrVisitSubCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrVisitSubCategory = (String)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("fblnUnregisteredVisitor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fblnUnregisteredVisitor = (Integer)value;
      }
    });
    setters.put("fi64NameKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fi64NameKey = (Long)value;
      }
    });
    setters.put("fi64AddressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fi64AddressKey = (Long)value;
      }
    });
    setters.put("fstrVisitId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrVisitId = (String)value;
      }
    });
    setters.put("fstrTicketId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrTicketId = (String)value;
      }
    });
    setters.put("fstrExternalId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrExternalId = (String)value;
      }
    });
    setters.put("fstrIdType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrIdType = (String)value;
      }
    });
    setters.put("fstrId", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrId = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrCountry = (String)value;
      }
    });
    setters.put("fintCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fintCountryCode = (Integer)value;
      }
    });
    setters.put("fstrAreaCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrAreaCode = (String)value;
      }
    });
    setters.put("fstrPhoneNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrPhoneNumber = (String)value;
      }
    });
    setters.put("fblnVisitorVerified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fblnVisitorVerified = (Integer)value;
      }
    });
    setters.put("fstrVerifyDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrVerifyDocType = (String)value;
      }
    });
    setters.put("fintVerifyDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fintVerifyDocVer = (Integer)value;
      }
    });
    setters.put("fi64VerifyDocEditInProgressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fi64VerifyDocEditInProgressKey = (Long)value;
      }
    });
    setters.put("flngVerifyDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngVerifyDocKey = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fi64DocEditInProgressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fi64DocEditInProgressKey = (Long)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngXmlKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngXmlKey = (Integer)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrOwner = (String)value;
      }
    });
    setters.put("fstrDistrictOffice", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrDistrictOffice = (String)value;
      }
    });
    setters.put("fblnHold", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fblnHold = (Integer)value;
      }
    });
    setters.put("fdtmVisitStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fdtmVisitStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmVisitEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fdtmVisitEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngDuration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngDuration = (Integer)value;
      }
    });
    setters.put("flngWaitTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.flngWaitTime = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisit.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblvisit() {
    init0();
  }
  private Integer flngVisitKey;
  public Integer get_flngVisitKey() {
    return flngVisitKey;
  }
  public void set_flngVisitKey(Integer flngVisitKey) {
    this.flngVisitKey = flngVisitKey;
  }
  public tblvisit with_flngVisitKey(Integer flngVisitKey) {
    this.flngVisitKey = flngVisitKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblvisit with_flngVer(Integer flngVer) {
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
  public tblvisit with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private String fstrVisitSource;
  public String get_fstrVisitSource() {
    return fstrVisitSource;
  }
  public void set_fstrVisitSource(String fstrVisitSource) {
    this.fstrVisitSource = fstrVisitSource;
  }
  public tblvisit with_fstrVisitSource(String fstrVisitSource) {
    this.fstrVisitSource = fstrVisitSource;
    return this;
  }
  private String fstrVisitCategory;
  public String get_fstrVisitCategory() {
    return fstrVisitCategory;
  }
  public void set_fstrVisitCategory(String fstrVisitCategory) {
    this.fstrVisitCategory = fstrVisitCategory;
  }
  public tblvisit with_fstrVisitCategory(String fstrVisitCategory) {
    this.fstrVisitCategory = fstrVisitCategory;
    return this;
  }
  private String fstrVisitSubCategory;
  public String get_fstrVisitSubCategory() {
    return fstrVisitSubCategory;
  }
  public void set_fstrVisitSubCategory(String fstrVisitSubCategory) {
    this.fstrVisitSubCategory = fstrVisitSubCategory;
  }
  public tblvisit with_fstrVisitSubCategory(String fstrVisitSubCategory) {
    this.fstrVisitSubCategory = fstrVisitSubCategory;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblvisit with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblvisit with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer fblnUnregisteredVisitor;
  public Integer get_fblnUnregisteredVisitor() {
    return fblnUnregisteredVisitor;
  }
  public void set_fblnUnregisteredVisitor(Integer fblnUnregisteredVisitor) {
    this.fblnUnregisteredVisitor = fblnUnregisteredVisitor;
  }
  public tblvisit with_fblnUnregisteredVisitor(Integer fblnUnregisteredVisitor) {
    this.fblnUnregisteredVisitor = fblnUnregisteredVisitor;
    return this;
  }
  private Long fi64NameKey;
  public Long get_fi64NameKey() {
    return fi64NameKey;
  }
  public void set_fi64NameKey(Long fi64NameKey) {
    this.fi64NameKey = fi64NameKey;
  }
  public tblvisit with_fi64NameKey(Long fi64NameKey) {
    this.fi64NameKey = fi64NameKey;
    return this;
  }
  private Long fi64AddressKey;
  public Long get_fi64AddressKey() {
    return fi64AddressKey;
  }
  public void set_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
  }
  public tblvisit with_fi64AddressKey(Long fi64AddressKey) {
    this.fi64AddressKey = fi64AddressKey;
    return this;
  }
  private String fstrVisitId;
  public String get_fstrVisitId() {
    return fstrVisitId;
  }
  public void set_fstrVisitId(String fstrVisitId) {
    this.fstrVisitId = fstrVisitId;
  }
  public tblvisit with_fstrVisitId(String fstrVisitId) {
    this.fstrVisitId = fstrVisitId;
    return this;
  }
  private String fstrTicketId;
  public String get_fstrTicketId() {
    return fstrTicketId;
  }
  public void set_fstrTicketId(String fstrTicketId) {
    this.fstrTicketId = fstrTicketId;
  }
  public tblvisit with_fstrTicketId(String fstrTicketId) {
    this.fstrTicketId = fstrTicketId;
    return this;
  }
  private String fstrExternalId;
  public String get_fstrExternalId() {
    return fstrExternalId;
  }
  public void set_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
  }
  public tblvisit with_fstrExternalId(String fstrExternalId) {
    this.fstrExternalId = fstrExternalId;
    return this;
  }
  private String fstrIdType;
  public String get_fstrIdType() {
    return fstrIdType;
  }
  public void set_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
  }
  public tblvisit with_fstrIdType(String fstrIdType) {
    this.fstrIdType = fstrIdType;
    return this;
  }
  private String fstrId;
  public String get_fstrId() {
    return fstrId;
  }
  public void set_fstrId(String fstrId) {
    this.fstrId = fstrId;
  }
  public tblvisit with_fstrId(String fstrId) {
    this.fstrId = fstrId;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblvisit with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private Integer fintCountryCode;
  public Integer get_fintCountryCode() {
    return fintCountryCode;
  }
  public void set_fintCountryCode(Integer fintCountryCode) {
    this.fintCountryCode = fintCountryCode;
  }
  public tblvisit with_fintCountryCode(Integer fintCountryCode) {
    this.fintCountryCode = fintCountryCode;
    return this;
  }
  private String fstrAreaCode;
  public String get_fstrAreaCode() {
    return fstrAreaCode;
  }
  public void set_fstrAreaCode(String fstrAreaCode) {
    this.fstrAreaCode = fstrAreaCode;
  }
  public tblvisit with_fstrAreaCode(String fstrAreaCode) {
    this.fstrAreaCode = fstrAreaCode;
    return this;
  }
  private String fstrPhoneNumber;
  public String get_fstrPhoneNumber() {
    return fstrPhoneNumber;
  }
  public void set_fstrPhoneNumber(String fstrPhoneNumber) {
    this.fstrPhoneNumber = fstrPhoneNumber;
  }
  public tblvisit with_fstrPhoneNumber(String fstrPhoneNumber) {
    this.fstrPhoneNumber = fstrPhoneNumber;
    return this;
  }
  private Integer fblnVisitorVerified;
  public Integer get_fblnVisitorVerified() {
    return fblnVisitorVerified;
  }
  public void set_fblnVisitorVerified(Integer fblnVisitorVerified) {
    this.fblnVisitorVerified = fblnVisitorVerified;
  }
  public tblvisit with_fblnVisitorVerified(Integer fblnVisitorVerified) {
    this.fblnVisitorVerified = fblnVisitorVerified;
    return this;
  }
  private String fstrVerifyDocType;
  public String get_fstrVerifyDocType() {
    return fstrVerifyDocType;
  }
  public void set_fstrVerifyDocType(String fstrVerifyDocType) {
    this.fstrVerifyDocType = fstrVerifyDocType;
  }
  public tblvisit with_fstrVerifyDocType(String fstrVerifyDocType) {
    this.fstrVerifyDocType = fstrVerifyDocType;
    return this;
  }
  private Integer fintVerifyDocVer;
  public Integer get_fintVerifyDocVer() {
    return fintVerifyDocVer;
  }
  public void set_fintVerifyDocVer(Integer fintVerifyDocVer) {
    this.fintVerifyDocVer = fintVerifyDocVer;
  }
  public tblvisit with_fintVerifyDocVer(Integer fintVerifyDocVer) {
    this.fintVerifyDocVer = fintVerifyDocVer;
    return this;
  }
  private Long fi64VerifyDocEditInProgressKey;
  public Long get_fi64VerifyDocEditInProgressKey() {
    return fi64VerifyDocEditInProgressKey;
  }
  public void set_fi64VerifyDocEditInProgressKey(Long fi64VerifyDocEditInProgressKey) {
    this.fi64VerifyDocEditInProgressKey = fi64VerifyDocEditInProgressKey;
  }
  public tblvisit with_fi64VerifyDocEditInProgressKey(Long fi64VerifyDocEditInProgressKey) {
    this.fi64VerifyDocEditInProgressKey = fi64VerifyDocEditInProgressKey;
    return this;
  }
  private Integer flngVerifyDocKey;
  public Integer get_flngVerifyDocKey() {
    return flngVerifyDocKey;
  }
  public void set_flngVerifyDocKey(Integer flngVerifyDocKey) {
    this.flngVerifyDocKey = flngVerifyDocKey;
  }
  public tblvisit with_flngVerifyDocKey(Integer flngVerifyDocKey) {
    this.flngVerifyDocKey = flngVerifyDocKey;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tblvisit with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public tblvisit with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Long fi64DocEditInProgressKey;
  public Long get_fi64DocEditInProgressKey() {
    return fi64DocEditInProgressKey;
  }
  public void set_fi64DocEditInProgressKey(Long fi64DocEditInProgressKey) {
    this.fi64DocEditInProgressKey = fi64DocEditInProgressKey;
  }
  public tblvisit with_fi64DocEditInProgressKey(Long fi64DocEditInProgressKey) {
    this.fi64DocEditInProgressKey = fi64DocEditInProgressKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblvisit with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngXmlKey;
  public Integer get_flngXmlKey() {
    return flngXmlKey;
  }
  public void set_flngXmlKey(Integer flngXmlKey) {
    this.flngXmlKey = flngXmlKey;
  }
  public tblvisit with_flngXmlKey(Integer flngXmlKey) {
    this.flngXmlKey = flngXmlKey;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblvisit with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private String fstrDistrictOffice;
  public String get_fstrDistrictOffice() {
    return fstrDistrictOffice;
  }
  public void set_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
  }
  public tblvisit with_fstrDistrictOffice(String fstrDistrictOffice) {
    this.fstrDistrictOffice = fstrDistrictOffice;
    return this;
  }
  private Integer fblnHold;
  public Integer get_fblnHold() {
    return fblnHold;
  }
  public void set_fblnHold(Integer fblnHold) {
    this.fblnHold = fblnHold;
  }
  public tblvisit with_fblnHold(Integer fblnHold) {
    this.fblnHold = fblnHold;
    return this;
  }
  private java.sql.Timestamp fdtmVisitStart;
  public java.sql.Timestamp get_fdtmVisitStart() {
    return fdtmVisitStart;
  }
  public void set_fdtmVisitStart(java.sql.Timestamp fdtmVisitStart) {
    this.fdtmVisitStart = fdtmVisitStart;
  }
  public tblvisit with_fdtmVisitStart(java.sql.Timestamp fdtmVisitStart) {
    this.fdtmVisitStart = fdtmVisitStart;
    return this;
  }
  private java.sql.Timestamp fdtmVisitEnd;
  public java.sql.Timestamp get_fdtmVisitEnd() {
    return fdtmVisitEnd;
  }
  public void set_fdtmVisitEnd(java.sql.Timestamp fdtmVisitEnd) {
    this.fdtmVisitEnd = fdtmVisitEnd;
  }
  public tblvisit with_fdtmVisitEnd(java.sql.Timestamp fdtmVisitEnd) {
    this.fdtmVisitEnd = fdtmVisitEnd;
    return this;
  }
  private Integer flngDuration;
  public Integer get_flngDuration() {
    return flngDuration;
  }
  public void set_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
  }
  public tblvisit with_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
    return this;
  }
  private Integer flngWaitTime;
  public Integer get_flngWaitTime() {
    return flngWaitTime;
  }
  public void set_flngWaitTime(Integer flngWaitTime) {
    this.flngWaitTime = flngWaitTime;
  }
  public tblvisit with_flngWaitTime(Integer flngWaitTime) {
    this.flngWaitTime = flngWaitTime;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblvisit with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblvisit with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblvisit with_fstrWho(String fstrWho) {
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
  public tblvisit with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblvisit)) {
      return false;
    }
    tblvisit that = (tblvisit) o;
    boolean equal = true;
    equal = equal && (this.flngVisitKey == null ? that.flngVisitKey == null : this.flngVisitKey.equals(that.flngVisitKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrVisitSource == null ? that.fstrVisitSource == null : this.fstrVisitSource.equals(that.fstrVisitSource));
    equal = equal && (this.fstrVisitCategory == null ? that.fstrVisitCategory == null : this.fstrVisitCategory.equals(that.fstrVisitCategory));
    equal = equal && (this.fstrVisitSubCategory == null ? that.fstrVisitSubCategory == null : this.fstrVisitSubCategory.equals(that.fstrVisitSubCategory));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fblnUnregisteredVisitor == null ? that.fblnUnregisteredVisitor == null : this.fblnUnregisteredVisitor.equals(that.fblnUnregisteredVisitor));
    equal = equal && (this.fi64NameKey == null ? that.fi64NameKey == null : this.fi64NameKey.equals(that.fi64NameKey));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fstrVisitId == null ? that.fstrVisitId == null : this.fstrVisitId.equals(that.fstrVisitId));
    equal = equal && (this.fstrTicketId == null ? that.fstrTicketId == null : this.fstrTicketId.equals(that.fstrTicketId));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fintCountryCode == null ? that.fintCountryCode == null : this.fintCountryCode.equals(that.fintCountryCode));
    equal = equal && (this.fstrAreaCode == null ? that.fstrAreaCode == null : this.fstrAreaCode.equals(that.fstrAreaCode));
    equal = equal && (this.fstrPhoneNumber == null ? that.fstrPhoneNumber == null : this.fstrPhoneNumber.equals(that.fstrPhoneNumber));
    equal = equal && (this.fblnVisitorVerified == null ? that.fblnVisitorVerified == null : this.fblnVisitorVerified.equals(that.fblnVisitorVerified));
    equal = equal && (this.fstrVerifyDocType == null ? that.fstrVerifyDocType == null : this.fstrVerifyDocType.equals(that.fstrVerifyDocType));
    equal = equal && (this.fintVerifyDocVer == null ? that.fintVerifyDocVer == null : this.fintVerifyDocVer.equals(that.fintVerifyDocVer));
    equal = equal && (this.fi64VerifyDocEditInProgressKey == null ? that.fi64VerifyDocEditInProgressKey == null : this.fi64VerifyDocEditInProgressKey.equals(that.fi64VerifyDocEditInProgressKey));
    equal = equal && (this.flngVerifyDocKey == null ? that.flngVerifyDocKey == null : this.flngVerifyDocKey.equals(that.flngVerifyDocKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fi64DocEditInProgressKey == null ? that.fi64DocEditInProgressKey == null : this.fi64DocEditInProgressKey.equals(that.fi64DocEditInProgressKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngXmlKey == null ? that.flngXmlKey == null : this.flngXmlKey.equals(that.flngXmlKey));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fblnHold == null ? that.fblnHold == null : this.fblnHold.equals(that.fblnHold));
    equal = equal && (this.fdtmVisitStart == null ? that.fdtmVisitStart == null : this.fdtmVisitStart.equals(that.fdtmVisitStart));
    equal = equal && (this.fdtmVisitEnd == null ? that.fdtmVisitEnd == null : this.fdtmVisitEnd.equals(that.fdtmVisitEnd));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.flngWaitTime == null ? that.flngWaitTime == null : this.flngWaitTime.equals(that.flngWaitTime));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblvisit)) {
      return false;
    }
    tblvisit that = (tblvisit) o;
    boolean equal = true;
    equal = equal && (this.flngVisitKey == null ? that.flngVisitKey == null : this.flngVisitKey.equals(that.flngVisitKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fstrVisitSource == null ? that.fstrVisitSource == null : this.fstrVisitSource.equals(that.fstrVisitSource));
    equal = equal && (this.fstrVisitCategory == null ? that.fstrVisitCategory == null : this.fstrVisitCategory.equals(that.fstrVisitCategory));
    equal = equal && (this.fstrVisitSubCategory == null ? that.fstrVisitSubCategory == null : this.fstrVisitSubCategory.equals(that.fstrVisitSubCategory));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.fblnUnregisteredVisitor == null ? that.fblnUnregisteredVisitor == null : this.fblnUnregisteredVisitor.equals(that.fblnUnregisteredVisitor));
    equal = equal && (this.fi64NameKey == null ? that.fi64NameKey == null : this.fi64NameKey.equals(that.fi64NameKey));
    equal = equal && (this.fi64AddressKey == null ? that.fi64AddressKey == null : this.fi64AddressKey.equals(that.fi64AddressKey));
    equal = equal && (this.fstrVisitId == null ? that.fstrVisitId == null : this.fstrVisitId.equals(that.fstrVisitId));
    equal = equal && (this.fstrTicketId == null ? that.fstrTicketId == null : this.fstrTicketId.equals(that.fstrTicketId));
    equal = equal && (this.fstrExternalId == null ? that.fstrExternalId == null : this.fstrExternalId.equals(that.fstrExternalId));
    equal = equal && (this.fstrIdType == null ? that.fstrIdType == null : this.fstrIdType.equals(that.fstrIdType));
    equal = equal && (this.fstrId == null ? that.fstrId == null : this.fstrId.equals(that.fstrId));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fintCountryCode == null ? that.fintCountryCode == null : this.fintCountryCode.equals(that.fintCountryCode));
    equal = equal && (this.fstrAreaCode == null ? that.fstrAreaCode == null : this.fstrAreaCode.equals(that.fstrAreaCode));
    equal = equal && (this.fstrPhoneNumber == null ? that.fstrPhoneNumber == null : this.fstrPhoneNumber.equals(that.fstrPhoneNumber));
    equal = equal && (this.fblnVisitorVerified == null ? that.fblnVisitorVerified == null : this.fblnVisitorVerified.equals(that.fblnVisitorVerified));
    equal = equal && (this.fstrVerifyDocType == null ? that.fstrVerifyDocType == null : this.fstrVerifyDocType.equals(that.fstrVerifyDocType));
    equal = equal && (this.fintVerifyDocVer == null ? that.fintVerifyDocVer == null : this.fintVerifyDocVer.equals(that.fintVerifyDocVer));
    equal = equal && (this.fi64VerifyDocEditInProgressKey == null ? that.fi64VerifyDocEditInProgressKey == null : this.fi64VerifyDocEditInProgressKey.equals(that.fi64VerifyDocEditInProgressKey));
    equal = equal && (this.flngVerifyDocKey == null ? that.flngVerifyDocKey == null : this.flngVerifyDocKey.equals(that.flngVerifyDocKey));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fi64DocEditInProgressKey == null ? that.fi64DocEditInProgressKey == null : this.fi64DocEditInProgressKey.equals(that.fi64DocEditInProgressKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngXmlKey == null ? that.flngXmlKey == null : this.flngXmlKey.equals(that.flngXmlKey));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fstrDistrictOffice == null ? that.fstrDistrictOffice == null : this.fstrDistrictOffice.equals(that.fstrDistrictOffice));
    equal = equal && (this.fblnHold == null ? that.fblnHold == null : this.fblnHold.equals(that.fblnHold));
    equal = equal && (this.fdtmVisitStart == null ? that.fdtmVisitStart == null : this.fdtmVisitStart.equals(that.fdtmVisitStart));
    equal = equal && (this.fdtmVisitEnd == null ? that.fdtmVisitEnd == null : this.fdtmVisitEnd.equals(that.fdtmVisitEnd));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.flngWaitTime == null ? that.flngWaitTime == null : this.flngWaitTime.equals(that.flngWaitTime));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngVisitKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrVisitSource = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrVisitCategory = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrVisitSubCategory = JdbcWritableBridge.readString(6, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnUnregisteredVisitor = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fi64NameKey = JdbcWritableBridge.readLong(10, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(11, __dbResults);
    this.fstrVisitId = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrTicketId = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(17, __dbResults);
    this.fintCountryCode = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrAreaCode = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrPhoneNumber = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnVisitorVerified = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrVerifyDocType = JdbcWritableBridge.readString(22, __dbResults);
    this.fintVerifyDocVer = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fi64VerifyDocEditInProgressKey = JdbcWritableBridge.readLong(24, __dbResults);
    this.flngVerifyDocKey = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(26, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fi64DocEditInProgressKey = JdbcWritableBridge.readLong(28, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.flngXmlKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(32, __dbResults);
    this.fblnHold = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fdtmVisitStart = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.fdtmVisitEnd = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(36, __dbResults);
    this.flngWaitTime = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(40, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(41, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngVisitKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrVisitSource = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrVisitCategory = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrVisitSubCategory = JdbcWritableBridge.readString(6, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(7, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnUnregisteredVisitor = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fi64NameKey = JdbcWritableBridge.readLong(10, __dbResults);
    this.fi64AddressKey = JdbcWritableBridge.readLong(11, __dbResults);
    this.fstrVisitId = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrTicketId = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrExternalId = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrIdType = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrId = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(17, __dbResults);
    this.fintCountryCode = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fstrAreaCode = JdbcWritableBridge.readString(19, __dbResults);
    this.fstrPhoneNumber = JdbcWritableBridge.readString(20, __dbResults);
    this.fblnVisitorVerified = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fstrVerifyDocType = JdbcWritableBridge.readString(22, __dbResults);
    this.fintVerifyDocVer = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fi64VerifyDocEditInProgressKey = JdbcWritableBridge.readLong(24, __dbResults);
    this.flngVerifyDocKey = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(26, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fi64DocEditInProgressKey = JdbcWritableBridge.readLong(28, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.flngXmlKey = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(31, __dbResults);
    this.fstrDistrictOffice = JdbcWritableBridge.readString(32, __dbResults);
    this.fblnHold = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fdtmVisitStart = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.fdtmVisitEnd = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(36, __dbResults);
    this.flngWaitTime = JdbcWritableBridge.readInteger(37, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(38, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(39, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(40, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(41, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngVisitKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitSource, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitCategory, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitSubCategory, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnregisteredVisitor, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameKey, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitId, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTicketId, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVisitorVerified, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVerifyDocType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVerifyDocVer, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64VerifyDocEditInProgressKey, 24 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerifyDocKey, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 27 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocEditInProgressKey, 28 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngXmlKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHold, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitStart, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitEnd, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWaitTime, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 38 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 41 + __off, 93, __dbStmt);
    return 41;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngVisitKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitSource, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitCategory, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitSubCategory, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnregisteredVisitor, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeLong(fi64NameKey, 10 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64AddressKey, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitId, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTicketId, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalId, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrIdType, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrId, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintCountryCode, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrAreaCode, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPhoneNumber, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVisitorVerified, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVerifyDocType, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVerifyDocVer, 23 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64VerifyDocEditInProgressKey, 24 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerifyDocKey, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 27 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocEditInProgressKey, 28 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngXmlKey, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDistrictOffice, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHold, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitStart, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitEnd, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngWaitTime, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 38 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 39 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 40 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 41 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngVisitKey = null;
    } else {
    this.flngVisitKey = Integer.valueOf(__dataIn.readInt());
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
        this.fstrVisitSource = null;
    } else {
    this.fstrVisitSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitCategory = null;
    } else {
    this.fstrVisitCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitSubCategory = null;
    } else {
    this.fstrVisitSubCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUnregisteredVisitor = null;
    } else {
    this.fblnUnregisteredVisitor = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64NameKey = null;
    } else {
    this.fi64NameKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64AddressKey = null;
    } else {
    this.fi64AddressKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitId = null;
    } else {
    this.fstrVisitId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTicketId = null;
    } else {
    this.fstrTicketId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalId = null;
    } else {
    this.fstrExternalId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrIdType = null;
    } else {
    this.fstrIdType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrId = null;
    } else {
    this.fstrId = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintCountryCode = null;
    } else {
    this.fintCountryCode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAreaCode = null;
    } else {
    this.fstrAreaCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPhoneNumber = null;
    } else {
    this.fstrPhoneNumber = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVisitorVerified = null;
    } else {
    this.fblnVisitorVerified = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVerifyDocType = null;
    } else {
    this.fstrVerifyDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintVerifyDocVer = null;
    } else {
    this.fintVerifyDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64VerifyDocEditInProgressKey = null;
    } else {
    this.fi64VerifyDocEditInProgressKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerifyDocKey = null;
    } else {
    this.flngVerifyDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64DocEditInProgressKey = null;
    } else {
    this.fi64DocEditInProgressKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngXmlKey = null;
    } else {
    this.flngXmlKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDistrictOffice = null;
    } else {
    this.fstrDistrictOffice = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHold = null;
    } else {
    this.fblnHold = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVisitStart = null;
    } else {
    this.fdtmVisitStart = new Timestamp(__dataIn.readLong());
    this.fdtmVisitStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVisitEnd = null;
    } else {
    this.fdtmVisitEnd = new Timestamp(__dataIn.readLong());
    this.fdtmVisitEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDuration = null;
    } else {
    this.flngDuration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngWaitTime = null;
    } else {
    this.flngWaitTime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
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
    if (null == this.flngVisitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVisitKey);
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
    if (null == this.fstrVisitSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitSource);
    }
    if (null == this.fstrVisitCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitCategory);
    }
    if (null == this.fstrVisitSubCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitSubCategory);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fblnUnregisteredVisitor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnregisteredVisitor);
    }
    if (null == this.fi64NameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameKey);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
    }
    if (null == this.fstrVisitId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitId);
    }
    if (null == this.fstrTicketId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTicketId);
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIdType);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fintCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode);
    }
    if (null == this.fstrAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode);
    }
    if (null == this.fstrPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber);
    }
    if (null == this.fblnVisitorVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVisitorVerified);
    }
    if (null == this.fstrVerifyDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVerifyDocType);
    }
    if (null == this.fintVerifyDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVerifyDocVer);
    }
    if (null == this.fi64VerifyDocEditInProgressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64VerifyDocEditInProgressKey);
    }
    if (null == this.flngVerifyDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerifyDocKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fi64DocEditInProgressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocEditInProgressKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngXmlKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngXmlKey);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fblnHold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHold);
    }
    if (null == this.fdtmVisitStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitStart.getTime());
    __dataOut.writeInt(this.fdtmVisitStart.getNanos());
    }
    if (null == this.fdtmVisitEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitEnd.getTime());
    __dataOut.writeInt(this.fdtmVisitEnd.getNanos());
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
    }
    if (null == this.flngWaitTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWaitTime);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    if (null == this.flngVisitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVisitKey);
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
    if (null == this.fstrVisitSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitSource);
    }
    if (null == this.fstrVisitCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitCategory);
    }
    if (null == this.fstrVisitSubCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitSubCategory);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.fblnUnregisteredVisitor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnregisteredVisitor);
    }
    if (null == this.fi64NameKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64NameKey);
    }
    if (null == this.fi64AddressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64AddressKey);
    }
    if (null == this.fstrVisitId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitId);
    }
    if (null == this.fstrTicketId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTicketId);
    }
    if (null == this.fstrExternalId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalId);
    }
    if (null == this.fstrIdType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrIdType);
    }
    if (null == this.fstrId) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrId);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fintCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintCountryCode);
    }
    if (null == this.fstrAreaCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAreaCode);
    }
    if (null == this.fstrPhoneNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPhoneNumber);
    }
    if (null == this.fblnVisitorVerified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVisitorVerified);
    }
    if (null == this.fstrVerifyDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVerifyDocType);
    }
    if (null == this.fintVerifyDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVerifyDocVer);
    }
    if (null == this.fi64VerifyDocEditInProgressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64VerifyDocEditInProgressKey);
    }
    if (null == this.flngVerifyDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerifyDocKey);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fi64DocEditInProgressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocEditInProgressKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngXmlKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngXmlKey);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fstrDistrictOffice) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDistrictOffice);
    }
    if (null == this.fblnHold) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHold);
    }
    if (null == this.fdtmVisitStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitStart.getTime());
    __dataOut.writeInt(this.fdtmVisitStart.getNanos());
    }
    if (null == this.fdtmVisitEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitEnd.getTime());
    __dataOut.writeInt(this.fdtmVisitEnd.getNanos());
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
    }
    if (null == this.flngWaitTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngWaitTime);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVisitKey==null?"\\N":"" + flngVisitKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitSource==null?"\\N":fstrVisitSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitCategory==null?"\\N":fstrVisitCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitSubCategory==null?"\\N":fstrVisitSubCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnregisteredVisitor==null?"\\N":"" + fblnUnregisteredVisitor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameKey==null?"\\N":"" + fi64NameKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitId==null?"\\N":fstrVisitId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTicketId==null?"\\N":fstrTicketId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode==null?"\\N":"" + fintCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode==null?"\\N":fstrAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber==null?"\\N":fstrPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVisitorVerified==null?"\\N":"" + fblnVisitorVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVerifyDocType==null?"\\N":fstrVerifyDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVerifyDocVer==null?"\\N":"" + fintVerifyDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64VerifyDocEditInProgressKey==null?"\\N":"" + fi64VerifyDocEditInProgressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerifyDocKey==null?"\\N":"" + flngVerifyDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocEditInProgressKey==null?"\\N":"" + fi64DocEditInProgressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngXmlKey==null?"\\N":"" + flngXmlKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHold==null?"\\N":"" + fblnHold, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitStart==null?"\\N":"" + fdtmVisitStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitEnd==null?"\\N":"" + fdtmVisitEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWaitTime==null?"\\N":"" + flngWaitTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVisitKey==null?"\\N":"" + flngVisitKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitSource==null?"\\N":fstrVisitSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitCategory==null?"\\N":fstrVisitCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitSubCategory==null?"\\N":fstrVisitSubCategory, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnregisteredVisitor==null?"\\N":"" + fblnUnregisteredVisitor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64NameKey==null?"\\N":"" + fi64NameKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64AddressKey==null?"\\N":"" + fi64AddressKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitId==null?"\\N":fstrVisitId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTicketId==null?"\\N":fstrTicketId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalId==null?"\\N":fstrExternalId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrIdType==null?"\\N":fstrIdType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrId==null?"\\N":fstrId, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintCountryCode==null?"\\N":"" + fintCountryCode, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAreaCode==null?"\\N":fstrAreaCode, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPhoneNumber==null?"\\N":fstrPhoneNumber, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVisitorVerified==null?"\\N":"" + fblnVisitorVerified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVerifyDocType==null?"\\N":fstrVerifyDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVerifyDocVer==null?"\\N":"" + fintVerifyDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64VerifyDocEditInProgressKey==null?"\\N":"" + fi64VerifyDocEditInProgressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerifyDocKey==null?"\\N":"" + flngVerifyDocKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocEditInProgressKey==null?"\\N":"" + fi64DocEditInProgressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngXmlKey==null?"\\N":"" + flngXmlKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDistrictOffice==null?"\\N":fstrDistrictOffice, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHold==null?"\\N":"" + fblnHold, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitStart==null?"\\N":"" + fdtmVisitStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitEnd==null?"\\N":"" + fdtmVisitEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngWaitTime==null?"\\N":"" + flngWaitTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVisitKey = null; } else {
      this.flngVisitKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVisitSource = null; } else {
      this.fstrVisitSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitCategory = null; } else {
      this.fstrVisitCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitSubCategory = null; } else {
      this.fstrVisitSubCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnregisteredVisitor = null; } else {
      this.fblnUnregisteredVisitor = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameKey = null; } else {
      this.fi64NameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AddressKey = null; } else {
      this.fi64AddressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitId = null; } else {
      this.fstrVisitId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTicketId = null; } else {
      this.fstrTicketId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIdType = null; } else {
      this.fstrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrId = null; } else {
      this.fstrId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode = null; } else {
      this.fintCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode = null; } else {
      this.fstrAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber = null; } else {
      this.fstrPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVisitorVerified = null; } else {
      this.fblnVisitorVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVerifyDocType = null; } else {
      this.fstrVerifyDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVerifyDocVer = null; } else {
      this.fintVerifyDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64VerifyDocEditInProgressKey = null; } else {
      this.fi64VerifyDocEditInProgressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerifyDocKey = null; } else {
      this.flngVerifyDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocEditInProgressKey = null; } else {
      this.fi64DocEditInProgressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngXmlKey = null; } else {
      this.flngXmlKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHold = null; } else {
      this.fblnHold = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitStart = null; } else {
      this.fdtmVisitStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitEnd = null; } else {
      this.fdtmVisitEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWaitTime = null; } else {
      this.flngWaitTime = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVisitKey = null; } else {
      this.flngVisitKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrVisitSource = null; } else {
      this.fstrVisitSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitCategory = null; } else {
      this.fstrVisitCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitSubCategory = null; } else {
      this.fstrVisitSubCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnregisteredVisitor = null; } else {
      this.fblnUnregisteredVisitor = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64NameKey = null; } else {
      this.fi64NameKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64AddressKey = null; } else {
      this.fi64AddressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitId = null; } else {
      this.fstrVisitId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTicketId = null; } else {
      this.fstrTicketId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalId = null; } else {
      this.fstrExternalId = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrIdType = null; } else {
      this.fstrIdType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrId = null; } else {
      this.fstrId = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintCountryCode = null; } else {
      this.fintCountryCode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAreaCode = null; } else {
      this.fstrAreaCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPhoneNumber = null; } else {
      this.fstrPhoneNumber = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVisitorVerified = null; } else {
      this.fblnVisitorVerified = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVerifyDocType = null; } else {
      this.fstrVerifyDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVerifyDocVer = null; } else {
      this.fintVerifyDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64VerifyDocEditInProgressKey = null; } else {
      this.fi64VerifyDocEditInProgressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerifyDocKey = null; } else {
      this.flngVerifyDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocEditInProgressKey = null; } else {
      this.fi64DocEditInProgressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngXmlKey = null; } else {
      this.flngXmlKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDistrictOffice = null; } else {
      this.fstrDistrictOffice = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHold = null; } else {
      this.fblnHold = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitStart = null; } else {
      this.fdtmVisitStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitEnd = null; } else {
      this.fdtmVisitEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngWaitTime = null; } else {
      this.flngWaitTime = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReversed = null; } else {
      this.fdtmReversed = java.sql.Timestamp.valueOf(__cur_str);
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
    tblvisit o = (tblvisit) super.clone();
    o.fdtmVisitStart = (o.fdtmVisitStart != null) ? (java.sql.Timestamp) o.fdtmVisitStart.clone() : null;
    o.fdtmVisitEnd = (o.fdtmVisitEnd != null) ? (java.sql.Timestamp) o.fdtmVisitEnd.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblvisit o) throws CloneNotSupportedException {
    o.fdtmVisitStart = (o.fdtmVisitStart != null) ? (java.sql.Timestamp) o.fdtmVisitStart.clone() : null;
    o.fdtmVisitEnd = (o.fdtmVisitEnd != null) ? (java.sql.Timestamp) o.fdtmVisitEnd.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngVisitKey", this.flngVisitKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrVisitSource", this.fstrVisitSource);
    __sqoop$field_map.put("fstrVisitCategory", this.fstrVisitCategory);
    __sqoop$field_map.put("fstrVisitSubCategory", this.fstrVisitSubCategory);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fblnUnregisteredVisitor", this.fblnUnregisteredVisitor);
    __sqoop$field_map.put("fi64NameKey", this.fi64NameKey);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fstrVisitId", this.fstrVisitId);
    __sqoop$field_map.put("fstrTicketId", this.fstrTicketId);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fintCountryCode", this.fintCountryCode);
    __sqoop$field_map.put("fstrAreaCode", this.fstrAreaCode);
    __sqoop$field_map.put("fstrPhoneNumber", this.fstrPhoneNumber);
    __sqoop$field_map.put("fblnVisitorVerified", this.fblnVisitorVerified);
    __sqoop$field_map.put("fstrVerifyDocType", this.fstrVerifyDocType);
    __sqoop$field_map.put("fintVerifyDocVer", this.fintVerifyDocVer);
    __sqoop$field_map.put("fi64VerifyDocEditInProgressKey", this.fi64VerifyDocEditInProgressKey);
    __sqoop$field_map.put("flngVerifyDocKey", this.flngVerifyDocKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fi64DocEditInProgressKey", this.fi64DocEditInProgressKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngXmlKey", this.flngXmlKey);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fblnHold", this.fblnHold);
    __sqoop$field_map.put("fdtmVisitStart", this.fdtmVisitStart);
    __sqoop$field_map.put("fdtmVisitEnd", this.fdtmVisitEnd);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("flngWaitTime", this.flngWaitTime);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngVisitKey", this.flngVisitKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fstrVisitSource", this.fstrVisitSource);
    __sqoop$field_map.put("fstrVisitCategory", this.fstrVisitCategory);
    __sqoop$field_map.put("fstrVisitSubCategory", this.fstrVisitSubCategory);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("fblnUnregisteredVisitor", this.fblnUnregisteredVisitor);
    __sqoop$field_map.put("fi64NameKey", this.fi64NameKey);
    __sqoop$field_map.put("fi64AddressKey", this.fi64AddressKey);
    __sqoop$field_map.put("fstrVisitId", this.fstrVisitId);
    __sqoop$field_map.put("fstrTicketId", this.fstrTicketId);
    __sqoop$field_map.put("fstrExternalId", this.fstrExternalId);
    __sqoop$field_map.put("fstrIdType", this.fstrIdType);
    __sqoop$field_map.put("fstrId", this.fstrId);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fintCountryCode", this.fintCountryCode);
    __sqoop$field_map.put("fstrAreaCode", this.fstrAreaCode);
    __sqoop$field_map.put("fstrPhoneNumber", this.fstrPhoneNumber);
    __sqoop$field_map.put("fblnVisitorVerified", this.fblnVisitorVerified);
    __sqoop$field_map.put("fstrVerifyDocType", this.fstrVerifyDocType);
    __sqoop$field_map.put("fintVerifyDocVer", this.fintVerifyDocVer);
    __sqoop$field_map.put("fi64VerifyDocEditInProgressKey", this.fi64VerifyDocEditInProgressKey);
    __sqoop$field_map.put("flngVerifyDocKey", this.flngVerifyDocKey);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fi64DocEditInProgressKey", this.fi64DocEditInProgressKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngXmlKey", this.flngXmlKey);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fstrDistrictOffice", this.fstrDistrictOffice);
    __sqoop$field_map.put("fblnHold", this.fblnHold);
    __sqoop$field_map.put("fdtmVisitStart", this.fdtmVisitStart);
    __sqoop$field_map.put("fdtmVisitEnd", this.fdtmVisitEnd);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("flngWaitTime", this.flngWaitTime);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
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
