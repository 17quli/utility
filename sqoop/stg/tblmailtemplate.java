// ORM class for table 'tblmailtemplate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 22:37:12 NZDT 2020
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

public class tblmailtemplate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngTemplateKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.flngTemplateKey = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngMailTypeKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.flngMailTypeKey = (Integer)value;
      }
    });
    setters.put("flngTemplateVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.flngTemplateVer = (Integer)value;
      }
    });
    setters.put("fstrTemplateType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrTemplateType = (String)value;
      }
    });
    setters.put("flngSupersededKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.flngSupersededKey = (Integer)value;
      }
    });
    setters.put("fstrLanguage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrLanguage = (String)value;
      }
    });
    setters.put("fimgTemplateData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fimgTemplateData = (org.apache.hadoop.io.BytesWritable)value;
      }
    });
    setters.put("fimgFastTemplateData", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fimgFastTemplateData = (org.apache.hadoop.io.BytesWritable)value;
      }
    });
    setters.put("fstrDescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrDescription = (String)value;
      }
    });
    setters.put("fstrPrintControl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrPrintControl = (String)value;
      }
    });
    setters.put("fdtmInserted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fdtmInserted = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrInserted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrInserted = (String)value;
      }
    });
    setters.put("fdtmLastModified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fdtmLastModified = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrLastModified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrLastModified = (String)value;
      }
    });
    setters.put("fdtmApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fdtmApproved = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrApproved", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrApproved = (String)value;
      }
    });
    setters.put("fdtmApprovedBatch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fdtmApprovedBatch = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrApprovedBatch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrApprovedBatch = (String)value;
      }
    });
    setters.put("fdtmRetired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fdtmRetired = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRetired", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrRetired = (String)value;
      }
    });
    setters.put("fstrParameterControl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrParameterControl = (String)value;
      }
    });
    setters.put("fstrLetterDataBo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrLetterDataBo = (String)value;
      }
    });
    setters.put("flngParamFormat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.flngParamFormat = (Integer)value;
      }
    });
    setters.put("fstrRenderType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrRenderType = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblmailtemplate.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblmailtemplate() {
    init0();
  }
  private Integer flngTemplateKey;
  public Integer get_flngTemplateKey() {
    return flngTemplateKey;
  }
  public void set_flngTemplateKey(Integer flngTemplateKey) {
    this.flngTemplateKey = flngTemplateKey;
  }
  public tblmailtemplate with_flngTemplateKey(Integer flngTemplateKey) {
    this.flngTemplateKey = flngTemplateKey;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblmailtemplate with_flngVerLast(Integer flngVerLast) {
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
  public tblmailtemplate with_flngMailTypeKey(Integer flngMailTypeKey) {
    this.flngMailTypeKey = flngMailTypeKey;
    return this;
  }
  private Integer flngTemplateVer;
  public Integer get_flngTemplateVer() {
    return flngTemplateVer;
  }
  public void set_flngTemplateVer(Integer flngTemplateVer) {
    this.flngTemplateVer = flngTemplateVer;
  }
  public tblmailtemplate with_flngTemplateVer(Integer flngTemplateVer) {
    this.flngTemplateVer = flngTemplateVer;
    return this;
  }
  private String fstrTemplateType;
  public String get_fstrTemplateType() {
    return fstrTemplateType;
  }
  public void set_fstrTemplateType(String fstrTemplateType) {
    this.fstrTemplateType = fstrTemplateType;
  }
  public tblmailtemplate with_fstrTemplateType(String fstrTemplateType) {
    this.fstrTemplateType = fstrTemplateType;
    return this;
  }
  private Integer flngSupersededKey;
  public Integer get_flngSupersededKey() {
    return flngSupersededKey;
  }
  public void set_flngSupersededKey(Integer flngSupersededKey) {
    this.flngSupersededKey = flngSupersededKey;
  }
  public tblmailtemplate with_flngSupersededKey(Integer flngSupersededKey) {
    this.flngSupersededKey = flngSupersededKey;
    return this;
  }
  private String fstrLanguage;
  public String get_fstrLanguage() {
    return fstrLanguage;
  }
  public void set_fstrLanguage(String fstrLanguage) {
    this.fstrLanguage = fstrLanguage;
  }
  public tblmailtemplate with_fstrLanguage(String fstrLanguage) {
    this.fstrLanguage = fstrLanguage;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable fimgTemplateData;
  public org.apache.hadoop.io.BytesWritable get_fimgTemplateData() {
    return fimgTemplateData;
  }
  public void set_fimgTemplateData(org.apache.hadoop.io.BytesWritable fimgTemplateData) {
    this.fimgTemplateData = fimgTemplateData;
  }
  public tblmailtemplate with_fimgTemplateData(org.apache.hadoop.io.BytesWritable fimgTemplateData) {
    this.fimgTemplateData = fimgTemplateData;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable fimgFastTemplateData;
  public org.apache.hadoop.io.BytesWritable get_fimgFastTemplateData() {
    return fimgFastTemplateData;
  }
  public void set_fimgFastTemplateData(org.apache.hadoop.io.BytesWritable fimgFastTemplateData) {
    this.fimgFastTemplateData = fimgFastTemplateData;
  }
  public tblmailtemplate with_fimgFastTemplateData(org.apache.hadoop.io.BytesWritable fimgFastTemplateData) {
    this.fimgFastTemplateData = fimgFastTemplateData;
    return this;
  }
  private String fstrDescription;
  public String get_fstrDescription() {
    return fstrDescription;
  }
  public void set_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
  }
  public tblmailtemplate with_fstrDescription(String fstrDescription) {
    this.fstrDescription = fstrDescription;
    return this;
  }
  private String fstrPrintControl;
  public String get_fstrPrintControl() {
    return fstrPrintControl;
  }
  public void set_fstrPrintControl(String fstrPrintControl) {
    this.fstrPrintControl = fstrPrintControl;
  }
  public tblmailtemplate with_fstrPrintControl(String fstrPrintControl) {
    this.fstrPrintControl = fstrPrintControl;
    return this;
  }
  private java.sql.Timestamp fdtmInserted;
  public java.sql.Timestamp get_fdtmInserted() {
    return fdtmInserted;
  }
  public void set_fdtmInserted(java.sql.Timestamp fdtmInserted) {
    this.fdtmInserted = fdtmInserted;
  }
  public tblmailtemplate with_fdtmInserted(java.sql.Timestamp fdtmInserted) {
    this.fdtmInserted = fdtmInserted;
    return this;
  }
  private String fstrInserted;
  public String get_fstrInserted() {
    return fstrInserted;
  }
  public void set_fstrInserted(String fstrInserted) {
    this.fstrInserted = fstrInserted;
  }
  public tblmailtemplate with_fstrInserted(String fstrInserted) {
    this.fstrInserted = fstrInserted;
    return this;
  }
  private java.sql.Timestamp fdtmLastModified;
  public java.sql.Timestamp get_fdtmLastModified() {
    return fdtmLastModified;
  }
  public void set_fdtmLastModified(java.sql.Timestamp fdtmLastModified) {
    this.fdtmLastModified = fdtmLastModified;
  }
  public tblmailtemplate with_fdtmLastModified(java.sql.Timestamp fdtmLastModified) {
    this.fdtmLastModified = fdtmLastModified;
    return this;
  }
  private String fstrLastModified;
  public String get_fstrLastModified() {
    return fstrLastModified;
  }
  public void set_fstrLastModified(String fstrLastModified) {
    this.fstrLastModified = fstrLastModified;
  }
  public tblmailtemplate with_fstrLastModified(String fstrLastModified) {
    this.fstrLastModified = fstrLastModified;
    return this;
  }
  private java.sql.Timestamp fdtmApproved;
  public java.sql.Timestamp get_fdtmApproved() {
    return fdtmApproved;
  }
  public void set_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
  }
  public tblmailtemplate with_fdtmApproved(java.sql.Timestamp fdtmApproved) {
    this.fdtmApproved = fdtmApproved;
    return this;
  }
  private String fstrApproved;
  public String get_fstrApproved() {
    return fstrApproved;
  }
  public void set_fstrApproved(String fstrApproved) {
    this.fstrApproved = fstrApproved;
  }
  public tblmailtemplate with_fstrApproved(String fstrApproved) {
    this.fstrApproved = fstrApproved;
    return this;
  }
  private java.sql.Timestamp fdtmApprovedBatch;
  public java.sql.Timestamp get_fdtmApprovedBatch() {
    return fdtmApprovedBatch;
  }
  public void set_fdtmApprovedBatch(java.sql.Timestamp fdtmApprovedBatch) {
    this.fdtmApprovedBatch = fdtmApprovedBatch;
  }
  public tblmailtemplate with_fdtmApprovedBatch(java.sql.Timestamp fdtmApprovedBatch) {
    this.fdtmApprovedBatch = fdtmApprovedBatch;
    return this;
  }
  private String fstrApprovedBatch;
  public String get_fstrApprovedBatch() {
    return fstrApprovedBatch;
  }
  public void set_fstrApprovedBatch(String fstrApprovedBatch) {
    this.fstrApprovedBatch = fstrApprovedBatch;
  }
  public tblmailtemplate with_fstrApprovedBatch(String fstrApprovedBatch) {
    this.fstrApprovedBatch = fstrApprovedBatch;
    return this;
  }
  private java.sql.Timestamp fdtmRetired;
  public java.sql.Timestamp get_fdtmRetired() {
    return fdtmRetired;
  }
  public void set_fdtmRetired(java.sql.Timestamp fdtmRetired) {
    this.fdtmRetired = fdtmRetired;
  }
  public tblmailtemplate with_fdtmRetired(java.sql.Timestamp fdtmRetired) {
    this.fdtmRetired = fdtmRetired;
    return this;
  }
  private String fstrRetired;
  public String get_fstrRetired() {
    return fstrRetired;
  }
  public void set_fstrRetired(String fstrRetired) {
    this.fstrRetired = fstrRetired;
  }
  public tblmailtemplate with_fstrRetired(String fstrRetired) {
    this.fstrRetired = fstrRetired;
    return this;
  }
  private String fstrParameterControl;
  public String get_fstrParameterControl() {
    return fstrParameterControl;
  }
  public void set_fstrParameterControl(String fstrParameterControl) {
    this.fstrParameterControl = fstrParameterControl;
  }
  public tblmailtemplate with_fstrParameterControl(String fstrParameterControl) {
    this.fstrParameterControl = fstrParameterControl;
    return this;
  }
  private String fstrLetterDataBo;
  public String get_fstrLetterDataBo() {
    return fstrLetterDataBo;
  }
  public void set_fstrLetterDataBo(String fstrLetterDataBo) {
    this.fstrLetterDataBo = fstrLetterDataBo;
  }
  public tblmailtemplate with_fstrLetterDataBo(String fstrLetterDataBo) {
    this.fstrLetterDataBo = fstrLetterDataBo;
    return this;
  }
  private Integer flngParamFormat;
  public Integer get_flngParamFormat() {
    return flngParamFormat;
  }
  public void set_flngParamFormat(Integer flngParamFormat) {
    this.flngParamFormat = flngParamFormat;
  }
  public tblmailtemplate with_flngParamFormat(Integer flngParamFormat) {
    this.flngParamFormat = flngParamFormat;
    return this;
  }
  private String fstrRenderType;
  public String get_fstrRenderType() {
    return fstrRenderType;
  }
  public void set_fstrRenderType(String fstrRenderType) {
    this.fstrRenderType = fstrRenderType;
  }
  public tblmailtemplate with_fstrRenderType(String fstrRenderType) {
    this.fstrRenderType = fstrRenderType;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblmailtemplate with_fstrWho(String fstrWho) {
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
  public tblmailtemplate with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailtemplate)) {
      return false;
    }
    tblmailtemplate that = (tblmailtemplate) o;
    boolean equal = true;
    equal = equal && (this.flngTemplateKey == null ? that.flngTemplateKey == null : this.flngTemplateKey.equals(that.flngTemplateKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngTemplateVer == null ? that.flngTemplateVer == null : this.flngTemplateVer.equals(that.flngTemplateVer));
    equal = equal && (this.fstrTemplateType == null ? that.fstrTemplateType == null : this.fstrTemplateType.equals(that.fstrTemplateType));
    equal = equal && (this.flngSupersededKey == null ? that.flngSupersededKey == null : this.flngSupersededKey.equals(that.flngSupersededKey));
    equal = equal && (this.fstrLanguage == null ? that.fstrLanguage == null : this.fstrLanguage.equals(that.fstrLanguage));
    equal = equal && (this.fimgTemplateData == null ? that.fimgTemplateData == null : this.fimgTemplateData.equals(that.fimgTemplateData));
    equal = equal && (this.fimgFastTemplateData == null ? that.fimgFastTemplateData == null : this.fimgFastTemplateData.equals(that.fimgFastTemplateData));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fstrPrintControl == null ? that.fstrPrintControl == null : this.fstrPrintControl.equals(that.fstrPrintControl));
    equal = equal && (this.fdtmInserted == null ? that.fdtmInserted == null : this.fdtmInserted.equals(that.fdtmInserted));
    equal = equal && (this.fstrInserted == null ? that.fstrInserted == null : this.fstrInserted.equals(that.fstrInserted));
    equal = equal && (this.fdtmLastModified == null ? that.fdtmLastModified == null : this.fdtmLastModified.equals(that.fdtmLastModified));
    equal = equal && (this.fstrLastModified == null ? that.fstrLastModified == null : this.fstrLastModified.equals(that.fstrLastModified));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrApproved == null ? that.fstrApproved == null : this.fstrApproved.equals(that.fstrApproved));
    equal = equal && (this.fdtmApprovedBatch == null ? that.fdtmApprovedBatch == null : this.fdtmApprovedBatch.equals(that.fdtmApprovedBatch));
    equal = equal && (this.fstrApprovedBatch == null ? that.fstrApprovedBatch == null : this.fstrApprovedBatch.equals(that.fstrApprovedBatch));
    equal = equal && (this.fdtmRetired == null ? that.fdtmRetired == null : this.fdtmRetired.equals(that.fdtmRetired));
    equal = equal && (this.fstrRetired == null ? that.fstrRetired == null : this.fstrRetired.equals(that.fstrRetired));
    equal = equal && (this.fstrParameterControl == null ? that.fstrParameterControl == null : this.fstrParameterControl.equals(that.fstrParameterControl));
    equal = equal && (this.fstrLetterDataBo == null ? that.fstrLetterDataBo == null : this.fstrLetterDataBo.equals(that.fstrLetterDataBo));
    equal = equal && (this.flngParamFormat == null ? that.flngParamFormat == null : this.flngParamFormat.equals(that.flngParamFormat));
    equal = equal && (this.fstrRenderType == null ? that.fstrRenderType == null : this.fstrRenderType.equals(that.fstrRenderType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblmailtemplate)) {
      return false;
    }
    tblmailtemplate that = (tblmailtemplate) o;
    boolean equal = true;
    equal = equal && (this.flngTemplateKey == null ? that.flngTemplateKey == null : this.flngTemplateKey.equals(that.flngTemplateKey));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngMailTypeKey == null ? that.flngMailTypeKey == null : this.flngMailTypeKey.equals(that.flngMailTypeKey));
    equal = equal && (this.flngTemplateVer == null ? that.flngTemplateVer == null : this.flngTemplateVer.equals(that.flngTemplateVer));
    equal = equal && (this.fstrTemplateType == null ? that.fstrTemplateType == null : this.fstrTemplateType.equals(that.fstrTemplateType));
    equal = equal && (this.flngSupersededKey == null ? that.flngSupersededKey == null : this.flngSupersededKey.equals(that.flngSupersededKey));
    equal = equal && (this.fstrLanguage == null ? that.fstrLanguage == null : this.fstrLanguage.equals(that.fstrLanguage));
    equal = equal && (this.fimgTemplateData == null ? that.fimgTemplateData == null : this.fimgTemplateData.equals(that.fimgTemplateData));
    equal = equal && (this.fimgFastTemplateData == null ? that.fimgFastTemplateData == null : this.fimgFastTemplateData.equals(that.fimgFastTemplateData));
    equal = equal && (this.fstrDescription == null ? that.fstrDescription == null : this.fstrDescription.equals(that.fstrDescription));
    equal = equal && (this.fstrPrintControl == null ? that.fstrPrintControl == null : this.fstrPrintControl.equals(that.fstrPrintControl));
    equal = equal && (this.fdtmInserted == null ? that.fdtmInserted == null : this.fdtmInserted.equals(that.fdtmInserted));
    equal = equal && (this.fstrInserted == null ? that.fstrInserted == null : this.fstrInserted.equals(that.fstrInserted));
    equal = equal && (this.fdtmLastModified == null ? that.fdtmLastModified == null : this.fdtmLastModified.equals(that.fdtmLastModified));
    equal = equal && (this.fstrLastModified == null ? that.fstrLastModified == null : this.fstrLastModified.equals(that.fstrLastModified));
    equal = equal && (this.fdtmApproved == null ? that.fdtmApproved == null : this.fdtmApproved.equals(that.fdtmApproved));
    equal = equal && (this.fstrApproved == null ? that.fstrApproved == null : this.fstrApproved.equals(that.fstrApproved));
    equal = equal && (this.fdtmApprovedBatch == null ? that.fdtmApprovedBatch == null : this.fdtmApprovedBatch.equals(that.fdtmApprovedBatch));
    equal = equal && (this.fstrApprovedBatch == null ? that.fstrApprovedBatch == null : this.fstrApprovedBatch.equals(that.fstrApprovedBatch));
    equal = equal && (this.fdtmRetired == null ? that.fdtmRetired == null : this.fdtmRetired.equals(that.fdtmRetired));
    equal = equal && (this.fstrRetired == null ? that.fstrRetired == null : this.fstrRetired.equals(that.fstrRetired));
    equal = equal && (this.fstrParameterControl == null ? that.fstrParameterControl == null : this.fstrParameterControl.equals(that.fstrParameterControl));
    equal = equal && (this.fstrLetterDataBo == null ? that.fstrLetterDataBo == null : this.fstrLetterDataBo.equals(that.fstrLetterDataBo));
    equal = equal && (this.flngParamFormat == null ? that.flngParamFormat == null : this.flngParamFormat.equals(that.flngParamFormat));
    equal = equal && (this.fstrRenderType == null ? that.fstrRenderType == null : this.fstrRenderType.equals(that.fstrRenderType));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngTemplateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngTemplateVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrTemplateType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngSupersededKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrLanguage = JdbcWritableBridge.readString(7, __dbResults);
    this.fimgTemplateData = JdbcWritableBridge.readBytesWritable(8, __dbResults);
    this.fimgFastTemplateData = JdbcWritableBridge.readBytesWritable(9, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrPrintControl = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmInserted = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrInserted = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmLastModified = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrLastModified = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrApproved = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmApprovedBatch = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrApprovedBatch = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmRetired = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrRetired = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrParameterControl = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrLetterDataBo = JdbcWritableBridge.readString(23, __dbResults);
    this.flngParamFormat = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrRenderType = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngTemplateKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngMailTypeKey = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngTemplateVer = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrTemplateType = JdbcWritableBridge.readString(5, __dbResults);
    this.flngSupersededKey = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fstrLanguage = JdbcWritableBridge.readString(7, __dbResults);
    this.fimgTemplateData = JdbcWritableBridge.readBytesWritable(8, __dbResults);
    this.fimgFastTemplateData = JdbcWritableBridge.readBytesWritable(9, __dbResults);
    this.fstrDescription = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrPrintControl = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmInserted = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fstrInserted = JdbcWritableBridge.readString(13, __dbResults);
    this.fdtmLastModified = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fstrLastModified = JdbcWritableBridge.readString(15, __dbResults);
    this.fdtmApproved = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrApproved = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmApprovedBatch = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fstrApprovedBatch = JdbcWritableBridge.readString(19, __dbResults);
    this.fdtmRetired = JdbcWritableBridge.readTimestamp(20, __dbResults);
    this.fstrRetired = JdbcWritableBridge.readString(21, __dbResults);
    this.fstrParameterControl = JdbcWritableBridge.readString(22, __dbResults);
    this.fstrLetterDataBo = JdbcWritableBridge.readString(23, __dbResults);
    this.flngParamFormat = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fstrRenderType = JdbcWritableBridge.readString(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngTemplateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTemplateVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrTemplateType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSupersededKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLanguage, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(fimgTemplateData, 8 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(fimgFastTemplateData, 9 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrintControl, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInserted, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrInserted, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastModified, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastModified, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApproved, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApprovedBatch, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBatch, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRetired, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRetired, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrParameterControl, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLetterDataBo, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParamFormat, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRenderType, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngTemplateKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngMailTypeKey, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngTemplateVer, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrTemplateType, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngSupersededKey, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrLanguage, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(fimgTemplateData, 8 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(fimgFastTemplateData, 9 + __off, -3, __dbStmt);
    JdbcWritableBridge.writeString(fstrDescription, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPrintControl, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmInserted, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrInserted, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmLastModified, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrLastModified, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApproved, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApproved, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmApprovedBatch, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrApprovedBatch, 19 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRetired, 20 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRetired, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrParameterControl, 22 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrLetterDataBo, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngParamFormat, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrRenderType, 25 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngTemplateKey = null;
    } else {
    this.flngTemplateKey = Integer.valueOf(__dataIn.readInt());
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
        this.flngTemplateVer = null;
    } else {
    this.flngTemplateVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrTemplateType = null;
    } else {
    this.fstrTemplateType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngSupersededKey = null;
    } else {
    this.flngSupersededKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLanguage = null;
    } else {
    this.fstrLanguage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fimgTemplateData = null;
    } else {
    this.fimgTemplateData = new BytesWritable();
    this.fimgTemplateData.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fimgFastTemplateData = null;
    } else {
    this.fimgFastTemplateData = new BytesWritable();
    this.fimgFastTemplateData.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDescription = null;
    } else {
    this.fstrDescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPrintControl = null;
    } else {
    this.fstrPrintControl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmInserted = null;
    } else {
    this.fdtmInserted = new Timestamp(__dataIn.readLong());
    this.fdtmInserted.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrInserted = null;
    } else {
    this.fstrInserted = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmLastModified = null;
    } else {
    this.fdtmLastModified = new Timestamp(__dataIn.readLong());
    this.fdtmLastModified.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLastModified = null;
    } else {
    this.fstrLastModified = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApproved = null;
    } else {
    this.fdtmApproved = new Timestamp(__dataIn.readLong());
    this.fdtmApproved.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApproved = null;
    } else {
    this.fstrApproved = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmApprovedBatch = null;
    } else {
    this.fdtmApprovedBatch = new Timestamp(__dataIn.readLong());
    this.fdtmApprovedBatch.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrApprovedBatch = null;
    } else {
    this.fstrApprovedBatch = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRetired = null;
    } else {
    this.fdtmRetired = new Timestamp(__dataIn.readLong());
    this.fdtmRetired.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRetired = null;
    } else {
    this.fstrRetired = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrParameterControl = null;
    } else {
    this.fstrParameterControl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrLetterDataBo = null;
    } else {
    this.fstrLetterDataBo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngParamFormat = null;
    } else {
    this.flngParamFormat = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRenderType = null;
    } else {
    this.fstrRenderType = Text.readString(__dataIn);
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
    if (null == this.flngTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateKey);
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
    if (null == this.flngTemplateVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateVer);
    }
    if (null == this.fstrTemplateType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTemplateType);
    }
    if (null == this.flngSupersededKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSupersededKey);
    }
    if (null == this.fstrLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLanguage);
    }
    if (null == this.fimgTemplateData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.fimgTemplateData.write(__dataOut);
    }
    if (null == this.fimgFastTemplateData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.fimgFastTemplateData.write(__dataOut);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fstrPrintControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrintControl);
    }
    if (null == this.fdtmInserted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInserted.getTime());
    __dataOut.writeInt(this.fdtmInserted.getNanos());
    }
    if (null == this.fstrInserted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInserted);
    }
    if (null == this.fdtmLastModified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastModified.getTime());
    __dataOut.writeInt(this.fdtmLastModified.getNanos());
    }
    if (null == this.fstrLastModified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastModified);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApproved);
    }
    if (null == this.fdtmApprovedBatch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApprovedBatch.getTime());
    __dataOut.writeInt(this.fdtmApprovedBatch.getNanos());
    }
    if (null == this.fstrApprovedBatch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBatch);
    }
    if (null == this.fdtmRetired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRetired.getTime());
    __dataOut.writeInt(this.fdtmRetired.getNanos());
    }
    if (null == this.fstrRetired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRetired);
    }
    if (null == this.fstrParameterControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrParameterControl);
    }
    if (null == this.fstrLetterDataBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLetterDataBo);
    }
    if (null == this.flngParamFormat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParamFormat);
    }
    if (null == this.fstrRenderType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRenderType);
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
    if (null == this.flngTemplateKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateKey);
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
    if (null == this.flngTemplateVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngTemplateVer);
    }
    if (null == this.fstrTemplateType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrTemplateType);
    }
    if (null == this.flngSupersededKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngSupersededKey);
    }
    if (null == this.fstrLanguage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLanguage);
    }
    if (null == this.fimgTemplateData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.fimgTemplateData.write(__dataOut);
    }
    if (null == this.fimgFastTemplateData) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.fimgFastTemplateData.write(__dataOut);
    }
    if (null == this.fstrDescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDescription);
    }
    if (null == this.fstrPrintControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPrintControl);
    }
    if (null == this.fdtmInserted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmInserted.getTime());
    __dataOut.writeInt(this.fdtmInserted.getNanos());
    }
    if (null == this.fstrInserted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrInserted);
    }
    if (null == this.fdtmLastModified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmLastModified.getTime());
    __dataOut.writeInt(this.fdtmLastModified.getNanos());
    }
    if (null == this.fstrLastModified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLastModified);
    }
    if (null == this.fdtmApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApproved.getTime());
    __dataOut.writeInt(this.fdtmApproved.getNanos());
    }
    if (null == this.fstrApproved) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApproved);
    }
    if (null == this.fdtmApprovedBatch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmApprovedBatch.getTime());
    __dataOut.writeInt(this.fdtmApprovedBatch.getNanos());
    }
    if (null == this.fstrApprovedBatch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrApprovedBatch);
    }
    if (null == this.fdtmRetired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRetired.getTime());
    __dataOut.writeInt(this.fdtmRetired.getNanos());
    }
    if (null == this.fstrRetired) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRetired);
    }
    if (null == this.fstrParameterControl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrParameterControl);
    }
    if (null == this.fstrLetterDataBo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrLetterDataBo);
    }
    if (null == this.flngParamFormat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngParamFormat);
    }
    if (null == this.fstrRenderType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRenderType);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateKey==null?"\\N":"" + flngTemplateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateVer==null?"\\N":"" + flngTemplateVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTemplateType==null?"\\N":fstrTemplateType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSupersededKey==null?"\\N":"" + flngSupersededKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLanguage==null?"\\N":fstrLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fimgTemplateData==null?"\\N":"" + fimgTemplateData, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fimgFastTemplateData==null?"\\N":"" + fimgFastTemplateData, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrintControl==null?"\\N":fstrPrintControl, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInserted==null?"\\N":"" + fdtmInserted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInserted==null?"\\N":fstrInserted, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastModified==null?"\\N":"" + fdtmLastModified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastModified==null?"\\N":fstrLastModified, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApproved==null?"\\N":fstrApproved, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApprovedBatch==null?"\\N":"" + fdtmApprovedBatch, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBatch==null?"\\N":fstrApprovedBatch, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRetired==null?"\\N":"" + fdtmRetired, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRetired==null?"\\N":fstrRetired, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrParameterControl==null?"\\N":fstrParameterControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLetterDataBo==null?"\\N":fstrLetterDataBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParamFormat==null?"\\N":"" + flngParamFormat, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRenderType==null?"\\N":fstrRenderType, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateKey==null?"\\N":"" + flngTemplateKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngMailTypeKey==null?"\\N":"" + flngMailTypeKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngTemplateVer==null?"\\N":"" + flngTemplateVer, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrTemplateType==null?"\\N":fstrTemplateType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngSupersededKey==null?"\\N":"" + flngSupersededKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLanguage==null?"\\N":fstrLanguage, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fimgTemplateData==null?"\\N":"" + fimgTemplateData, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fimgFastTemplateData==null?"\\N":"" + fimgFastTemplateData, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDescription==null?"\\N":fstrDescription, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPrintControl==null?"\\N":fstrPrintControl, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmInserted==null?"\\N":"" + fdtmInserted, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrInserted==null?"\\N":fstrInserted, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmLastModified==null?"\\N":"" + fdtmLastModified, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLastModified==null?"\\N":fstrLastModified, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApproved==null?"\\N":"" + fdtmApproved, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApproved==null?"\\N":fstrApproved, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmApprovedBatch==null?"\\N":"" + fdtmApprovedBatch, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrApprovedBatch==null?"\\N":fstrApprovedBatch, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRetired==null?"\\N":"" + fdtmRetired, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRetired==null?"\\N":fstrRetired, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrParameterControl==null?"\\N":fstrParameterControl, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrLetterDataBo==null?"\\N":fstrLetterDataBo, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngParamFormat==null?"\\N":"" + flngParamFormat, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRenderType==null?"\\N":fstrRenderType, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateKey = null; } else {
      this.flngTemplateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateVer = null; } else {
      this.flngTemplateVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTemplateType = null; } else {
      this.fstrTemplateType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSupersededKey = null; } else {
      this.flngSupersededKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fimgTemplateData = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.fimgTemplateData = new BytesWritable(byteVal);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fimgFastTemplateData = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.fimgFastTemplateData = new BytesWritable(byteVal);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrintControl = null; } else {
      this.fstrPrintControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInserted = null; } else {
      this.fdtmInserted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInserted = null; } else {
      this.fstrInserted = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastModified = null; } else {
      this.fdtmLastModified = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastModified = null; } else {
      this.fstrLastModified = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApproved = null; } else {
      this.fstrApproved = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApprovedBatch = null; } else {
      this.fdtmApprovedBatch = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBatch = null; } else {
      this.fstrApprovedBatch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRetired = null; } else {
      this.fdtmRetired = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRetired = null; } else {
      this.fstrRetired = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrParameterControl = null; } else {
      this.fstrParameterControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLetterDataBo = null; } else {
      this.fstrLetterDataBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParamFormat = null; } else {
      this.flngParamFormat = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateKey = null; } else {
      this.flngTemplateKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngTemplateVer = null; } else {
      this.flngTemplateVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrTemplateType = null; } else {
      this.fstrTemplateType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngSupersededKey = null; } else {
      this.flngSupersededKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fimgTemplateData = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.fimgTemplateData = new BytesWritable(byteVal);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fimgFastTemplateData = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.fimgFastTemplateData = new BytesWritable(byteVal);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDescription = null; } else {
      this.fstrDescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPrintControl = null; } else {
      this.fstrPrintControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmInserted = null; } else {
      this.fdtmInserted = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrInserted = null; } else {
      this.fstrInserted = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmLastModified = null; } else {
      this.fdtmLastModified = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLastModified = null; } else {
      this.fstrLastModified = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApproved = null; } else {
      this.fdtmApproved = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApproved = null; } else {
      this.fstrApproved = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmApprovedBatch = null; } else {
      this.fdtmApprovedBatch = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrApprovedBatch = null; } else {
      this.fstrApprovedBatch = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRetired = null; } else {
      this.fdtmRetired = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRetired = null; } else {
      this.fstrRetired = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrParameterControl = null; } else {
      this.fstrParameterControl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrLetterDataBo = null; } else {
      this.fstrLetterDataBo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngParamFormat = null; } else {
      this.flngParamFormat = Integer.valueOf(__cur_str);
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
    tblmailtemplate o = (tblmailtemplate) super.clone();
    o.fimgTemplateData = (o.fimgTemplateData != null) ? new BytesWritable(Arrays.copyOf(fimgTemplateData.getBytes(), fimgTemplateData.getLength())) : null;
    o.fimgFastTemplateData = (o.fimgFastTemplateData != null) ? new BytesWritable(Arrays.copyOf(fimgFastTemplateData.getBytes(), fimgFastTemplateData.getLength())) : null;
    o.fdtmInserted = (o.fdtmInserted != null) ? (java.sql.Timestamp) o.fdtmInserted.clone() : null;
    o.fdtmLastModified = (o.fdtmLastModified != null) ? (java.sql.Timestamp) o.fdtmLastModified.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmApprovedBatch = (o.fdtmApprovedBatch != null) ? (java.sql.Timestamp) o.fdtmApprovedBatch.clone() : null;
    o.fdtmRetired = (o.fdtmRetired != null) ? (java.sql.Timestamp) o.fdtmRetired.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblmailtemplate o) throws CloneNotSupportedException {
    o.fimgTemplateData = (o.fimgTemplateData != null) ? new BytesWritable(Arrays.copyOf(fimgTemplateData.getBytes(), fimgTemplateData.getLength())) : null;
    o.fimgFastTemplateData = (o.fimgFastTemplateData != null) ? new BytesWritable(Arrays.copyOf(fimgFastTemplateData.getBytes(), fimgFastTemplateData.getLength())) : null;
    o.fdtmInserted = (o.fdtmInserted != null) ? (java.sql.Timestamp) o.fdtmInserted.clone() : null;
    o.fdtmLastModified = (o.fdtmLastModified != null) ? (java.sql.Timestamp) o.fdtmLastModified.clone() : null;
    o.fdtmApproved = (o.fdtmApproved != null) ? (java.sql.Timestamp) o.fdtmApproved.clone() : null;
    o.fdtmApprovedBatch = (o.fdtmApprovedBatch != null) ? (java.sql.Timestamp) o.fdtmApprovedBatch.clone() : null;
    o.fdtmRetired = (o.fdtmRetired != null) ? (java.sql.Timestamp) o.fdtmRetired.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngTemplateKey", this.flngTemplateKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngTemplateVer", this.flngTemplateVer);
    __sqoop$field_map.put("fstrTemplateType", this.fstrTemplateType);
    __sqoop$field_map.put("flngSupersededKey", this.flngSupersededKey);
    __sqoop$field_map.put("fstrLanguage", this.fstrLanguage);
    __sqoop$field_map.put("fimgTemplateData", this.fimgTemplateData);
    __sqoop$field_map.put("fimgFastTemplateData", this.fimgFastTemplateData);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fstrPrintControl", this.fstrPrintControl);
    __sqoop$field_map.put("fdtmInserted", this.fdtmInserted);
    __sqoop$field_map.put("fstrInserted", this.fstrInserted);
    __sqoop$field_map.put("fdtmLastModified", this.fdtmLastModified);
    __sqoop$field_map.put("fstrLastModified", this.fstrLastModified);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrApproved", this.fstrApproved);
    __sqoop$field_map.put("fdtmApprovedBatch", this.fdtmApprovedBatch);
    __sqoop$field_map.put("fstrApprovedBatch", this.fstrApprovedBatch);
    __sqoop$field_map.put("fdtmRetired", this.fdtmRetired);
    __sqoop$field_map.put("fstrRetired", this.fstrRetired);
    __sqoop$field_map.put("fstrParameterControl", this.fstrParameterControl);
    __sqoop$field_map.put("fstrLetterDataBo", this.fstrLetterDataBo);
    __sqoop$field_map.put("flngParamFormat", this.flngParamFormat);
    __sqoop$field_map.put("fstrRenderType", this.fstrRenderType);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngTemplateKey", this.flngTemplateKey);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngMailTypeKey", this.flngMailTypeKey);
    __sqoop$field_map.put("flngTemplateVer", this.flngTemplateVer);
    __sqoop$field_map.put("fstrTemplateType", this.fstrTemplateType);
    __sqoop$field_map.put("flngSupersededKey", this.flngSupersededKey);
    __sqoop$field_map.put("fstrLanguage", this.fstrLanguage);
    __sqoop$field_map.put("fimgTemplateData", this.fimgTemplateData);
    __sqoop$field_map.put("fimgFastTemplateData", this.fimgFastTemplateData);
    __sqoop$field_map.put("fstrDescription", this.fstrDescription);
    __sqoop$field_map.put("fstrPrintControl", this.fstrPrintControl);
    __sqoop$field_map.put("fdtmInserted", this.fdtmInserted);
    __sqoop$field_map.put("fstrInserted", this.fstrInserted);
    __sqoop$field_map.put("fdtmLastModified", this.fdtmLastModified);
    __sqoop$field_map.put("fstrLastModified", this.fstrLastModified);
    __sqoop$field_map.put("fdtmApproved", this.fdtmApproved);
    __sqoop$field_map.put("fstrApproved", this.fstrApproved);
    __sqoop$field_map.put("fdtmApprovedBatch", this.fdtmApprovedBatch);
    __sqoop$field_map.put("fstrApprovedBatch", this.fstrApprovedBatch);
    __sqoop$field_map.put("fdtmRetired", this.fdtmRetired);
    __sqoop$field_map.put("fstrRetired", this.fstrRetired);
    __sqoop$field_map.put("fstrParameterControl", this.fstrParameterControl);
    __sqoop$field_map.put("fstrLetterDataBo", this.fstrLetterDataBo);
    __sqoop$field_map.put("flngParamFormat", this.flngParamFormat);
    __sqoop$field_map.put("fstrRenderType", this.fstrRenderType);
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
