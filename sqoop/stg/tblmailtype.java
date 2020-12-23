// ORM class for table 'tblmailtype'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:25:47 NZDT 2020
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

public class tblmailtype extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngMailTypeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngMailTypeKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngVerRI", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngVerRI = (Integer)value;
      }
    });
    setters.put("flngFunction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngFunction = (Integer)value;
      }
    });
    setters.put("fstrMailType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrMailType = (String)value;
      }
    });
    setters.put("fstrMailTypeConfig", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrMailTypeConfig = (String)value;
      }
    });
    setters.put("fstrTitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrTitle = (String)value;
      }
    });
    setters.put("fstrMailItemSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrMailItemSource = (String)value;
      }
    });
    setters.put("fstrExternalIdentifier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrExternalIdentifier = (String)value;
      }
    });
    setters.put("flngMailCategoryKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngMailCategoryKey = (Integer)value;
      }
    });
    setters.put("flngCurrentTemplateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngCurrentTemplateKey = (Integer)value;
      }
    });
    setters.put("flngMaxTemplateVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngMaxTemplateVer = (Integer)value;
      }
    });
    setters.put("fblnCanAddManually", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnCanAddManually = (Integer)value;
      }
    });
    setters.put("fblnCanPrintManually", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnCanPrintManually = (Integer)value;
      }
    });
    setters.put("fblnMarkAsReady", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnMarkAsReady = (Integer)value;
      }
    });
    setters.put("flngChangeCounter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngChangeCounter = (Integer)value;
      }
    });
    setters.put("fblnDevelopmentOnly", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnDevelopmentOnly = (Integer)value;
      }
    });
    setters.put("fintMailTypeSort", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fintMailTypeSort = (Integer)value;
      }
    });
    setters.put("fblnVerifyData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnVerifyData = (Integer)value;
      }
    });
    setters.put("fstrVerifyFields", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrVerifyFields = (String)value;
      }
    });
    setters.put("fintSimplexAfterPage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fintSimplexAfterPage = (Integer)value;
      }
    });
    setters.put("fblnSpecifiedMCLOnly", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnSpecifiedMCLOnly = (Integer)value;
      }
    });
    setters.put("fblnPublishTAP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnPublishTAP = (Integer)value;
      }
    });
    setters.put("fstrEmailOption", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrEmailOption = (String)value;
      }
    });
    setters.put("fblnAlwaysPrint", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnAlwaysPrint = (Integer)value;
      }
    });
    setters.put("fstrRedactionImgCategory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrRedactionImgCategory = (String)value;
      }
    });
    setters.put("fstrRedactionImgType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrRedactionImgType = (String)value;
      }
    });
    setters.put("flngReadyFunctionNumber", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.flngReadyFunctionNumber = (Integer)value;
      }
    });
    setters.put("fblnAllowAttachments", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnAllowAttachments = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtype.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblmailtype() {
    init0();
  }
  private Integer flngMailTypeKey;
  public Integer get_flngMailTypeKey() {
    return flngMailTypeKey;
  }
  public void set_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
  }
  public tblmailtype with_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblmailtype with_flngVer(Integer flngVer) {
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
  public tblmailtype with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngVerRI;
  public Integer get_flngVerRI() {
    return flngVerRI;
  }
  public void set_flngVerRI(Integer flngVerRI) {
    this.flngVerRI = flngVerRI;
  }
  public tblmailtype with_flngVerRI(Integer flngVerRI) {
    this.flngVerRI = flngVerRI;
    return this;
  }
  private Integer flngFunction;
  public Integer get_flngFunction() {
    return flngFunction;
  }
  public void set_flngFunction(Integer flngFunction) {
    this.flngFunction = flngFunction;
  }
  public tblmailtype with_flngFunction(Integer flngFunction) {
    this.flngFunction = flngFunction;
    return this;
  }
  private String fstrMailType;
  public String get_fstrMailType() {
    return fstrMailType;
  }
  public void set_fstrMailType(String fstrMailType) {
    this.fstrMailType = fstrMailType;
  }
  public tblmailtype with_fstrMailType(String fstrMailType) {
    this.fstrMailType = fstrMailType;
    return this;
  }
  private String fstrMailTypeConfig;
  public String get_fstrMailTypeConfig() {
    return fstrMailTypeConfig;
  }
  public void set_fstrMailTypeConfig(String fstrMailTypeConfig) {
    this.fstrMailTypeConfig = fstrMailTypeConfig;
  }
  public tblmailtype with_fstrMailTypeConfig(String fstrMailTypeConfig) {
    this.fstrMailTypeConfig = fstrMailTypeConfig;
    return this;
  }
  private String fstrTitle;
  public String get_fstrTitle() {
    return fstrTitle;
  }
  public void set_fstrTitle(String fstrTitle) {
    this.fstrTitle = fstrTitle;
  }
  public tblmailtype with_fstrTitle(String fstrTitle) {
    this.fstrTitle = fstrTitle;
    return this;
  }
  private String fstrMailItemSource;
  public String get_fstrMailItemSource() {
    return fstrMailItemSource;
  }
  public void set_fstrMailItemSource(String fstrMailItemSource) {
    this.fstrMailItemSource = fstrMailItemSource;
  }
  public tblmailtype with_fstrMailItemSource(String fstrMailItemSource) {
    this.fstrMailItemSource = fstrMailItemSource;
    return this;
  }
  private String fstrExternalIdentifier;
  public String get_fstrExternalIdentifier() {
    return fstrExternalIdentifier;
  }
  public void set_fstrExternalIdentifier(String fstrExternalIdentifier) {
    this.fstrExternalIdentifier = fstrExternalIdentifier;
  }
  public tblmailtype with_fstrExternalIdentifier(String fstrExternalIdentifier) {
    this.fstrExternalIdentifier = fstrExternalIdentifier;
    return this;
  }
  private Integer flngMailCategoryKey;
  public Integer get_flngMailCategoryKey() {
    return flngMailCategoryKey;
  }
  public void set_flngMailCategoryKey(Integer flngMailCategoryKey) {
    this.flngMailCategoryKey = flngMailCategoryKey;
  }
  public tblmailtype with_flngMailCategoryKey(Integer flngMailCategoryKey) {
    this.flngMailCategoryKey = flngMailCategoryKey;
    return this;
  }
  private Integer flngCurrentTemplateKey;
  public Integer get_flngCurrentTemplateKey() {
    return flngCurrentTemplateKey;
  }
  public void set_flngCurrentTemplateKey(Integer flngCurrentTemplateKey) {
    this.flngCurrentTemplateKey = flngCurrentTemplateKey;
  }
  public tblmailtype with_flngCurrentTemplateKey(Integer flngCurrentTemplateKey) {
    this.flngCurrentTemplateKey = flngCurrentTemplateKey;
    return this;
  }
  private Integer flngMaxTemplateVer;
  public Integer get_flngMaxTemplateVer() {
    return flngMaxTemplateVer;
  }
  public void set_flngMaxTemplateVer(Integer flngMaxTemplateVer) {
    this.flngMaxTemplateVer = flngMaxTemplateVer;
  }
  public tblmailtype with_flngMaxTemplateVer(Integer flngMaxTemplateVer) {
    this.flngMaxTemplateVer = flngMaxTemplateVer;
    return this;
  }
  private Integer fblnCanAddManually;
  public Integer get_fblnCanAddManually() {
    return fblnCanAddManually;
  }
  public void set_fblnCanAddManually(Integer fblnCanAddManually) {
    this.fblnCanAddManually = fblnCanAddManually;
  }
  public tblmailtype with_fblnCanAddManually(Integer fblnCanAddManually) {
    this.fblnCanAddManually = fblnCanAddManually;
    return this;
  }
  private Integer fblnCanPrintManually;
  public Integer get_fblnCanPrintManually() {
    return fblnCanPrintManually;
  }
  public void set_fblnCanPrintManually(Integer fblnCanPrintManually) {
    this.fblnCanPrintManually = fblnCanPrintManually;
  }
  public tblmailtype with_fblnCanPrintManually(Integer fblnCanPrintManually) {
    this.fblnCanPrintManually = fblnCanPrintManually;
    return this;
  }
  private Integer fblnMarkAsReady;
  public Integer get_fblnMarkAsReady() {
    return fblnMarkAsReady;
  }
  public void set_fblnMarkAsReady(Integer fblnMarkAsReady) {
    this.fblnMarkAsReady = fblnMarkAsReady;
  }
  public tblmailtype with_fblnMarkAsReady(Integer fblnMarkAsReady) {
    this.fblnMarkAsReady = fblnMarkAsReady;
    return this;
  }
  private Integer flngChangeCounter;
  public Integer get_flngChangeCounter() {
    return flngChangeCounter;
  }
  public void set_flngChangeCounter(Integer flngChangeCounter) {
    this.flngChangeCounter = flngChangeCounter;
  }
  public tblmailtype with_flngChangeCounter(Integer flngChangeCounter) {
    this.flngChangeCounter = flngChangeCounter;
    return this;
  }
  private Integer fblnDevelopmentOnly;
  public Integer get_fblnDevelopmentOnly() {
    return fblnDevelopmentOnly;
  }
  public void set_fblnDevelopmentOnly(Integer fblnDevelopmentOnly) {
    this.fblnDevelopmentOnly = fblnDevelopmentOnly;
  }
  public tblmailtype with_fblnDevelopmentOnly(Integer fblnDevelopmentOnly) {
    this.fblnDevelopmentOnly = fblnDevelopmentOnly;
    return this;
  }
  private Integer fintMailTypeSort;
  public Integer get_fintMailTypeSort() {
    return fintMailTypeSort;
  }
  public void set_fintMailTypeSort(Integer fintMailTypeSort) {
    this.fintMailTypeSort = fintMailTypeSort;
  }
  public tblmailtype with_fintMailTypeSort(Integer fintMailTypeSort) {
    this.fintMailTypeSort = fintMailTypeSort;
    return this;
  }
  private Integer fblnVerifyData;
  public Integer get_fblnVerifyData() {
    return fblnVerifyData;
  }
  public void set_fblnVerifyData(Integer fblnVerifyData) {
    this.fblnVerifyData = fblnVerifyData;
  }
  public tblmailtype with_fblnVerifyData(Integer fblnVerifyData) {
    this.fblnVerifyData = fblnVerifyData;
    return this;
  }
  private String fstrVerifyFields;
  public String get_fstrVerifyFields() {
    return fstrVerifyFields;
  }
  public void set_fstrVerifyFields(String fstrVerifyFields) {
    this.fstrVerifyFields = fstrVerifyFields;
  }
  public tblmailtype with_fstrVerifyFields(String fstrVerifyFields) {
    this.fstrVerifyFields = fstrVerifyFields;
    return this;
  }
  private Integer fintSimplexAfterPage;
  public Integer get_fintSimplexAfterPage() {
    return fintSimplexAfterPage;
  }
  public void set_fintSimplexAfterPage(Integer fintSimplexAfterPage) {
    this.fintSimplexAfterPage = fintSimplexAfterPage;
  }
  public tblmailtype with_fintSimplexAfterPage(Integer fintSimplexAfterPage) {
    this.fintSimplexAfterPage = fintSimplexAfterPage;
    return this;
  }
  private Integer fblnSpecifiedMCLOnly;
  public Integer get_fblnSpecifiedMCLOnly() {
    return fblnSpecifiedMCLOnly;
  }
  public void set_fblnSpecifiedMCLOnly(Integer fblnSpecifiedMCLOnly) {
    this.fblnSpecifiedMCLOnly = fblnSpecifiedMCLOnly;
  }
  public tblmailtype with_fblnSpecifiedMCLOnly(Integer fblnSpecifiedMCLOnly) {
    this.fblnSpecifiedMCLOnly = fblnSpecifiedMCLOnly;
    return this;
  }
  private Integer fblnPublishTAP;
  public Integer get_fblnPublishTAP() {
    return fblnPublishTAP;
  }
  public void set_fblnPublishTAP(Integer fblnPublishTAP) {
    this.fblnPublishTAP = fblnPublishTAP;
  }
  public tblmailtype with_fblnPublishTAP(Integer fblnPublishTAP) {
    this.fblnPublishTAP = fblnPublishTAP;
    return this;
  }
  private String fstrEmailOption;
  public String get_fstrEmailOption() {
    return fstrEmailOption;
  }
  public void set_fstrEmailOption(String fstrEmailOption) {
    this.fstrEmailOption = fstrEmailOption;
  }
  public tblmailtype with_fstrEmailOption(String fstrEmailOption) {
    this.fstrEmailOption = fstrEmailOption;
    return this;
  }
  private Integer fblnAlwaysPrint;
  public Integer get_fblnAlwaysPrint() {
    return fblnAlwaysPrint;
  }
  public void set_fblnAlwaysPrint(Integer fblnAlwaysPrint) {
    this.fblnAlwaysPrint = fblnAlwaysPrint;
  }
  public tblmailtype with_fblnAlwaysPrint(Integer fblnAlwaysPrint) {
    this.fblnAlwaysPrint = fblnAlwaysPrint;
    return this;
  }
  private String fstrRedactionImgCategory;
  public String get_fstrRedactionImgCategory() {
    return fstrRedactionImgCategory;
  }
  public void set_fstrRedactionImgCategory(String fstrRedactionImgCategory) {
    this.fstrRedactionImgCategory = fstrRedactionImgCategory;
  }
  public tblmailtype with_fstrRedactionImgCategory(String fstrRedactionImgCategory) {
    this.fstrRedactionImgCategory = fstrRedactionImgCategory;
    return this;
  }
  private String fstrRedactionImgType;
  public String get_fstrRedactionImgType() {
    return fstrRedactionImgType;
  }
  public void set_fstrRedactionImgType(String fstrRedactionImgType) {
    this.fstrRedactionImgType = fstrRedactionImgType;
  }
  public tblmailtype with_fstrRedactionImgType(String fstrRedactionImgType) {
    this.fstrRedactionImgType = fstrRedactionImgType;
    return this;
  }
  private Integer flngReadyFunctionNumber;
  public Integer get_flngReadyFunctionNumber() {
    return flngReadyFunctionNumber;
  }
  public void set_flngReadyFunctionNumber(Integer flngReadyFunctionNumber) {
    this.flngReadyFunctionNumber = flngReadyFunctionNumber;
  }
  public tblmailtype with_flngReadyFunctionNumber(Integer flngReadyFunctionNumber) {
    this.flngReadyFunctionNumber = flngReadyFunctionNumber;
    return this;
  }
  private Integer fblnAllowAttachments;
  public Integer get_fblnAllowAttachments() {
    return fblnAllowAttachments;
  }
  public void set_fblnAllowAttachments(Integer fblnAllowAttachments) {
    this.fblnAllowAttachments = fblnAllowAttachments;
  }
  public tblmailtype with_fblnAllowAttachments(Integer fblnAllowAttachments) {
    this.fblnAllowAttachments = fblnAllowAttachments;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblmailtype with_fblnActive(Integer fblnActive) {
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
  public tblmailtype with_fstrWho(String fstrWho) {
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
  public tblmailtype with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailtype)) {
      return false;
    }
    tblmailtype that = (tblmailtype) o;
    boolean equal = true;
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngVerRI == null ? that.flngVerRI == null : this.flngVerRI.equals(that.flngVerRI));
    equal = equal && (this.flngFunction == null ? that.flngFunction == null : this.flngFunction.equals(that.flngFunction));
    equal = equal && (this.fstrMailType == null ? that.fstrMailType == null : this.fstrMailType.equals(that.fstrMailType));
    equal = equal && (this.fstrMailTypeConfig == null ? that.fstrMailTypeConfig == null : this.fstrMailTypeConfig.equals(that.fstrMailTypeConfig));
    equal = equal && (this.fstrTitle == null ? that.fstrTitle == null : this.fstrTitle.equals(that.fstrTitle));
    equal = equal && (this.fstrMailItemSource == null ? that.fstrMailItemSource == null : this.fstrMailItemSource.equals(that.fstrMailItemSource));
    equal = equal && (this.fstrExternalIdentifier == null ? that.fstrExternalIdentifier == null : this.fstrExternalIdentifier.equals(that.fstrExternalIdentifier));
    equal = equal && (this.flngMailCategoryKey == null ? that.flngMailCategoryKey == null : this.flngMailCategoryKey.equals(that.flngMailCategoryKey));
    equal = equal && (this.flngCurrentTemplateKey == null ? that.flngCurrentTemplateKey == null : this.flngCurrentTemplateKey.equals(that.flngCurrentTemplateKey));
    equal = equal && (this.flngMaxTemplateVer == null ? that.flngMaxTemplateVer == null : this.flngMaxTemplateVer.equals(that.flngMaxTemplateVer));
    equal = equal && (this.fblnCanAddManually == null ? that.fblnCanAddManually == null : this.fblnCanAddManually.equals(that.fblnCanAddManually));
    equal = equal && (this.fblnCanPrintManually == null ? that.fblnCanPrintManually == null : this.fblnCanPrintManually.equals(that.fblnCanPrintManually));
    equal = equal && (this.fblnMarkAsReady == null ? that.fblnMarkAsReady == null : this.fblnMarkAsReady.equals(that.fblnMarkAsReady));
    equal = equal && (this.flngChangeCounter == null ? that.flngChangeCounter == null : this.flngChangeCounter.equals(that.flngChangeCounter));
    equal = equal && (this.fblnDevelopmentOnly == null ? that.fblnDevelopmentOnly == null : this.fblnDevelopmentOnly.equals(that.fblnDevelopmentOnly));
    equal = equal && (this.fintMailTypeSort == null ? that.fintMailTypeSort == null : this.fintMailTypeSort.equals(that.fintMailTypeSort));
    equal = equal && (this.fblnVerifyData == null ? that.fblnVerifyData == null : this.fblnVerifyData.equals(that.fblnVerifyData));
    equal = equal && (this.fstrVerifyFields == null ? that.fstrVerifyFields == null : this.fstrVerifyFields.equals(that.fstrVerifyFields));
    equal = equal && (this.fintSimplexAfterPage == null ? that.fintSimplexAfterPage == null : this.fintSimplexAfterPage.equals(that.fintSimplexAfterPage));
    equal = equal && (this.fblnSpecifiedMCLOnly == null ? that.fblnSpecifiedMCLOnly == null : this.fblnSpecifiedMCLOnly.equals(that.fblnSpecifiedMCLOnly));
    equal = equal && (this.fblnPublishTAP == null ? that.fblnPublishTAP == null : this.fblnPublishTAP.equals(that.fblnPublishTAP));
    equal = equal && (this.fstrEmailOption == null ? that.fstrEmailOption == null : this.fstrEmailOption.equals(that.fstrEmailOption));
    equal = equal && (this.fblnAlwaysPrint == null ? that.fblnAlwaysPrint == null : this.fblnAlwaysPrint.equals(that.fblnAlwaysPrint));
    equal = equal && (this.fstrRedactionImgCategory == null ? that.fstrRedactionImgCategory == null : this.fstrRedactionImgCategory.equals(that.fstrRedactionImgCategory));
    equal = equal && (this.fstrRedactionImgType == null ? that.fstrRedactionImgType == null : this.fstrRedactionImgType.equals(that.fstrRedactionImgType));
    equal = equal && (this.flngReadyFunctionNumber == null ? that.flngReadyFunctionNumber == null : this.flngReadyFunctionNumber.equals(that.flngReadyFunctionNumber));
    equal = equal && (this.fblnAllowAttachments == null ? that.fblnAllowAttachments == null : this.fblnAllowAttachments.equals(that.fblnAllowAttachments));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailtype)) {
      return false;
    }
    tblmailtype that = (tblmailtype) o;
    boolean equal = true;
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngVerRI == null ? that.flngVerRI == null : this.flngVerRI.equals(that.flngVerRI));
    equal = equal && (this.flngFunction == null ? that.flngFunction == null : this.flngFunction.equals(that.flngFunction));
    equal = equal && (this.fstrMailType == null ? that.fstrMailType == null : this.fstrMailType.equals(that.fstrMailType));
    equal = equal && (this.fstrMailTypeConfig == null ? that.fstrMailTypeConfig == null : this.fstrMailTypeConfig.equals(that.fstrMailTypeConfig));
    equal = equal && (this.fstrTitle == null ? that.fstrTitle == null : this.fstrTitle.equals(that.fstrTitle));
    equal = equal && (this.fstrMailItemSource == null ? that.fstrMailItemSource == null : this.fstrMailItemSource.equals(that.fstrMailItemSource));
    equal = equal && (this.fstrExternalIdentifier == null ? that.fstrExternalIdentifier == null : this.fstrExternalIdentifier.equals(that.fstrExternalIdentifier));
    equal = equal && (this.flngMailCategoryKey == null ? that.flngMailCategoryKey == null : this.flngMailCategoryKey.equals(that.flngMailCategoryKey));
    equal = equal && (this.flngCurrentTemplateKey == null ? that.flngCurrentTemplateKey == null : this.flngCurrentTemplateKey.equals(that.flngCurrentTemplateKey));
    equal = equal && (this.flngMaxTemplateVer == null ? that.flngMaxTemplateVer == null : this.flngMaxTemplateVer.equals(that.flngMaxTemplateVer));
    equal = equal && (this.fblnCanAddManually == null ? that.fblnCanAddManually == null : this.fblnCanAddManually.equals(that.fblnCanAddManually));
    equal = equal && (this.fblnCanPrintManually == null ? that.fblnCanPrintManually == null : this.fblnCanPrintManually.equals(that.fblnCanPrintManually));
    equal = equal && (this.fblnMarkAsReady == null ? that.fblnMarkAsReady == null : this.fblnMarkAsReady.equals(that.fblnMarkAsReady));
    equal = equal && (this.flngChangeCounter == null ? that.flngChangeCounter == null : this.flngChangeCounter.equals(that.flngChangeCounter));
    equal = equal && (this.fblnDevelopmentOnly == null ? that.fblnDevelopmentOnly == null : this.fblnDevelopmentOnly.equals(that.fblnDevelopmentOnly));
    equal = equal && (this.fintMailTypeSort == null ? that.fintMailTypeSort == null : this.fintMailTypeSort.equals(that.fintMailTypeSort));
    equal = equal && (this.fblnVerifyData == null ? that.fblnVerifyData == null : this.fblnVerifyData.equals(that.fblnVerifyData));
    equal = equal && (this.fstrVerifyFields == null ? that.fstrVerifyFields == null : this.fstrVerifyFields.equals(that.fstrVerifyFields));
    equal = equal && (this.fintSimplexAfterPage == null ? that.fintSimplexAfterPage == null : this.fintSimplexAfterPage.equals(that.fintSimplexAfterPage));
    equal = equal && (this.fblnSpecifiedMCLOnly == null ? that.fblnSpecifiedMCLOnly == null : this.fblnSpecifiedMCLOnly.equals(that.fblnSpecifiedMCLOnly));
    equal = equal && (this.fblnPublishTAP == null ? that.fblnPublishTAP == null : this.fblnPublishTAP.equals(that.fblnPublishTAP));
    equal = equal && (this.fstrEmailOption == null ? that.fstrEmailOption == null : this.fstrEmailOption.equals(that.fstrEmailOption));
    equal = equal && (this.fblnAlwaysPrint == null ? that.fblnAlwaysPrint == null : this.fblnAlwaysPrint.equals(that.fblnAlwaysPrint));
    equal = equal && (this.fstrRedactionImgCategory == null ? that.fstrRedactionImgCategory == null : this.fstrRedactionImgCategory.equals(that.fstrRedactionImgCategory));
    equal = equal && (this.fstrRedactionImgType == null ? that.fstrRedactionImgType == null : this.fstrRedactionImgType.equals(that.fstrRedactionImgType));
    equal = equal && (this.flngReadyFunctionNumber == null ? that.flngReadyFunctionNumber == null : this.flngReadyFunctionNumber.equals(that.flngReadyFunctionNumber));
    equal = equal && (this.fblnAllowAttachments == null ? that.fblnAllowAttachments == null : this.fblnAllowAttachments.equals(that.fblnAllowAttachments));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerRI = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFunction = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrMailType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMailTypeConfig = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTitle = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrMailItemSource = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrExternalIdentifier = JdbcWritableBridge.readString(10, __dbResults);
    this.flngMailCategoryKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngCurrentTemplateKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngMaxTemplateVer = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnCanAddManually = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnCanPrintManually = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnMarkAsReady = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngChangeCounter = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnDevelopmentOnly = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fintMailTypeSort = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnVerifyData = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrVerifyFields = JdbcWritableBridge.readString(21, __dbResults);
    this.fintSimplexAfterPage = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnSpecifiedMCLOnly = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnPublishTAP = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrEmailOption = JdbcWritableBridge.readString(25, __dbResults);
    this.fblnAlwaysPrint = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fstrRedactionImgCategory = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrRedactionImgType = JdbcWritableBridge.readString(28, __dbResults);
    this.flngReadyFunctionNumber = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnAllowAttachments = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(33, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVerRI = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngFunction = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fstrMailType = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrMailTypeConfig = JdbcWritableBridge.readString(7, __dbResults);
    this.fstrTitle = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrMailItemSource = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrExternalIdentifier = JdbcWritableBridge.readString(10, __dbResults);
    this.flngMailCategoryKey = JdbcWritableBridge.readInteger(11, __dbResults);
    this.flngCurrentTemplateKey = JdbcWritableBridge.readInteger(12, __dbResults);
    this.flngMaxTemplateVer = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnCanAddManually = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnCanPrintManually = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnMarkAsReady = JdbcWritableBridge.readInteger(16, __dbResults);
    this.flngChangeCounter = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnDevelopmentOnly = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fintMailTypeSort = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnVerifyData = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fstrVerifyFields = JdbcWritableBridge.readString(21, __dbResults);
    this.fintSimplexAfterPage = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnSpecifiedMCLOnly = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnPublishTAP = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrEmailOption = JdbcWritableBridge.readString(25, __dbResults);
    this.fblnAlwaysPrint = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fstrRedactionImgCategory = JdbcWritableBridge.readString(27, __dbResults);
    this.fstrRedactionImgType = JdbcWritableBridge.readString(28, __dbResults);
    this.flngReadyFunctionNumber = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fblnAllowAttachments = JdbcWritableBridge.readInteger(30, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(31, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(32, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(33, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerRI, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunction, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailTypeConfig, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitle, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailItemSource, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalIdentifier, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailCategoryKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCurrentTemplateKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMaxTemplateVer, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanAddManually, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanPrintManually, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMarkAsReady, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngChangeCounter, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDevelopmentOnly, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMailTypeSort, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerifyData, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVerifyFields, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSimplexAfterPage, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecifiedMCLOnly, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPublishTAP, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailOption, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlwaysPrint, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRedactionImgCategory, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRedactionImgType, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReadyFunctionNumber, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowAttachments, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 33 + __off, 93, __dbStmt);
    return 33;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerRI, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFunction, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailType, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailTypeConfig, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrTitle, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrMailItemSource, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrExternalIdentifier, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailCategoryKey, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCurrentTemplateKey, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMaxTemplateVer, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanAddManually, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCanPrintManually, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMarkAsReady, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngChangeCounter, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnDevelopmentOnly, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintMailTypeSort, 19 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnVerifyData, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrVerifyFields, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSimplexAfterPage, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnSpecifiedMCLOnly, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnPublishTAP, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrEmailOption, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAlwaysPrint, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrRedactionImgCategory, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRedactionImgType, 28 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngReadyFunctionNumber, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAllowAttachments, 30 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 31 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 32 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 33 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngMailTypeKey = null;
    } else {
    this.flngMailTypeKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngVerRI = null;
    } else {
    this.flngVerRI = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFunction = null;
    } else {
    this.flngFunction = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMailType = null;
    } else {
    this.fstrMailType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMailTypeConfig = null;
    } else {
    this.fstrMailTypeConfig = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTitle = null;
    } else {
    this.fstrTitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrMailItemSource = null;
    } else {
    this.fstrMailItemSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExternalIdentifier = null;
    } else {
    this.fstrExternalIdentifier = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngMailCategoryKey = null;
    } else {
    this.flngMailCategoryKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCurrentTemplateKey = null;
    } else {
    this.flngCurrentTemplateKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngMaxTemplateVer = null;
    } else {
    this.flngMaxTemplateVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanAddManually = null;
    } else {
    this.fblnCanAddManually = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCanPrintManually = null;
    } else {
    this.fblnCanPrintManually = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMarkAsReady = null;
    } else {
    this.fblnMarkAsReady = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngChangeCounter = null;
    } else {
    this.flngChangeCounter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnDevelopmentOnly = null;
    } else {
    this.fblnDevelopmentOnly = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintMailTypeSort = null;
    } else {
    this.fintMailTypeSort = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnVerifyData = null;
    } else {
    this.fblnVerifyData = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVerifyFields = null;
    } else {
    this.fstrVerifyFields = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintSimplexAfterPage = null;
    } else {
    this.fintSimplexAfterPage = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnSpecifiedMCLOnly = null;
    } else {
    this.fblnSpecifiedMCLOnly = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnPublishTAP = null;
    } else {
    this.fblnPublishTAP = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrEmailOption = null;
    } else {
    this.fstrEmailOption = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAlwaysPrint = null;
    } else {
    this.fblnAlwaysPrint = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRedactionImgCategory = null;
    } else {
    this.fstrRedactionImgCategory = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRedactionImgType = null;
    } else {
    this.fstrRedactionImgType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngReadyFunctionNumber = null;
    } else {
    this.flngReadyFunctionNumber = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAllowAttachments = null;
    } else {
    this.fblnAllowAttachments = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngMailTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailTypeKey);
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
    if (null == this.flngVerRI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerRI);
    }
    if (null == this.flngFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunction);
    }
    if (null == this.fstrMailType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailType);
    }
    if (null == this.fstrMailTypeConfig) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailTypeConfig);
    }
    if (null == this.fstrTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitle);
    }
    if (null == this.fstrMailItemSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailItemSource);
    }
    if (null == this.fstrExternalIdentifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalIdentifier);
    }
    if (null == this.flngMailCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailCategoryKey);
    }
    if (null == this.flngCurrentTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCurrentTemplateKey);
    }
    if (null == this.flngMaxTemplateVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMaxTemplateVer);
    }
    if (null == this.fblnCanAddManually) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanAddManually);
    }
    if (null == this.fblnCanPrintManually) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanPrintManually);
    }
    if (null == this.fblnMarkAsReady) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMarkAsReady);
    }
    if (null == this.flngChangeCounter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngChangeCounter);
    }
    if (null == this.fblnDevelopmentOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDevelopmentOnly);
    }
    if (null == this.fintMailTypeSort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMailTypeSort);
    }
    if (null == this.fblnVerifyData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerifyData);
    }
    if (null == this.fstrVerifyFields) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVerifyFields);
    }
    if (null == this.fintSimplexAfterPage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSimplexAfterPage);
    }
    if (null == this.fblnSpecifiedMCLOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecifiedMCLOnly);
    }
    if (null == this.fblnPublishTAP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPublishTAP);
    }
    if (null == this.fstrEmailOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailOption);
    }
    if (null == this.fblnAlwaysPrint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlwaysPrint);
    }
    if (null == this.fstrRedactionImgCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRedactionImgCategory);
    }
    if (null == this.fstrRedactionImgType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRedactionImgType);
    }
    if (null == this.flngReadyFunctionNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReadyFunctionNumber);
    }
    if (null == this.fblnAllowAttachments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowAttachments);
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
    if (null == this.flngMailTypeKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailTypeKey);
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
    if (null == this.flngVerRI) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerRI);
    }
    if (null == this.flngFunction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFunction);
    }
    if (null == this.fstrMailType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailType);
    }
    if (null == this.fstrMailTypeConfig) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailTypeConfig);
    }
    if (null == this.fstrTitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTitle);
    }
    if (null == this.fstrMailItemSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrMailItemSource);
    }
    if (null == this.fstrExternalIdentifier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExternalIdentifier);
    }
    if (null == this.flngMailCategoryKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMailCategoryKey);
    }
    if (null == this.flngCurrentTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCurrentTemplateKey);
    }
    if (null == this.flngMaxTemplateVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngMaxTemplateVer);
    }
    if (null == this.fblnCanAddManually) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanAddManually);
    }
    if (null == this.fblnCanPrintManually) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCanPrintManually);
    }
    if (null == this.fblnMarkAsReady) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMarkAsReady);
    }
    if (null == this.flngChangeCounter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngChangeCounter);
    }
    if (null == this.fblnDevelopmentOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnDevelopmentOnly);
    }
    if (null == this.fintMailTypeSort) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintMailTypeSort);
    }
    if (null == this.fblnVerifyData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnVerifyData);
    }
    if (null == this.fstrVerifyFields) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVerifyFields);
    }
    if (null == this.fintSimplexAfterPage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSimplexAfterPage);
    }
    if (null == this.fblnSpecifiedMCLOnly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnSpecifiedMCLOnly);
    }
    if (null == this.fblnPublishTAP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnPublishTAP);
    }
    if (null == this.fstrEmailOption) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrEmailOption);
    }
    if (null == this.fblnAlwaysPrint) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAlwaysPrint);
    }
    if (null == this.fstrRedactionImgCategory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRedactionImgCategory);
    }
    if (null == this.fstrRedactionImgType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRedactionImgType);
    }
    if (null == this.flngReadyFunctionNumber) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngReadyFunctionNumber);
    }
    if (null == this.fblnAllowAttachments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAllowAttachments);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerRI==null?"\\N":"" + flngVerRI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunction==null?"\\N":"" + flngFunction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailType==null?"\\N":fstrMailType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailTypeConfig==null?"\\N":fstrMailTypeConfig, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitle==null?"\\N":fstrTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailItemSource==null?"\\N":fstrMailItemSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalIdentifier==null?"\\N":fstrExternalIdentifier, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailCategoryKey==null?"\\N":"" + flngMailCategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCurrentTemplateKey==null?"\\N":"" + flngCurrentTemplateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMaxTemplateVer==null?"\\N":"" + flngMaxTemplateVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanAddManually==null?"\\N":"" + fblnCanAddManually, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanPrintManually==null?"\\N":"" + fblnCanPrintManually, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMarkAsReady==null?"\\N":"" + fblnMarkAsReady, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngChangeCounter==null?"\\N":"" + flngChangeCounter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDevelopmentOnly==null?"\\N":"" + fblnDevelopmentOnly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMailTypeSort==null?"\\N":"" + fintMailTypeSort, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerifyData==null?"\\N":"" + fblnVerifyData, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVerifyFields==null?"\\N":fstrVerifyFields, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSimplexAfterPage==null?"\\N":"" + fintSimplexAfterPage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecifiedMCLOnly==null?"\\N":"" + fblnSpecifiedMCLOnly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPublishTAP==null?"\\N":"" + fblnPublishTAP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailOption==null?"\\N":fstrEmailOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlwaysPrint==null?"\\N":"" + fblnAlwaysPrint, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRedactionImgCategory==null?"\\N":fstrRedactionImgCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRedactionImgType==null?"\\N":fstrRedactionImgType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReadyFunctionNumber==null?"\\N":"" + flngReadyFunctionNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowAttachments==null?"\\N":"" + fblnAllowAttachments, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerRI==null?"\\N":"" + flngVerRI, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFunction==null?"\\N":"" + flngFunction, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailType==null?"\\N":fstrMailType, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailTypeConfig==null?"\\N":fstrMailTypeConfig, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTitle==null?"\\N":fstrTitle, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrMailItemSource==null?"\\N":fstrMailItemSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExternalIdentifier==null?"\\N":fstrExternalIdentifier, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailCategoryKey==null?"\\N":"" + flngMailCategoryKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCurrentTemplateKey==null?"\\N":"" + flngCurrentTemplateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMaxTemplateVer==null?"\\N":"" + flngMaxTemplateVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanAddManually==null?"\\N":"" + fblnCanAddManually, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCanPrintManually==null?"\\N":"" + fblnCanPrintManually, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMarkAsReady==null?"\\N":"" + fblnMarkAsReady, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngChangeCounter==null?"\\N":"" + flngChangeCounter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnDevelopmentOnly==null?"\\N":"" + fblnDevelopmentOnly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintMailTypeSort==null?"\\N":"" + fintMailTypeSort, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnVerifyData==null?"\\N":"" + fblnVerifyData, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVerifyFields==null?"\\N":fstrVerifyFields, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSimplexAfterPage==null?"\\N":"" + fintSimplexAfterPage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnSpecifiedMCLOnly==null?"\\N":"" + fblnSpecifiedMCLOnly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnPublishTAP==null?"\\N":"" + fblnPublishTAP, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrEmailOption==null?"\\N":fstrEmailOption, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAlwaysPrint==null?"\\N":"" + fblnAlwaysPrint, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRedactionImgCategory==null?"\\N":fstrRedactionImgCategory, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRedactionImgType==null?"\\N":fstrRedactionImgType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngReadyFunctionNumber==null?"\\N":"" + flngReadyFunctionNumber, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAllowAttachments==null?"\\N":"" + fblnAllowAttachments, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailTypeKey = null; } else {
      this.flngMailTypeKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerRI = null; } else {
      this.flngVerRI = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunction = null; } else {
      this.flngFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailType = null; } else {
      this.fstrMailType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailTypeConfig = null; } else {
      this.fstrMailTypeConfig = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitle = null; } else {
      this.fstrTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailItemSource = null; } else {
      this.fstrMailItemSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalIdentifier = null; } else {
      this.fstrExternalIdentifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailCategoryKey = null; } else {
      this.flngMailCategoryKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCurrentTemplateKey = null; } else {
      this.flngCurrentTemplateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMaxTemplateVer = null; } else {
      this.flngMaxTemplateVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanAddManually = null; } else {
      this.fblnCanAddManually = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanPrintManually = null; } else {
      this.fblnCanPrintManually = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMarkAsReady = null; } else {
      this.fblnMarkAsReady = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngChangeCounter = null; } else {
      this.flngChangeCounter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDevelopmentOnly = null; } else {
      this.fblnDevelopmentOnly = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerifyData = null; } else {
      this.fblnVerifyData = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVerifyFields = null; } else {
      this.fstrVerifyFields = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecifiedMCLOnly = null; } else {
      this.fblnSpecifiedMCLOnly = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPublishTAP = null; } else {
      this.fblnPublishTAP = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailOption = null; } else {
      this.fstrEmailOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlwaysPrint = null; } else {
      this.fblnAlwaysPrint = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRedactionImgCategory = null; } else {
      this.fstrRedactionImgCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRedactionImgType = null; } else {
      this.fstrRedactionImgType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReadyFunctionNumber = null; } else {
      this.flngReadyFunctionNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowAttachments = null; } else {
      this.fblnAllowAttachments = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailTypeKey = null; } else {
      this.flngMailTypeKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerRI = null; } else {
      this.flngVerRI = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFunction = null; } else {
      this.flngFunction = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailType = null; } else {
      this.fstrMailType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailTypeConfig = null; } else {
      this.fstrMailTypeConfig = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTitle = null; } else {
      this.fstrTitle = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrMailItemSource = null; } else {
      this.fstrMailItemSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExternalIdentifier = null; } else {
      this.fstrExternalIdentifier = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMailCategoryKey = null; } else {
      this.flngMailCategoryKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCurrentTemplateKey = null; } else {
      this.flngCurrentTemplateKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngMaxTemplateVer = null; } else {
      this.flngMaxTemplateVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanAddManually = null; } else {
      this.fblnCanAddManually = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCanPrintManually = null; } else {
      this.fblnCanPrintManually = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMarkAsReady = null; } else {
      this.fblnMarkAsReady = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngChangeCounter = null; } else {
      this.flngChangeCounter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnDevelopmentOnly = null; } else {
      this.fblnDevelopmentOnly = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnVerifyData = null; } else {
      this.fblnVerifyData = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVerifyFields = null; } else {
      this.fstrVerifyFields = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnSpecifiedMCLOnly = null; } else {
      this.fblnSpecifiedMCLOnly = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnPublishTAP = null; } else {
      this.fblnPublishTAP = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrEmailOption = null; } else {
      this.fstrEmailOption = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAlwaysPrint = null; } else {
      this.fblnAlwaysPrint = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRedactionImgCategory = null; } else {
      this.fstrRedactionImgCategory = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRedactionImgType = null; } else {
      this.fstrRedactionImgType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngReadyFunctionNumber = null; } else {
      this.flngReadyFunctionNumber = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAllowAttachments = null; } else {
      this.fblnAllowAttachments = Integer.valueOf(__cur_str);
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
    tblmailtype o = (tblmailtype) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblmailtype o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngVerRI", this.flngVerRI);
    __sqoop$field_map.put("flngFunction", this.flngFunction);
    __sqoop$field_map.put("fstrMailType", this.fstrMailType);
    __sqoop$field_map.put("fstrMailTypeConfig", this.fstrMailTypeConfig);
    __sqoop$field_map.put("fstrTitle", this.fstrTitle);
    __sqoop$field_map.put("fstrMailItemSource", this.fstrMailItemSource);
    __sqoop$field_map.put("fstrExternalIdentifier", this.fstrExternalIdentifier);
    __sqoop$field_map.put("flngMailCategoryKey", this.flngMailCategoryKey);
    __sqoop$field_map.put("flngCurrentTemplateKey", this.flngCurrentTemplateKey);
    __sqoop$field_map.put("flngMaxTemplateVer", this.flngMaxTemplateVer);
    __sqoop$field_map.put("fblnCanAddManually", this.fblnCanAddManually);
    __sqoop$field_map.put("fblnCanPrintManually", this.fblnCanPrintManually);
    __sqoop$field_map.put("fblnMarkAsReady", this.fblnMarkAsReady);
    __sqoop$field_map.put("flngChangeCounter", this.flngChangeCounter);
    __sqoop$field_map.put("fblnDevelopmentOnly", this.fblnDevelopmentOnly);
    __sqoop$field_map.put("fintMailTypeSort", this.fintMailTypeSort);
    __sqoop$field_map.put("fblnVerifyData", this.fblnVerifyData);
    __sqoop$field_map.put("fstrVerifyFields", this.fstrVerifyFields);
    __sqoop$field_map.put("fintSimplexAfterPage", this.fintSimplexAfterPage);
    __sqoop$field_map.put("fblnSpecifiedMCLOnly", this.fblnSpecifiedMCLOnly);
    __sqoop$field_map.put("fblnPublishTAP", this.fblnPublishTAP);
    __sqoop$field_map.put("fstrEmailOption", this.fstrEmailOption);
    __sqoop$field_map.put("fblnAlwaysPrint", this.fblnAlwaysPrint);
    __sqoop$field_map.put("fstrRedactionImgCategory", this.fstrRedactionImgCategory);
    __sqoop$field_map.put("fstrRedactionImgType", this.fstrRedactionImgType);
    __sqoop$field_map.put("flngReadyFunctionNumber", this.flngReadyFunctionNumber);
    __sqoop$field_map.put("fblnAllowAttachments", this.fblnAllowAttachments);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngVerRI", this.flngVerRI);
    __sqoop$field_map.put("flngFunction", this.flngFunction);
    __sqoop$field_map.put("fstrMailType", this.fstrMailType);
    __sqoop$field_map.put("fstrMailTypeConfig", this.fstrMailTypeConfig);
    __sqoop$field_map.put("fstrTitle", this.fstrTitle);
    __sqoop$field_map.put("fstrMailItemSource", this.fstrMailItemSource);
    __sqoop$field_map.put("fstrExternalIdentifier", this.fstrExternalIdentifier);
    __sqoop$field_map.put("flngMailCategoryKey", this.flngMailCategoryKey);
    __sqoop$field_map.put("flngCurrentTemplateKey", this.flngCurrentTemplateKey);
    __sqoop$field_map.put("flngMaxTemplateVer", this.flngMaxTemplateVer);
    __sqoop$field_map.put("fblnCanAddManually", this.fblnCanAddManually);
    __sqoop$field_map.put("fblnCanPrintManually", this.fblnCanPrintManually);
    __sqoop$field_map.put("fblnMarkAsReady", this.fblnMarkAsReady);
    __sqoop$field_map.put("flngChangeCounter", this.flngChangeCounter);
    __sqoop$field_map.put("fblnDevelopmentOnly", this.fblnDevelopmentOnly);
    __sqoop$field_map.put("fintMailTypeSort", this.fintMailTypeSort);
    __sqoop$field_map.put("fblnVerifyData", this.fblnVerifyData);
    __sqoop$field_map.put("fstrVerifyFields", this.fstrVerifyFields);
    __sqoop$field_map.put("fintSimplexAfterPage", this.fintSimplexAfterPage);
    __sqoop$field_map.put("fblnSpecifiedMCLOnly", this.fblnSpecifiedMCLOnly);
    __sqoop$field_map.put("fblnPublishTAP", this.fblnPublishTAP);
    __sqoop$field_map.put("fstrEmailOption", this.fstrEmailOption);
    __sqoop$field_map.put("fblnAlwaysPrint", this.fblnAlwaysPrint);
    __sqoop$field_map.put("fstrRedactionImgCategory", this.fstrRedactionImgCategory);
    __sqoop$field_map.put("fstrRedactionImgType", this.fstrRedactionImgType);
    __sqoop$field_map.put("flngReadyFunctionNumber", this.flngReadyFunctionNumber);
    __sqoop$field_map.put("fblnAllowAttachments", this.fblnAllowAttachments);
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
