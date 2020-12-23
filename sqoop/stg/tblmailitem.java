// ORM class for table 'tblmailitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:40:34 NZDT 2020
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

public class tblmailitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngMailItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngMailItemKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngMailTypeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngMailTypeKey = (Integer)value;
      }
    });
    setters.put("flngTemplateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngTemplateKey = (Integer)value;
      }
    });
    setters.put("flngCRMKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngCRMKey = (Integer)value;
      }
    });
    setters.put("fstrRecipientKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrRecipientKey = (String)value;
      }
    });
    setters.put("flngNameAddressHash", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngNameAddressHash = (Integer)value;
      }
    });
    setters.put("fstrSortKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrSortKey = (String)value;
      }
    });
    setters.put("fdtmSortDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmSortDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintMailTypeSort", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fintMailTypeSort = (Integer)value;
      }
    });
    setters.put("fstrLanguage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrLanguage = (String)value;
      }
    });
    setters.put("fstrAddressBlock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrAddressBlock = (String)value;
      }
    });
    setters.put("fstrEmailTo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrEmailTo = (String)value;
      }
    });
    setters.put("fstrName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrName = (String)value;
      }
    });
    setters.put("fstrDLN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrDLN = (String)value;
      }
    });
    setters.put("fstrCity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrCity = (String)value;
      }
    });
    setters.put("fstrCountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrCountry = (String)value;
      }
    });
    setters.put("fstrZip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrZip = (String)value;
      }
    });
    setters.put("fblnValidAddress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fblnValidAddress = (Integer)value;
      }
    });
    setters.put("fdtmCreated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmCreated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrCreatedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrCreatedWho = (String)value;
      }
    });
    setters.put("fdtmBatched", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmBatched = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmPrinted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmPrinted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrPrintedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrPrintedWho = (String)value;
      }
    });
    setters.put("fstrPrinter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrPrinter = (String)value;
      }
    });
    setters.put("fdtmRePrinted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmRePrinted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReprintedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrReprintedWho = (String)value;
      }
    });
    setters.put("fstrRePrintPrinter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrRePrintPrinter = (String)value;
      }
    });
    setters.put("fdtmReady", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmReady = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReadyWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrReadyWho = (String)value;
      }
    });
    setters.put("fdtmEmailedOn", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmEmailedOn = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngPrintGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngPrintGroupKey = (Integer)value;
      }
    });
    setters.put("fblnValid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fblnValid = (Integer)value;
      }
    });
    setters.put("fstrValidatedWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrValidatedWho = (String)value;
      }
    });
    setters.put("fdtmValidatedWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmValidatedWhen = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnElectronicOnly", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fblnElectronicOnly = (Integer)value;
      }
    });
    setters.put("fstrRenderType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrRenderType = (String)value;
      }
    });
    setters.put("fstrDatabase", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrDatabase = (String)value;
      }
    });
    setters.put("flngImageKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.flngImageKey = (Integer)value;
      }
    });
    setters.put("fblnLock", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fblnLock = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblmailitem() {
    init0();
  }
  private Integer flngMailItemKey;
  public Integer get_flngMailItemKey() {
    return flngMailItemKey;
  }
  public void set_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
  }
  public tblmailitem with_flngMailItemKey(Integer flngMailItemKey) {
    this.flngMailItemKey = flngMailItemKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblmailitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngMailTypeKey;
  public Integer get_flngMailTypeKey() {
    return flngMailTypeKey;
  }
  public void set_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
  }
  public tblmailitem with_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
    return this;
  }
  private Integer flngTemplateKey;
  public Integer get_flngTemplateKey() {
    return flngTemplateKey;
  }
  public void set_flngTemplateKey(Integer flngTemplateKey) {
    this.flngTemplateKey = flngTemplateKey;
  }
  public tblmailitem with_flngTemplateKey(Integer flngTemplateKey) {
    this.flngTemplateKey = flngTemplateKey;
    return this;
  }
  private Integer flngCRMKey;
  public Integer get_flngCRMKey() {
    return flngCRMKey;
  }
  public void set_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
  }
  public tblmailitem with_flngCRMKey(Integer flngCRMKey) {
    this.flngCRMKey = flngCRMKey;
    return this;
  }
  private String fstrRecipientKey;
  public String get_fstrRecipientKey() {
    return fstrRecipientKey;
  }
  public void set_fstrRecipientKey(String fstrRecipientKey) {
    this.fstrRecipientKey = fstrRecipientKey;
  }
  public tblmailitem with_fstrRecipientKey(String fstrRecipientKey) {
    this.fstrRecipientKey = fstrRecipientKey;
    return this;
  }
  private Integer flngNameAddressHash;
  public Integer get_flngNameAddressHash() {
    return flngNameAddressHash;
  }
  public void set_flngNameAddressHash(Integer flngNameAddressHash) {
    this.flngNameAddressHash = flngNameAddressHash;
  }
  public tblmailitem with_flngNameAddressHash(Integer flngNameAddressHash) {
    this.flngNameAddressHash = flngNameAddressHash;
    return this;
  }
  private String fstrSortKey;
  public String get_fstrSortKey() {
    return fstrSortKey;
  }
  public void set_fstrSortKey(String fstrSortKey) {
    this.fstrSortKey = fstrSortKey;
  }
  public tblmailitem with_fstrSortKey(String fstrSortKey) {
    this.fstrSortKey = fstrSortKey;
    return this;
  }
  private java.sql.Timestamp fdtmSortDate;
  public java.sql.Timestamp get_fdtmSortDate() {
    return fdtmSortDate;
  }
  public void set_fdtmSortDate(java.sql.Timestamp fdtmSortDate) {
    this.fdtmSortDate = fdtmSortDate;
  }
  public tblmailitem with_fdtmSortDate(java.sql.Timestamp fdtmSortDate) {
    this.fdtmSortDate = fdtmSortDate;
    return this;
  }
  private Integer fintMailTypeSort;
  public Integer get_fintMailTypeSort() {
    return fintMailTypeSort;
  }
  public void set_fintMailTypeSort(Integer fintMailTypeSort) {
    this.fintMailTypeSort = fintMailTypeSort;
  }
  public tblmailitem with_fintMailTypeSort(Integer fintMailTypeSort) {
    this.fintMailTypeSort = fintMailTypeSort;
    return this;
  }
  private String fstrLanguage;
  public String get_fstrLanguage() {
    return fstrLanguage;
  }
  public void set_fstrLanguage(String fstrLanguage) {
    this.fstrLanguage = fstrLanguage;
  }
  public tblmailitem with_fstrLanguage(String fstrLanguage) {
    this.fstrLanguage = fstrLanguage;
    return this;
  }
  private String fstrAddressBlock;
  public String get_fstrAddressBlock() {
    return fstrAddressBlock;
  }
  public void set_fstrAddressBlock(String fstrAddressBlock) {
    this.fstrAddressBlock = fstrAddressBlock;
  }
  public tblmailitem with_fstrAddressBlock(String fstrAddressBlock) {
    this.fstrAddressBlock = fstrAddressBlock;
    return this;
  }
  private String fstrEmailTo;
  public String get_fstrEmailTo() {
    return fstrEmailTo;
  }
  public void set_fstrEmailTo(String fstrEmailTo) {
    this.fstrEmailTo = fstrEmailTo;
  }
  public tblmailitem with_fstrEmailTo(String fstrEmailTo) {
    this.fstrEmailTo = fstrEmailTo;
    return this;
  }
  private String fstrName;
  public String get_fstrName() {
    return fstrName;
  }
  public void set_fstrName(String fstrName) {
    this.fstrName = fstrName;
  }
  public tblmailitem with_fstrName(String fstrName) {
    this.fstrName = fstrName;
    return this;
  }
  private String fstrDLN;
  public String get_fstrDLN() {
    return fstrDLN;
  }
  public void set_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
  }
  public tblmailitem with_fstrDLN(String fstrDLN) {
    this.fstrDLN = fstrDLN;
    return this;
  }
  private String fstrCity;
  public String get_fstrCity() {
    return fstrCity;
  }
  public void set_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
  }
  public tblmailitem with_fstrCity(String fstrCity) {
    this.fstrCity = fstrCity;
    return this;
  }
  private String fstrCountry;
  public String get_fstrCountry() {
    return fstrCountry;
  }
  public void set_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
  }
  public tblmailitem with_fstrCountry(String fstrCountry) {
    this.fstrCountry = fstrCountry;
    return this;
  }
  private String fstrZip;
  public String get_fstrZip() {
    return fstrZip;
  }
  public void set_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
  }
  public tblmailitem with_fstrZip(String fstrZip) {
    this.fstrZip = fstrZip;
    return this;
  }
  private Integer fblnValidAddress;
  public Integer get_fblnValidAddress() {
    return fblnValidAddress;
  }
  public void set_fblnValidAddress(Integer fblnValidAddress) {
    this.fblnValidAddress = fblnValidAddress;
  }
  public tblmailitem with_fblnValidAddress(Integer fblnValidAddress) {
    this.fblnValidAddress = fblnValidAddress;
    return this;
  }
  private java.sql.Timestamp fdtmCreated;
  public java.sql.Timestamp get_fdtmCreated() {
    return fdtmCreated;
  }
  public void set_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
  }
  public tblmailitem with_fdtmCreated(java.sql.Timestamp fdtmCreated) {
    this.fdtmCreated = fdtmCreated;
    return this;
  }
  private String fstrCreatedWho;
  public String get_fstrCreatedWho() {
    return fstrCreatedWho;
  }
  public void set_fstrCreatedWho(String fstrCreatedWho) {
    this.fstrCreatedWho = fstrCreatedWho;
  }
  public tblmailitem with_fstrCreatedWho(String fstrCreatedWho) {
    this.fstrCreatedWho = fstrCreatedWho;
    return this;
  }
  private java.sql.Timestamp fdtmBatched;
  public java.sql.Timestamp get_fdtmBatched() {
    return fdtmBatched;
  }
  public void set_fdtmBatched(java.sql.Timestamp fdtmBatched) {
    this.fdtmBatched = fdtmBatched;
  }
  public tblmailitem with_fdtmBatched(java.sql.Timestamp fdtmBatched) {
    this.fdtmBatched = fdtmBatched;
    return this;
  }
  private java.sql.Timestamp fdtmPrinted;
  public java.sql.Timestamp get_fdtmPrinted() {
    return fdtmPrinted;
  }
  public void set_fdtmPrinted(java.sql.Timestamp fdtmPrinted) {
    this.fdtmPrinted = fdtmPrinted;
  }
  public tblmailitem with_fdtmPrinted(java.sql.Timestamp fdtmPrinted) {
    this.fdtmPrinted = fdtmPrinted;
    return this;
  }
  private String fstrPrintedWho;
  public String get_fstrPrintedWho() {
    return fstrPrintedWho;
  }
  public void set_fstrPrintedWho(String fstrPrintedWho) {
    this.fstrPrintedWho = fstrPrintedWho;
  }
  public tblmailitem with_fstrPrintedWho(String fstrPrintedWho) {
    this.fstrPrintedWho = fstrPrintedWho;
    return this;
  }
  private String fstrPrinter;
  public String get_fstrPrinter() {
    return fstrPrinter;
  }
  public void set_fstrPrinter(String fstrPrinter) {
    this.fstrPrinter = fstrPrinter;
  }
  public tblmailitem with_fstrPrinter(String fstrPrinter) {
    this.fstrPrinter = fstrPrinter;
    return this;
  }
  private java.sql.Timestamp fdtmRePrinted;
  public java.sql.Timestamp get_fdtmRePrinted() {
    return fdtmRePrinted;
  }
  public void set_fdtmRePrinted(java.sql.Timestamp fdtmRePrinted) {
    this.fdtmRePrinted = fdtmRePrinted;
  }
  public tblmailitem with_fdtmRePrinted(java.sql.Timestamp fdtmRePrinted) {
    this.fdtmRePrinted = fdtmRePrinted;
    return this;
  }
  private String fstrReprintedWho;
  public String get_fstrReprintedWho() {
    return fstrReprintedWho;
  }
  public void set_fstrReprintedWho(String fstrReprintedWho) {
    this.fstrReprintedWho = fstrReprintedWho;
  }
  public tblmailitem with_fstrReprintedWho(String fstrReprintedWho) {
    this.fstrReprintedWho = fstrReprintedWho;
    return this;
  }
  private String fstrRePrintPrinter;
  public String get_fstrRePrintPrinter() {
    return fstrRePrintPrinter;
  }
  public void set_fstrRePrintPrinter(String fstrRePrintPrinter) {
    this.fstrRePrintPrinter = fstrRePrintPrinter;
  }
  public tblmailitem with_fstrRePrintPrinter(String fstrRePrintPrinter) {
    this.fstrRePrintPrinter = fstrRePrintPrinter;
    return this;
  }
  private java.sql.Timestamp fdtmReady;
  public java.sql.Timestamp get_fdtmReady() {
    return fdtmReady;
  }
  public void set_fdtmReady(java.sql.Timestamp fdtmReady) {
    this.fdtmReady = fdtmReady;
  }
  public tblmailitem with_fdtmReady(java.sql.Timestamp fdtmReady) {
    this.fdtmReady = fdtmReady;
    return this;
  }
  private String fstrReadyWho;
  public String get_fstrReadyWho() {
    return fstrReadyWho;
  }
  public void set_fstrReadyWho(String fstrReadyWho) {
    this.fstrReadyWho = fstrReadyWho;
  }
  public tblmailitem with_fstrReadyWho(String fstrReadyWho) {
    this.fstrReadyWho = fstrReadyWho;
    return this;
  }
  private java.sql.Timestamp fdtmEmailedOn;
  public java.sql.Timestamp get_fdtmEmailedOn() {
    return fdtmEmailedOn;
  }
  public void set_fdtmEmailedOn(java.sql.Timestamp fdtmEmailedOn) {
    this.fdtmEmailedOn = fdtmEmailedOn;
  }
  public tblmailitem with_fdtmEmailedOn(java.sql.Timestamp fdtmEmailedOn) {
    this.fdtmEmailedOn = fdtmEmailedOn;
    return this;
  }
  private Integer flngPrintGroupKey;
  public Integer get_flngPrintGroupKey() {
    return flngPrintGroupKey;
  }
  public void set_flngPrintGroupKey(Integer flngPrintGroupKey) {
    this.flngPrintGroupKey = flngPrintGroupKey;
  }
  public tblmailitem with_flngPrintGroupKey(Integer flngPrintGroupKey) {
    this.flngPrintGroupKey = flngPrintGroupKey;
    return this;
  }
  private Integer fblnValid;
  public Integer get_fblnValid() {
    return fblnValid;
  }
  public void set_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
  }
  public tblmailitem with_fblnValid(Integer fblnValid) {
    this.fblnValid = fblnValid;
    return this;
  }
  private String fstrValidatedWho;
  public String get_fstrValidatedWho() {
    return fstrValidatedWho;
  }
  public void set_fstrValidatedWho(String fstrValidatedWho) {
    this.fstrValidatedWho = fstrValidatedWho;
  }
  public tblmailitem with_fstrValidatedWho(String fstrValidatedWho) {
    this.fstrValidatedWho = fstrValidatedWho;
    return this;
  }
  private java.sql.Timestamp fdtmValidatedWhen;
  public java.sql.Timestamp get_fdtmValidatedWhen() {
    return fdtmValidatedWhen;
  }
  public void set_fdtmValidatedWhen(java.sql.Timestamp fdtmValidatedWhen) {
    this.fdtmValidatedWhen = fdtmValidatedWhen;
  }
  public tblmailitem with_fdtmValidatedWhen(java.sql.Timestamp fdtmValidatedWhen) {
    this.fdtmValidatedWhen = fdtmValidatedWhen;
    return this;
  }
  private Integer fblnElectronicOnly;
  public Integer get_fblnElectronicOnly() {
    return fblnElectronicOnly;
  }
  public void set_fblnElectronicOnly(Integer fblnElectronicOnly) {
    this.fblnElectronicOnly = fblnElectronicOnly;
  }
  public tblmailitem with_fblnElectronicOnly(Integer fblnElectronicOnly) {
    this.fblnElectronicOnly = fblnElectronicOnly;
    return this;
  }
  private String fstrRenderType;
  public String get_fstrRenderType() {
    return fstrRenderType;
  }
  public void set_fstrRenderType(String fstrRenderType) {
    this.fstrRenderType = fstrRenderType;
  }
  public tblmailitem with_fstrRenderType(String fstrRenderType) {
    this.fstrRenderType = fstrRenderType;
    return this;
  }
  private String fstrDatabase;
  public String get_fstrDatabase() {
    return fstrDatabase;
  }
  public void set_fstrDatabase(String fstrDatabase) {
    this.fstrDatabase = fstrDatabase;
  }
  public tblmailitem with_fstrDatabase(String fstrDatabase) {
    this.fstrDatabase = fstrDatabase;
    return this;
  }
  private Integer flngImageKey;
  public Integer get_flngImageKey() {
    return flngImageKey;
  }
  public void set_flngImageKey(Integer flngImageKey) {
    this.flngImageKey = flngImageKey;
  }
  public tblmailitem with_flngImageKey(Integer flngImageKey) {
    this.flngImageKey = flngImageKey;
    return this;
  }
  private Integer fblnLock;
  public Integer get_fblnLock() {
    return fblnLock;
  }
  public void set_fblnLock(Integer fblnLock) {
    this.fblnLock = fblnLock;
  }
  public tblmailitem with_fblnLock(Integer fblnLock) {
    this.fblnLock = fblnLock;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblmailitem with_fstrWho(String fstrWho) {
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
  public tblmailitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailitem)) {
      return false;
    }
    tblmailitem that = (tblmailitem) o;
    boolean equal = true;
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngTemplateKey == null ? that.flngTemplateKey == null : this.flngTemplateKey.equals(that.flngTemplateKey));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrRecipientKey == null ? that.fstrRecipientKey == null : this.fstrRecipientKey.equals(that.fstrRecipientKey));
    equal = equal && (this.flngNameAddressHash == null ? that.flngNameAddressHash == null : this.flngNameAddressHash.equals(that.flngNameAddressHash));
    equal = equal && (this.fstrSortKey == null ? that.fstrSortKey == null : this.fstrSortKey.equals(that.fstrSortKey));
    equal = equal && (this.fdtmSortDate == null ? that.fdtmSortDate == null : this.fdtmSortDate.equals(that.fdtmSortDate));
    equal = equal && (this.fintMailTypeSort == null ? that.fintMailTypeSort == null : this.fintMailTypeSort.equals(that.fintMailTypeSort));
    equal = equal && (this.fstrLanguage == null ? that.fstrLanguage == null : this.fstrLanguage.equals(that.fstrLanguage));
    equal = equal && (this.fstrAddressBlock == null ? that.fstrAddressBlock == null : this.fstrAddressBlock.equals(that.fstrAddressBlock));
    equal = equal && (this.fstrEmailTo == null ? that.fstrEmailTo == null : this.fstrEmailTo.equals(that.fstrEmailTo));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fblnValidAddress == null ? that.fblnValidAddress == null : this.fblnValidAddress.equals(that.fblnValidAddress));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedWho == null ? that.fstrCreatedWho == null : this.fstrCreatedWho.equals(that.fstrCreatedWho));
    equal = equal && (this.fdtmBatched == null ? that.fdtmBatched == null : this.fdtmBatched.equals(that.fdtmBatched));
    equal = equal && (this.fdtmPrinted == null ? that.fdtmPrinted == null : this.fdtmPrinted.equals(that.fdtmPrinted));
    equal = equal && (this.fstrPrintedWho == null ? that.fstrPrintedWho == null : this.fstrPrintedWho.equals(that.fstrPrintedWho));
    equal = equal && (this.fstrPrinter == null ? that.fstrPrinter == null : this.fstrPrinter.equals(that.fstrPrinter));
    equal = equal && (this.fdtmRePrinted == null ? that.fdtmRePrinted == null : this.fdtmRePrinted.equals(that.fdtmRePrinted));
    equal = equal && (this.fstrReprintedWho == null ? that.fstrReprintedWho == null : this.fstrReprintedWho.equals(that.fstrReprintedWho));
    equal = equal && (this.fstrRePrintPrinter == null ? that.fstrRePrintPrinter == null : this.fstrRePrintPrinter.equals(that.fstrRePrintPrinter));
    equal = equal && (this.fdtmReady == null ? that.fdtmReady == null : this.fdtmReady.equals(that.fdtmReady));
    equal = equal && (this.fstrReadyWho == null ? that.fstrReadyWho == null : this.fstrReadyWho.equals(that.fstrReadyWho));
    equal = equal && (this.fdtmEmailedOn == null ? that.fdtmEmailedOn == null : this.fdtmEmailedOn.equals(that.fdtmEmailedOn));
    equal = equal && (this.flngPrintGroupKey == null ? that.flngPrintGroupKey == null : this.flngPrintGroupKey.equals(that.flngPrintGroupKey));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrValidatedWho == null ? that.fstrValidatedWho == null : this.fstrValidatedWho.equals(that.fstrValidatedWho));
    equal = equal && (this.fdtmValidatedWhen == null ? that.fdtmValidatedWhen == null : this.fdtmValidatedWhen.equals(that.fdtmValidatedWhen));
    equal = equal && (this.fblnElectronicOnly == null ? that.fblnElectronicOnly == null : this.fblnElectronicOnly.equals(that.fblnElectronicOnly));
    equal = equal && (this.fstrRenderType == null ? that.fstrRenderType == null : this.fstrRenderType.equals(that.fstrRenderType));
    equal = equal && (this.fstrDatabase == null ? that.fstrDatabase == null : this.fstrDatabase.equals(that.fstrDatabase));
    equal = equal && (this.flngImageKey == null ? that.flngImageKey == null : this.flngImageKey.equals(that.flngImageKey));
    equal = equal && (this.fblnLock == null ? that.fblnLock == null : this.fblnLock.equals(that.fblnLock));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailitem)) {
      return false;
    }
    tblmailitem that = (tblmailitem) o;
    boolean equal = true;
    equal = equal && (this.flngMailItemKey == null ? that.flngMailItemKey == null : this.flngMailItemKey.equals(that.flngMailItemKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngTemplateKey == null ? that.flngTemplateKey == null : this.flngTemplateKey.equals(that.flngTemplateKey));
    equal = equal && (this.flngCRMKey == null ? that.flngCRMKey == null : this.flngCRMKey.equals(that.flngCRMKey));
    equal = equal && (this.fstrRecipientKey == null ? that.fstrRecipientKey == null : this.fstrRecipientKey.equals(that.fstrRecipientKey));
    equal = equal && (this.flngNameAddressHash == null ? that.flngNameAddressHash == null : this.flngNameAddressHash.equals(that.flngNameAddressHash));
    equal = equal && (this.fstrSortKey == null ? that.fstrSortKey == null : this.fstrSortKey.equals(that.fstrSortKey));
    equal = equal && (this.fdtmSortDate == null ? that.fdtmSortDate == null : this.fdtmSortDate.equals(that.fdtmSortDate));
    equal = equal && (this.fintMailTypeSort == null ? that.fintMailTypeSort == null : this.fintMailTypeSort.equals(that.fintMailTypeSort));
    equal = equal && (this.fstrLanguage == null ? that.fstrLanguage == null : this.fstrLanguage.equals(that.fstrLanguage));
    equal = equal && (this.fstrAddressBlock == null ? that.fstrAddressBlock == null : this.fstrAddressBlock.equals(that.fstrAddressBlock));
    equal = equal && (this.fstrEmailTo == null ? that.fstrEmailTo == null : this.fstrEmailTo.equals(that.fstrEmailTo));
    equal = equal && (this.fstrName == null ? that.fstrName == null : this.fstrName.equals(that.fstrName));
    equal = equal && (this.fstrDLN == null ? that.fstrDLN == null : this.fstrDLN.equals(that.fstrDLN));
    equal = equal && (this.fstrCity == null ? that.fstrCity == null : this.fstrCity.equals(that.fstrCity));
    equal = equal && (this.fstrCountry == null ? that.fstrCountry == null : this.fstrCountry.equals(that.fstrCountry));
    equal = equal && (this.fstrZip == null ? that.fstrZip == null : this.fstrZip.equals(that.fstrZip));
    equal = equal && (this.fblnValidAddress == null ? that.fblnValidAddress == null : this.fblnValidAddress.equals(that.fblnValidAddress));
    equal = equal && (this.fdtmCreated == null ? that.fdtmCreated == null : this.fdtmCreated.equals(that.fdtmCreated));
    equal = equal && (this.fstrCreatedWho == null ? that.fstrCreatedWho == null : this.fstrCreatedWho.equals(that.fstrCreatedWho));
    equal = equal && (this.fdtmBatched == null ? that.fdtmBatched == null : this.fdtmBatched.equals(that.fdtmBatched));
    equal = equal && (this.fdtmPrinted == null ? that.fdtmPrinted == null : this.fdtmPrinted.equals(that.fdtmPrinted));
    equal = equal && (this.fstrPrintedWho == null ? that.fstrPrintedWho == null : this.fstrPrintedWho.equals(that.fstrPrintedWho));
    equal = equal && (this.fstrPrinter == null ? that.fstrPrinter == null : this.fstrPrinter.equals(that.fstrPrinter));
    equal = equal && (this.fdtmRePrinted == null ? that.fdtmRePrinted == null : this.fdtmRePrinted.equals(that.fdtmRePrinted));
    equal = equal && (this.fstrReprintedWho == null ? that.fstrReprintedWho == null : this.fstrReprintedWho.equals(that.fstrReprintedWho));
    equal = equal && (this.fstrRePrintPrinter == null ? that.fstrRePrintPrinter == null : this.fstrRePrintPrinter.equals(that.fstrRePrintPrinter));
    equal = equal && (this.fdtmReady == null ? that.fdtmReady == null : this.fdtmReady.equals(that.fdtmReady));
    equal = equal && (this.fstrReadyWho == null ? that.fstrReadyWho == null : this.fstrReadyWho.equals(that.fstrReadyWho));
    equal = equal && (this.fdtmEmailedOn == null ? that.fdtmEmailedOn == null : this.fdtmEmailedOn.equals(that.fdtmEmailedOn));
    equal = equal && (this.flngPrintGroupKey == null ? that.flngPrintGroupKey == null : this.flngPrintGroupKey.equals(that.flngPrintGroupKey));
    equal = equal && (this.fblnValid == null ? that.fblnValid == null : this.fblnValid.equals(that.fblnValid));
    equal = equal && (this.fstrValidatedWho == null ? that.fstrValidatedWho == null : this.fstrValidatedWho.equals(that.fstrValidatedWho));
    equal = equal && (this.fdtmValidatedWhen == null ? that.fdtmValidatedWhen == null : this.fdtmValidatedWhen.equals(that.fdtmValidatedWhen));
    equal = equal && (this.fblnElectronicOnly == null ? that.fblnElectronicOnly == null : this.fblnElectronicOnly.equals(that.fblnElectronicOnly));
    equal = equal && (this.fstrRenderType == null ? that.fstrRenderType == null : this.fstrRenderType.equals(that.fstrRenderType));
    equal = equal && (this.fstrDatabase == null ? that.fstrDatabase == null : this.fstrDatabase.equals(that.fstrDatabase));
    equal = equal && (this.flngImageKey == null ? that.flngImageKey == null : this.flngImageKey.equals(that.flngImageKey));
    equal = equal && (this.fblnLock == null ? that.fblnLock == null : this.fblnLock.equals(that.fblnLock));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngMailItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngTemplateKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrRecipientKey = JdbcWritableBridge.readString(6, __dbResults);
    this.flngNameAddressHash = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrSortKey = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmSortDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fintMailTypeSort = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrLanguage = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrAddressBlock = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrEmailTo = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnValidAddress = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrCreatedWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmBatched = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fdtmPrinted = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrPrintedWho = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPrinter = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmRePrinted = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fstrReprintedWho = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrRePrintPrinter = JdbcWritableBridge.readString(28, __dbResults);
    this.fdtmReady = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrReadyWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmEmailedOn = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.flngPrintGroupKey = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrValidatedWho = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmValidatedWhen = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fblnElectronicOnly = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrRenderType = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrDatabase = JdbcWritableBridge.readString(38, __dbResults);
    this.flngImageKey = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnLock = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(41, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(42, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngMailItemKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngTemplateKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngCRMKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrRecipientKey = JdbcWritableBridge.readString(6, __dbResults);
    this.flngNameAddressHash = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fstrSortKey = JdbcWritableBridge.readString(8, __dbResults);
    this.fdtmSortDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.fintMailTypeSort = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrLanguage = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrAddressBlock = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrEmailTo = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrName = JdbcWritableBridge.readString(14, __dbResults);
    this.fstrDLN = JdbcWritableBridge.readString(15, __dbResults);
    this.fstrCity = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrCountry = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrZip = JdbcWritableBridge.readString(18, __dbResults);
    this.fblnValidAddress = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fdtmCreated = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrCreatedWho = JdbcWritableBridge.readString(21, __dbResults);
    this.fdtmBatched = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.fdtmPrinted = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.fstrPrintedWho = JdbcWritableBridge.readString(24, __dbResults);
    this.fstrPrinter = JdbcWritableBridge.readString(25, __dbResults);
    this.fdtmRePrinted = JdbcWritableBridge.readTimestamp(26, __dbResults);
    this.fstrReprintedWho = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrRePrintPrinter = JdbcWritableBridge.readString(28, __dbResults);
    this.fdtmReady = JdbcWritableBridge.readTimestamp(29, __dbResults);
    this.fstrReadyWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmEmailedOn = JdbcWritableBridge.readTimestamp(31, __dbResults);
    this.flngPrintGroupKey = JdbcWritableBridge.readInteger(32, __dbResults);
    this.fblnValid = JdbcWritableBridge.readInteger(33, __dbResults);
    this.fstrValidatedWho = JdbcWritableBridge.readString(34, __dbResults);
    this.fdtmValidatedWhen = JdbcWritableBridge.readTimestamp(35, __dbResults);
    this.fblnElectronicOnly = JdbcWritableBridge.readInteger(36, __dbResults);
    this.fstrRenderType = JdbcWritableBridge.readString(37, __dbResults);
    this.fstrDatabase = JdbcWritableBridge.readString(38, __dbResults);
    this.flngImageKey = JdbcWritableBridge.readInteger(39, __dbResults);
    this.fblnLock = JdbcWritableBridge.readInteger(40, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(41, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(42, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTemplateKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientKey, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNameAddressHash, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSortKey, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSortDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMailTypeSort, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrLanguage, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressBlock, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailTo, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValidAddress, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBatched, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPrinted, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrintedWho, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrinter, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRePrinted, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReprintedWho, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRePrintPrinter, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReady, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReadyWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmailedOn, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPrintGroupKey, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrValidatedWho, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmValidatedWhen, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicOnly, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRenderType, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDatabase, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngImageKey, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLock, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 42 + __off, 93, __dbStmt);
    return 42;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngMailItemKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTemplateKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCRMKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientKey, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNameAddressHash, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrSortKey, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSortDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMailTypeSort, 10 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(fstrLanguage, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAddressBlock, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailTo, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrName, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDLN, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCity, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrCountry, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrZip, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValidAddress, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCreated, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrCreatedWho, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmBatched, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPrinted, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrintedWho, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrinter, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRePrinted, 26 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReprintedWho, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRePrintPrinter, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReady, 29 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReadyWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmailedOn, 31 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPrintGroupKey, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnValid, 33 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrValidatedWho, 34 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmValidatedWhen, 35 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnElectronicOnly, 36 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRenderType, 37 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrDatabase, 38 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngImageKey, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnLock, 40 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 41 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 42 + __off, 93, __dbStmt);
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
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailTypeKey = null;
    } else {
    this.flngMailTypeKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngTemplateKey = null;
    } else {
    this.flngTemplateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCRMKey = null;
    } else {
    this.flngCRMKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientKey = null;
    } else {
    this.fstrRecipientKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngNameAddressHash = null;
    } else {
    this.flngNameAddressHash = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSortKey = null;
    } else {
    this.fstrSortKey = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSortDate = null;
    } else {
    this.fdtmSortDate = new Timestamp(__dataIn.readLong());
    this.fdtmSortDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintMailTypeSort = null;
    } else {
    this.fintMailTypeSort = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLanguage = null;
    } else {
    this.fstrLanguage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAddressBlock = null;
    } else {
    this.fstrAddressBlock = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailTo = null;
    } else {
    this.fstrEmailTo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrName = null;
    } else {
    this.fstrName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDLN = null;
    } else {
    this.fstrDLN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCity = null;
    } else {
    this.fstrCity = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCountry = null;
    } else {
    this.fstrCountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrZip = null;
    } else {
    this.fstrZip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValidAddress = null;
    } else {
    this.fblnValidAddress = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCreated = null;
    } else {
    this.fdtmCreated = new Timestamp(__dataIn.readLong());
    this.fdtmCreated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrCreatedWho = null;
    } else {
    this.fstrCreatedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmBatched = null;
    } else {
    this.fdtmBatched = new Timestamp(__dataIn.readLong());
    this.fdtmBatched.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmPrinted = null;
    } else {
    this.fdtmPrinted = new Timestamp(__dataIn.readLong());
    this.fdtmPrinted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrintedWho = null;
    } else {
    this.fstrPrintedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrinter = null;
    } else {
    this.fstrPrinter = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRePrinted = null;
    } else {
    this.fdtmRePrinted = new Timestamp(__dataIn.readLong());
    this.fdtmRePrinted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReprintedWho = null;
    } else {
    this.fstrReprintedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRePrintPrinter = null;
    } else {
    this.fstrRePrintPrinter = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReady = null;
    } else {
    this.fdtmReady = new Timestamp(__dataIn.readLong());
    this.fdtmReady.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReadyWho = null;
    } else {
    this.fstrReadyWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEmailedOn = null;
    } else {
    this.fdtmEmailedOn = new Timestamp(__dataIn.readLong());
    this.fdtmEmailedOn.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngPrintGroupKey = null;
    } else {
    this.flngPrintGroupKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnValid = null;
    } else {
    this.fblnValid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrValidatedWho = null;
    } else {
    this.fstrValidatedWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmValidatedWhen = null;
    } else {
    this.fdtmValidatedWhen = new Timestamp(__dataIn.readLong());
    this.fdtmValidatedWhen.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnElectronicOnly = null;
    } else {
    this.fblnElectronicOnly = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRenderType = null;
    } else {
    this.fstrRenderType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDatabase = null;
    } else {
    this.fstrDatabase = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngImageKey = null;
    } else {
    this.flngImageKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnLock = null;
    } else {
    this.fblnLock = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngMailTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailTypeKey);
    }
    if (null == this.flngTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateKey);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrRecipientKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientKey);
    }
    if (null == this.flngNameAddressHash) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNameAddressHash);
    }
    if (null == this.fstrSortKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSortKey);
    }
    if (null == this.fdtmSortDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSortDate.getTime());
    __dataOut.writeInt(this.fdtmSortDate.getNanos());
    }
    if (null == this.fintMailTypeSort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMailTypeSort);
    }
    if (null == this.fstrLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLanguage);
    }
    if (null == this.fstrAddressBlock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressBlock);
    }
    if (null == this.fstrEmailTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailTo);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fblnValidAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValidAddress);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedWho);
    }
    if (null == this.fdtmBatched) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBatched.getTime());
    __dataOut.writeInt(this.fdtmBatched.getNanos());
    }
    if (null == this.fdtmPrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPrinted.getTime());
    __dataOut.writeInt(this.fdtmPrinted.getNanos());
    }
    if (null == this.fstrPrintedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrintedWho);
    }
    if (null == this.fstrPrinter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrinter);
    }
    if (null == this.fdtmRePrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRePrinted.getTime());
    __dataOut.writeInt(this.fdtmRePrinted.getNanos());
    }
    if (null == this.fstrReprintedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReprintedWho);
    }
    if (null == this.fstrRePrintPrinter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRePrintPrinter);
    }
    if (null == this.fdtmReady) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReady.getTime());
    __dataOut.writeInt(this.fdtmReady.getNanos());
    }
    if (null == this.fstrReadyWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReadyWho);
    }
    if (null == this.fdtmEmailedOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmailedOn.getTime());
    __dataOut.writeInt(this.fdtmEmailedOn.getNanos());
    }
    if (null == this.flngPrintGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPrintGroupKey);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
    }
    if (null == this.fstrValidatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrValidatedWho);
    }
    if (null == this.fdtmValidatedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmValidatedWhen.getTime());
    __dataOut.writeInt(this.fdtmValidatedWhen.getNanos());
    }
    if (null == this.fblnElectronicOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronicOnly);
    }
    if (null == this.fstrRenderType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRenderType);
    }
    if (null == this.fstrDatabase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDatabase);
    }
    if (null == this.flngImageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngImageKey);
    }
    if (null == this.fblnLock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLock);
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
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngMailTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailTypeKey);
    }
    if (null == this.flngTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateKey);
    }
    if (null == this.flngCRMKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCRMKey);
    }
    if (null == this.fstrRecipientKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientKey);
    }
    if (null == this.flngNameAddressHash) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNameAddressHash);
    }
    if (null == this.fstrSortKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSortKey);
    }
    if (null == this.fdtmSortDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSortDate.getTime());
    __dataOut.writeInt(this.fdtmSortDate.getNanos());
    }
    if (null == this.fintMailTypeSort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMailTypeSort);
    }
    if (null == this.fstrLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLanguage);
    }
    if (null == this.fstrAddressBlock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAddressBlock);
    }
    if (null == this.fstrEmailTo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailTo);
    }
    if (null == this.fstrName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrName);
    }
    if (null == this.fstrDLN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDLN);
    }
    if (null == this.fstrCity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCity);
    }
    if (null == this.fstrCountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCountry);
    }
    if (null == this.fstrZip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrZip);
    }
    if (null == this.fblnValidAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValidAddress);
    }
    if (null == this.fdtmCreated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCreated.getTime());
    __dataOut.writeInt(this.fdtmCreated.getNanos());
    }
    if (null == this.fstrCreatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrCreatedWho);
    }
    if (null == this.fdtmBatched) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmBatched.getTime());
    __dataOut.writeInt(this.fdtmBatched.getNanos());
    }
    if (null == this.fdtmPrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPrinted.getTime());
    __dataOut.writeInt(this.fdtmPrinted.getNanos());
    }
    if (null == this.fstrPrintedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrintedWho);
    }
    if (null == this.fstrPrinter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrinter);
    }
    if (null == this.fdtmRePrinted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRePrinted.getTime());
    __dataOut.writeInt(this.fdtmRePrinted.getNanos());
    }
    if (null == this.fstrReprintedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReprintedWho);
    }
    if (null == this.fstrRePrintPrinter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRePrintPrinter);
    }
    if (null == this.fdtmReady) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReady.getTime());
    __dataOut.writeInt(this.fdtmReady.getNanos());
    }
    if (null == this.fstrReadyWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReadyWho);
    }
    if (null == this.fdtmEmailedOn) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmailedOn.getTime());
    __dataOut.writeInt(this.fdtmEmailedOn.getNanos());
    }
    if (null == this.flngPrintGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPrintGroupKey);
    }
    if (null == this.fblnValid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnValid);
    }
    if (null == this.fstrValidatedWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrValidatedWho);
    }
    if (null == this.fdtmValidatedWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmValidatedWhen.getTime());
    __dataOut.writeInt(this.fdtmValidatedWhen.getNanos());
    }
    if (null == this.fblnElectronicOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnElectronicOnly);
    }
    if (null == this.fstrRenderType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRenderType);
    }
    if (null == this.fstrDatabase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDatabase);
    }
    if (null == this.flngImageKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngImageKey);
    }
    if (null == this.fblnLock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnLock);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateKey==null?"\\N":"" + flngTemplateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientKey==null?"\\N":fstrRecipientKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNameAddressHash==null?"\\N":"" + flngNameAddressHash, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSortKey==null?"\\N":fstrSortKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSortDate==null?"\\N":"" + fdtmSortDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMailTypeSort==null?"\\N":"" + fintMailTypeSort, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLanguage==null?"\\N":fstrLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressBlock==null?"\\N":fstrAddressBlock, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailTo==null?"\\N":fstrEmailTo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValidAddress==null?"\\N":"" + fblnValidAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedWho==null?"\\N":fstrCreatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBatched==null?"\\N":"" + fdtmBatched, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPrinted==null?"\\N":"" + fdtmPrinted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrintedWho==null?"\\N":fstrPrintedWho, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrinter==null?"\\N":fstrPrinter, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRePrinted==null?"\\N":"" + fdtmRePrinted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReprintedWho==null?"\\N":fstrReprintedWho, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRePrintPrinter==null?"\\N":fstrRePrintPrinter, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReady==null?"\\N":"" + fdtmReady, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReadyWho==null?"\\N":fstrReadyWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmailedOn==null?"\\N":"" + fdtmEmailedOn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPrintGroupKey==null?"\\N":"" + flngPrintGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrValidatedWho==null?"\\N":fstrValidatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmValidatedWhen==null?"\\N":"" + fdtmValidatedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronicOnly==null?"\\N":"" + fblnElectronicOnly, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRenderType==null?"\\N":fstrRenderType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDatabase==null?"\\N":fstrDatabase, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngImageKey==null?"\\N":"" + flngImageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLock==null?"\\N":"" + fblnLock, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateKey==null?"\\N":"" + flngTemplateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCRMKey==null?"\\N":"" + flngCRMKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientKey==null?"\\N":fstrRecipientKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNameAddressHash==null?"\\N":"" + flngNameAddressHash, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSortKey==null?"\\N":fstrSortKey, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSortDate==null?"\\N":"" + fdtmSortDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMailTypeSort==null?"\\N":"" + fintMailTypeSort, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLanguage==null?"\\N":fstrLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAddressBlock==null?"\\N":fstrAddressBlock, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailTo==null?"\\N":fstrEmailTo, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrName==null?"\\N":fstrName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDLN==null?"\\N":fstrDLN, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCity==null?"\\N":fstrCity, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCountry==null?"\\N":fstrCountry, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrZip==null?"\\N":fstrZip, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValidAddress==null?"\\N":"" + fblnValidAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCreated==null?"\\N":"" + fdtmCreated, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrCreatedWho==null?"\\N":fstrCreatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmBatched==null?"\\N":"" + fdtmBatched, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPrinted==null?"\\N":"" + fdtmPrinted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrintedWho==null?"\\N":fstrPrintedWho, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrinter==null?"\\N":fstrPrinter, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRePrinted==null?"\\N":"" + fdtmRePrinted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReprintedWho==null?"\\N":fstrReprintedWho, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRePrintPrinter==null?"\\N":fstrRePrintPrinter, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReady==null?"\\N":"" + fdtmReady, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReadyWho==null?"\\N":fstrReadyWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmailedOn==null?"\\N":"" + fdtmEmailedOn, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPrintGroupKey==null?"\\N":"" + flngPrintGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnValid==null?"\\N":"" + fblnValid, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrValidatedWho==null?"\\N":fstrValidatedWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmValidatedWhen==null?"\\N":"" + fdtmValidatedWhen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnElectronicOnly==null?"\\N":"" + fblnElectronicOnly, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRenderType==null?"\\N":fstrRenderType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDatabase==null?"\\N":fstrDatabase, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngImageKey==null?"\\N":"" + flngImageKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnLock==null?"\\N":"" + fblnLock, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateKey = null; } else {
      this.flngTemplateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientKey = null; } else {
      this.fstrRecipientKey = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrSortKey = null; } else {
      this.fstrSortKey = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSortDate = null; } else {
      this.fdtmSortDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMailTypeSort = null; } else {
      this.fintMailTypeSort = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLanguage = null; } else {
      this.fstrLanguage = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrEmailTo = null; } else {
      this.fstrEmailTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValidAddress = null; } else {
      this.fblnValidAddress = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreatedWho = null; } else {
      this.fstrCreatedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBatched = null; } else {
      this.fdtmBatched = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPrinted = null; } else {
      this.fdtmPrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrintedWho = null; } else {
      this.fstrPrintedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrinter = null; } else {
      this.fstrPrinter = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRePrinted = null; } else {
      this.fdtmRePrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReprintedWho = null; } else {
      this.fstrReprintedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRePrintPrinter = null; } else {
      this.fstrRePrintPrinter = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReady = null; } else {
      this.fdtmReady = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReadyWho = null; } else {
      this.fstrReadyWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmailedOn = null; } else {
      this.fdtmEmailedOn = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPrintGroupKey = null; } else {
      this.flngPrintGroupKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrValidatedWho = null; } else {
      this.fstrValidatedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmValidatedWhen = null; } else {
      this.fdtmValidatedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronicOnly = null; } else {
      this.fblnElectronicOnly = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRenderType = null; } else {
      this.fstrRenderType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDatabase = null; } else {
      this.fstrDatabase = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngImageKey = null; } else {
      this.flngImageKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLock = null; } else {
      this.fblnLock = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateKey = null; } else {
      this.flngTemplateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCRMKey = null; } else {
      this.flngCRMKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientKey = null; } else {
      this.fstrRecipientKey = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrSortKey = null; } else {
      this.fstrSortKey = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSortDate = null; } else {
      this.fdtmSortDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintMailTypeSort = null; } else {
      this.fintMailTypeSort = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLanguage = null; } else {
      this.fstrLanguage = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrEmailTo = null; } else {
      this.fstrEmailTo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrName = null; } else {
      this.fstrName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDLN = null; } else {
      this.fstrDLN = __cur_str;
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
    if (__cur_str.equals("null")) { this.fstrCountry = null; } else {
      this.fstrCountry = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrZip = null; } else {
      this.fstrZip = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValidAddress = null; } else {
      this.fblnValidAddress = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCreated = null; } else {
      this.fdtmCreated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrCreatedWho = null; } else {
      this.fstrCreatedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmBatched = null; } else {
      this.fdtmBatched = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPrinted = null; } else {
      this.fdtmPrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrintedWho = null; } else {
      this.fstrPrintedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrinter = null; } else {
      this.fstrPrinter = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRePrinted = null; } else {
      this.fdtmRePrinted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReprintedWho = null; } else {
      this.fstrReprintedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRePrintPrinter = null; } else {
      this.fstrRePrintPrinter = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmReady = null; } else {
      this.fdtmReady = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrReadyWho = null; } else {
      this.fstrReadyWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmailedOn = null; } else {
      this.fdtmEmailedOn = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPrintGroupKey = null; } else {
      this.flngPrintGroupKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnValid = null; } else {
      this.fblnValid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrValidatedWho = null; } else {
      this.fstrValidatedWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmValidatedWhen = null; } else {
      this.fdtmValidatedWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnElectronicOnly = null; } else {
      this.fblnElectronicOnly = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRenderType = null; } else {
      this.fstrRenderType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDatabase = null; } else {
      this.fstrDatabase = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngImageKey = null; } else {
      this.flngImageKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnLock = null; } else {
      this.fblnLock = Integer.valueOf(__cur_str);
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
    tblmailitem o = (tblmailitem) super.clone();
    o.fdtmSortDate = (o.fdtmSortDate != null) ? (java.sql.Timestamp) o.fdtmSortDate.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmBatched = (o.fdtmBatched != null) ? (java.sql.Timestamp) o.fdtmBatched.clone() : null;
    o.fdtmPrinted = (o.fdtmPrinted != null) ? (java.sql.Timestamp) o.fdtmPrinted.clone() : null;
    o.fdtmRePrinted = (o.fdtmRePrinted != null) ? (java.sql.Timestamp) o.fdtmRePrinted.clone() : null;
    o.fdtmReady = (o.fdtmReady != null) ? (java.sql.Timestamp) o.fdtmReady.clone() : null;
    o.fdtmEmailedOn = (o.fdtmEmailedOn != null) ? (java.sql.Timestamp) o.fdtmEmailedOn.clone() : null;
    o.fdtmValidatedWhen = (o.fdtmValidatedWhen != null) ? (java.sql.Timestamp) o.fdtmValidatedWhen.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblmailitem o) throws CloneNotSupportedException {
    o.fdtmSortDate = (o.fdtmSortDate != null) ? (java.sql.Timestamp) o.fdtmSortDate.clone() : null;
    o.fdtmCreated = (o.fdtmCreated != null) ? (java.sql.Timestamp) o.fdtmCreated.clone() : null;
    o.fdtmBatched = (o.fdtmBatched != null) ? (java.sql.Timestamp) o.fdtmBatched.clone() : null;
    o.fdtmPrinted = (o.fdtmPrinted != null) ? (java.sql.Timestamp) o.fdtmPrinted.clone() : null;
    o.fdtmRePrinted = (o.fdtmRePrinted != null) ? (java.sql.Timestamp) o.fdtmRePrinted.clone() : null;
    o.fdtmReady = (o.fdtmReady != null) ? (java.sql.Timestamp) o.fdtmReady.clone() : null;
    o.fdtmEmailedOn = (o.fdtmEmailedOn != null) ? (java.sql.Timestamp) o.fdtmEmailedOn.clone() : null;
    o.fdtmValidatedWhen = (o.fdtmValidatedWhen != null) ? (java.sql.Timestamp) o.fdtmValidatedWhen.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngTemplateKey", this.flngTemplateKey);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrRecipientKey", this.fstrRecipientKey);
    __sqoop$field_map.put("flngNameAddressHash", this.flngNameAddressHash);
    __sqoop$field_map.put("fstrSortKey", this.fstrSortKey);
    __sqoop$field_map.put("fdtmSortDate", this.fdtmSortDate);
    __sqoop$field_map.put("fintMailTypeSort", this.fintMailTypeSort);
    __sqoop$field_map.put("fstrLanguage", this.fstrLanguage);
    __sqoop$field_map.put("fstrAddressBlock", this.fstrAddressBlock);
    __sqoop$field_map.put("fstrEmailTo", this.fstrEmailTo);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fblnValidAddress", this.fblnValidAddress);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedWho", this.fstrCreatedWho);
    __sqoop$field_map.put("fdtmBatched", this.fdtmBatched);
    __sqoop$field_map.put("fdtmPrinted", this.fdtmPrinted);
    __sqoop$field_map.put("fstrPrintedWho", this.fstrPrintedWho);
    __sqoop$field_map.put("fstrPrinter", this.fstrPrinter);
    __sqoop$field_map.put("fdtmRePrinted", this.fdtmRePrinted);
    __sqoop$field_map.put("fstrReprintedWho", this.fstrReprintedWho);
    __sqoop$field_map.put("fstrRePrintPrinter", this.fstrRePrintPrinter);
    __sqoop$field_map.put("fdtmReady", this.fdtmReady);
    __sqoop$field_map.put("fstrReadyWho", this.fstrReadyWho);
    __sqoop$field_map.put("fdtmEmailedOn", this.fdtmEmailedOn);
    __sqoop$field_map.put("flngPrintGroupKey", this.flngPrintGroupKey);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fstrValidatedWho", this.fstrValidatedWho);
    __sqoop$field_map.put("fdtmValidatedWhen", this.fdtmValidatedWhen);
    __sqoop$field_map.put("fblnElectronicOnly", this.fblnElectronicOnly);
    __sqoop$field_map.put("fstrRenderType", this.fstrRenderType);
    __sqoop$field_map.put("fstrDatabase", this.fstrDatabase);
    __sqoop$field_map.put("flngImageKey", this.flngImageKey);
    __sqoop$field_map.put("fblnLock", this.fblnLock);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngMailItemKey", this.flngMailItemKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngTemplateKey", this.flngTemplateKey);
    __sqoop$field_map.put("flngCRMKey", this.flngCRMKey);
    __sqoop$field_map.put("fstrRecipientKey", this.fstrRecipientKey);
    __sqoop$field_map.put("flngNameAddressHash", this.flngNameAddressHash);
    __sqoop$field_map.put("fstrSortKey", this.fstrSortKey);
    __sqoop$field_map.put("fdtmSortDate", this.fdtmSortDate);
    __sqoop$field_map.put("fintMailTypeSort", this.fintMailTypeSort);
    __sqoop$field_map.put("fstrLanguage", this.fstrLanguage);
    __sqoop$field_map.put("fstrAddressBlock", this.fstrAddressBlock);
    __sqoop$field_map.put("fstrEmailTo", this.fstrEmailTo);
    __sqoop$field_map.put("fstrName", this.fstrName);
    __sqoop$field_map.put("fstrDLN", this.fstrDLN);
    __sqoop$field_map.put("fstrCity", this.fstrCity);
    __sqoop$field_map.put("fstrCountry", this.fstrCountry);
    __sqoop$field_map.put("fstrZip", this.fstrZip);
    __sqoop$field_map.put("fblnValidAddress", this.fblnValidAddress);
    __sqoop$field_map.put("fdtmCreated", this.fdtmCreated);
    __sqoop$field_map.put("fstrCreatedWho", this.fstrCreatedWho);
    __sqoop$field_map.put("fdtmBatched", this.fdtmBatched);
    __sqoop$field_map.put("fdtmPrinted", this.fdtmPrinted);
    __sqoop$field_map.put("fstrPrintedWho", this.fstrPrintedWho);
    __sqoop$field_map.put("fstrPrinter", this.fstrPrinter);
    __sqoop$field_map.put("fdtmRePrinted", this.fdtmRePrinted);
    __sqoop$field_map.put("fstrReprintedWho", this.fstrReprintedWho);
    __sqoop$field_map.put("fstrRePrintPrinter", this.fstrRePrintPrinter);
    __sqoop$field_map.put("fdtmReady", this.fdtmReady);
    __sqoop$field_map.put("fstrReadyWho", this.fstrReadyWho);
    __sqoop$field_map.put("fdtmEmailedOn", this.fdtmEmailedOn);
    __sqoop$field_map.put("flngPrintGroupKey", this.flngPrintGroupKey);
    __sqoop$field_map.put("fblnValid", this.fblnValid);
    __sqoop$field_map.put("fstrValidatedWho", this.fstrValidatedWho);
    __sqoop$field_map.put("fdtmValidatedWhen", this.fdtmValidatedWhen);
    __sqoop$field_map.put("fblnElectronicOnly", this.fblnElectronicOnly);
    __sqoop$field_map.put("fstrRenderType", this.fstrRenderType);
    __sqoop$field_map.put("fstrDatabase", this.fstrDatabase);
    __sqoop$field_map.put("flngImageKey", this.flngImageKey);
    __sqoop$field_map.put("fblnLock", this.fblnLock);
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
