// ORM class for table 'tblnz_gstreg'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:23:36 NZDT 2020
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

public class tblnz_gstreg extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fi64DocGroupKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fi64DocGroupKey = (Long)value;
      }
    });
    setters.put("fblnTurnoverOver60k", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnTurnoverOver60k = (Integer)value;
      }
    });
    setters.put("fstrExpectedTurnover", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fstrExpectedTurnover = (String)value;
      }
    });
    setters.put("fstrWhoResponsibleForGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fstrWhoResponsibleForGST = (String)value;
      }
    });
    setters.put("fblnNeedsHelp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnNeedsHelp = (Integer)value;
      }
    });
    setters.put("fblnNeedsHelpFilingReturns", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnNeedsHelpFilingReturns = (Integer)value;
      }
    });
    setters.put("fblnNeedsHelpRecordKeeping", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnNeedsHelpRecordKeeping = (Integer)value;
      }
    });
    setters.put("fblnNeedsHelpWhatToClaim", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnNeedsHelpWhatToClaim = (Integer)value;
      }
    });
    setters.put("fdtmCommencementDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fdtmCommencementDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnExporter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnExporter = (Integer)value;
      }
    });
    setters.put("fblnImporter", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnImporter = (Integer)value;
      }
    });
    setters.put("fblnMailReturns", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnMailReturns = (Integer)value;
      }
    });
    setters.put("fblnExemptSupplies", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnExemptSupplies = (Integer)value;
      }
    });
    setters.put("fblnTaxableActivity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fblnTaxableActivity = (Integer)value;
      }
    });
    setters.put("fstrFilingFrequency", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fstrFilingFrequency = (String)value;
      }
    });
    setters.put("fstrAccountingBasis", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fstrAccountingBasis = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_gstreg.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_gstreg() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_gstreg with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Long fi64DocGroupKey;
  public Long get_fi64DocGroupKey() {
    return fi64DocGroupKey;
  }
  public void set_fi64DocGroupKey(Long fi64DocGroupKey) {
    this.fi64DocGroupKey = fi64DocGroupKey;
  }
  public tblnz_gstreg with_fi64DocGroupKey(Long fi64DocGroupKey) {
    this.fi64DocGroupKey = fi64DocGroupKey;
    return this;
  }
  private Integer fblnTurnoverOver60k;
  public Integer get_fblnTurnoverOver60k() {
    return fblnTurnoverOver60k;
  }
  public void set_fblnTurnoverOver60k(Integer fblnTurnoverOver60k) {
    this.fblnTurnoverOver60k = fblnTurnoverOver60k;
  }
  public tblnz_gstreg with_fblnTurnoverOver60k(Integer fblnTurnoverOver60k) {
    this.fblnTurnoverOver60k = fblnTurnoverOver60k;
    return this;
  }
  private String fstrExpectedTurnover;
  public String get_fstrExpectedTurnover() {
    return fstrExpectedTurnover;
  }
  public void set_fstrExpectedTurnover(String fstrExpectedTurnover) {
    this.fstrExpectedTurnover = fstrExpectedTurnover;
  }
  public tblnz_gstreg with_fstrExpectedTurnover(String fstrExpectedTurnover) {
    this.fstrExpectedTurnover = fstrExpectedTurnover;
    return this;
  }
  private String fstrWhoResponsibleForGST;
  public String get_fstrWhoResponsibleForGST() {
    return fstrWhoResponsibleForGST;
  }
  public void set_fstrWhoResponsibleForGST(String fstrWhoResponsibleForGST) {
    this.fstrWhoResponsibleForGST = fstrWhoResponsibleForGST;
  }
  public tblnz_gstreg with_fstrWhoResponsibleForGST(String fstrWhoResponsibleForGST) {
    this.fstrWhoResponsibleForGST = fstrWhoResponsibleForGST;
    return this;
  }
  private Integer fblnNeedsHelp;
  public Integer get_fblnNeedsHelp() {
    return fblnNeedsHelp;
  }
  public void set_fblnNeedsHelp(Integer fblnNeedsHelp) {
    this.fblnNeedsHelp = fblnNeedsHelp;
  }
  public tblnz_gstreg with_fblnNeedsHelp(Integer fblnNeedsHelp) {
    this.fblnNeedsHelp = fblnNeedsHelp;
    return this;
  }
  private Integer fblnNeedsHelpFilingReturns;
  public Integer get_fblnNeedsHelpFilingReturns() {
    return fblnNeedsHelpFilingReturns;
  }
  public void set_fblnNeedsHelpFilingReturns(Integer fblnNeedsHelpFilingReturns) {
    this.fblnNeedsHelpFilingReturns = fblnNeedsHelpFilingReturns;
  }
  public tblnz_gstreg with_fblnNeedsHelpFilingReturns(Integer fblnNeedsHelpFilingReturns) {
    this.fblnNeedsHelpFilingReturns = fblnNeedsHelpFilingReturns;
    return this;
  }
  private Integer fblnNeedsHelpRecordKeeping;
  public Integer get_fblnNeedsHelpRecordKeeping() {
    return fblnNeedsHelpRecordKeeping;
  }
  public void set_fblnNeedsHelpRecordKeeping(Integer fblnNeedsHelpRecordKeeping) {
    this.fblnNeedsHelpRecordKeeping = fblnNeedsHelpRecordKeeping;
  }
  public tblnz_gstreg with_fblnNeedsHelpRecordKeeping(Integer fblnNeedsHelpRecordKeeping) {
    this.fblnNeedsHelpRecordKeeping = fblnNeedsHelpRecordKeeping;
    return this;
  }
  private Integer fblnNeedsHelpWhatToClaim;
  public Integer get_fblnNeedsHelpWhatToClaim() {
    return fblnNeedsHelpWhatToClaim;
  }
  public void set_fblnNeedsHelpWhatToClaim(Integer fblnNeedsHelpWhatToClaim) {
    this.fblnNeedsHelpWhatToClaim = fblnNeedsHelpWhatToClaim;
  }
  public tblnz_gstreg with_fblnNeedsHelpWhatToClaim(Integer fblnNeedsHelpWhatToClaim) {
    this.fblnNeedsHelpWhatToClaim = fblnNeedsHelpWhatToClaim;
    return this;
  }
  private java.sql.Timestamp fdtmCommencementDate;
  public java.sql.Timestamp get_fdtmCommencementDate() {
    return fdtmCommencementDate;
  }
  public void set_fdtmCommencementDate(java.sql.Timestamp fdtmCommencementDate) {
    this.fdtmCommencementDate = fdtmCommencementDate;
  }
  public tblnz_gstreg with_fdtmCommencementDate(java.sql.Timestamp fdtmCommencementDate) {
    this.fdtmCommencementDate = fdtmCommencementDate;
    return this;
  }
  private Integer fblnExporter;
  public Integer get_fblnExporter() {
    return fblnExporter;
  }
  public void set_fblnExporter(Integer fblnExporter) {
    this.fblnExporter = fblnExporter;
  }
  public tblnz_gstreg with_fblnExporter(Integer fblnExporter) {
    this.fblnExporter = fblnExporter;
    return this;
  }
  private Integer fblnImporter;
  public Integer get_fblnImporter() {
    return fblnImporter;
  }
  public void set_fblnImporter(Integer fblnImporter) {
    this.fblnImporter = fblnImporter;
  }
  public tblnz_gstreg with_fblnImporter(Integer fblnImporter) {
    this.fblnImporter = fblnImporter;
    return this;
  }
  private Integer fblnMailReturns;
  public Integer get_fblnMailReturns() {
    return fblnMailReturns;
  }
  public void set_fblnMailReturns(Integer fblnMailReturns) {
    this.fblnMailReturns = fblnMailReturns;
  }
  public tblnz_gstreg with_fblnMailReturns(Integer fblnMailReturns) {
    this.fblnMailReturns = fblnMailReturns;
    return this;
  }
  private Integer fblnExemptSupplies;
  public Integer get_fblnExemptSupplies() {
    return fblnExemptSupplies;
  }
  public void set_fblnExemptSupplies(Integer fblnExemptSupplies) {
    this.fblnExemptSupplies = fblnExemptSupplies;
  }
  public tblnz_gstreg with_fblnExemptSupplies(Integer fblnExemptSupplies) {
    this.fblnExemptSupplies = fblnExemptSupplies;
    return this;
  }
  private Integer fblnTaxableActivity;
  public Integer get_fblnTaxableActivity() {
    return fblnTaxableActivity;
  }
  public void set_fblnTaxableActivity(Integer fblnTaxableActivity) {
    this.fblnTaxableActivity = fblnTaxableActivity;
  }
  public tblnz_gstreg with_fblnTaxableActivity(Integer fblnTaxableActivity) {
    this.fblnTaxableActivity = fblnTaxableActivity;
    return this;
  }
  private String fstrFilingFrequency;
  public String get_fstrFilingFrequency() {
    return fstrFilingFrequency;
  }
  public void set_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
  }
  public tblnz_gstreg with_fstrFilingFrequency(String fstrFilingFrequency) {
    this.fstrFilingFrequency = fstrFilingFrequency;
    return this;
  }
  private String fstrAccountingBasis;
  public String get_fstrAccountingBasis() {
    return fstrAccountingBasis;
  }
  public void set_fstrAccountingBasis(String fstrAccountingBasis) {
    this.fstrAccountingBasis = fstrAccountingBasis;
  }
  public tblnz_gstreg with_fstrAccountingBasis(String fstrAccountingBasis) {
    this.fstrAccountingBasis = fstrAccountingBasis;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_gstreg with_fstrWho(String fstrWho) {
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
  public tblnz_gstreg with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_gstreg)) {
      return false;
    }
    tblnz_gstreg that = (tblnz_gstreg) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fi64DocGroupKey == null ? that.fi64DocGroupKey == null : this.fi64DocGroupKey.equals(that.fi64DocGroupKey));
    equal = equal && (this.fblnTurnoverOver60k == null ? that.fblnTurnoverOver60k == null : this.fblnTurnoverOver60k.equals(that.fblnTurnoverOver60k));
    equal = equal && (this.fstrExpectedTurnover == null ? that.fstrExpectedTurnover == null : this.fstrExpectedTurnover.equals(that.fstrExpectedTurnover));
    equal = equal && (this.fstrWhoResponsibleForGST == null ? that.fstrWhoResponsibleForGST == null : this.fstrWhoResponsibleForGST.equals(that.fstrWhoResponsibleForGST));
    equal = equal && (this.fblnNeedsHelp == null ? that.fblnNeedsHelp == null : this.fblnNeedsHelp.equals(that.fblnNeedsHelp));
    equal = equal && (this.fblnNeedsHelpFilingReturns == null ? that.fblnNeedsHelpFilingReturns == null : this.fblnNeedsHelpFilingReturns.equals(that.fblnNeedsHelpFilingReturns));
    equal = equal && (this.fblnNeedsHelpRecordKeeping == null ? that.fblnNeedsHelpRecordKeeping == null : this.fblnNeedsHelpRecordKeeping.equals(that.fblnNeedsHelpRecordKeeping));
    equal = equal && (this.fblnNeedsHelpWhatToClaim == null ? that.fblnNeedsHelpWhatToClaim == null : this.fblnNeedsHelpWhatToClaim.equals(that.fblnNeedsHelpWhatToClaim));
    equal = equal && (this.fdtmCommencementDate == null ? that.fdtmCommencementDate == null : this.fdtmCommencementDate.equals(that.fdtmCommencementDate));
    equal = equal && (this.fblnExporter == null ? that.fblnExporter == null : this.fblnExporter.equals(that.fblnExporter));
    equal = equal && (this.fblnImporter == null ? that.fblnImporter == null : this.fblnImporter.equals(that.fblnImporter));
    equal = equal && (this.fblnMailReturns == null ? that.fblnMailReturns == null : this.fblnMailReturns.equals(that.fblnMailReturns));
    equal = equal && (this.fblnExemptSupplies == null ? that.fblnExemptSupplies == null : this.fblnExemptSupplies.equals(that.fblnExemptSupplies));
    equal = equal && (this.fblnTaxableActivity == null ? that.fblnTaxableActivity == null : this.fblnTaxableActivity.equals(that.fblnTaxableActivity));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fstrAccountingBasis == null ? that.fstrAccountingBasis == null : this.fstrAccountingBasis.equals(that.fstrAccountingBasis));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_gstreg)) {
      return false;
    }
    tblnz_gstreg that = (tblnz_gstreg) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fi64DocGroupKey == null ? that.fi64DocGroupKey == null : this.fi64DocGroupKey.equals(that.fi64DocGroupKey));
    equal = equal && (this.fblnTurnoverOver60k == null ? that.fblnTurnoverOver60k == null : this.fblnTurnoverOver60k.equals(that.fblnTurnoverOver60k));
    equal = equal && (this.fstrExpectedTurnover == null ? that.fstrExpectedTurnover == null : this.fstrExpectedTurnover.equals(that.fstrExpectedTurnover));
    equal = equal && (this.fstrWhoResponsibleForGST == null ? that.fstrWhoResponsibleForGST == null : this.fstrWhoResponsibleForGST.equals(that.fstrWhoResponsibleForGST));
    equal = equal && (this.fblnNeedsHelp == null ? that.fblnNeedsHelp == null : this.fblnNeedsHelp.equals(that.fblnNeedsHelp));
    equal = equal && (this.fblnNeedsHelpFilingReturns == null ? that.fblnNeedsHelpFilingReturns == null : this.fblnNeedsHelpFilingReturns.equals(that.fblnNeedsHelpFilingReturns));
    equal = equal && (this.fblnNeedsHelpRecordKeeping == null ? that.fblnNeedsHelpRecordKeeping == null : this.fblnNeedsHelpRecordKeeping.equals(that.fblnNeedsHelpRecordKeeping));
    equal = equal && (this.fblnNeedsHelpWhatToClaim == null ? that.fblnNeedsHelpWhatToClaim == null : this.fblnNeedsHelpWhatToClaim.equals(that.fblnNeedsHelpWhatToClaim));
    equal = equal && (this.fdtmCommencementDate == null ? that.fdtmCommencementDate == null : this.fdtmCommencementDate.equals(that.fdtmCommencementDate));
    equal = equal && (this.fblnExporter == null ? that.fblnExporter == null : this.fblnExporter.equals(that.fblnExporter));
    equal = equal && (this.fblnImporter == null ? that.fblnImporter == null : this.fblnImporter.equals(that.fblnImporter));
    equal = equal && (this.fblnMailReturns == null ? that.fblnMailReturns == null : this.fblnMailReturns.equals(that.fblnMailReturns));
    equal = equal && (this.fblnExemptSupplies == null ? that.fblnExemptSupplies == null : this.fblnExemptSupplies.equals(that.fblnExemptSupplies));
    equal = equal && (this.fblnTaxableActivity == null ? that.fblnTaxableActivity == null : this.fblnTaxableActivity.equals(that.fblnTaxableActivity));
    equal = equal && (this.fstrFilingFrequency == null ? that.fstrFilingFrequency == null : this.fstrFilingFrequency.equals(that.fstrFilingFrequency));
    equal = equal && (this.fstrAccountingBasis == null ? that.fstrAccountingBasis == null : this.fstrAccountingBasis.equals(that.fstrAccountingBasis));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fi64DocGroupKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fblnTurnoverOver60k = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExpectedTurnover = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrWhoResponsibleForGST = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnNeedsHelp = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnNeedsHelpFilingReturns = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnNeedsHelpRecordKeeping = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnNeedsHelpWhatToClaim = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmCommencementDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fblnExporter = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnImporter = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnMailReturns = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnExemptSupplies = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnTaxableActivity = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrAccountingBasis = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fi64DocGroupKey = JdbcWritableBridge.readLong(2, __dbResults);
    this.fblnTurnoverOver60k = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fstrExpectedTurnover = JdbcWritableBridge.readString(4, __dbResults);
    this.fstrWhoResponsibleForGST = JdbcWritableBridge.readString(5, __dbResults);
    this.fblnNeedsHelp = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnNeedsHelpFilingReturns = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnNeedsHelpRecordKeeping = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnNeedsHelpWhatToClaim = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fdtmCommencementDate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.fblnExporter = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnImporter = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnMailReturns = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnExemptSupplies = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnTaxableActivity = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fstrFilingFrequency = JdbcWritableBridge.readString(16, __dbResults);
    this.fstrAccountingBasis = JdbcWritableBridge.readString(17, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(18, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(19, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocGroupKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTurnoverOver60k, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrExpectedTurnover, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWhoResponsibleForGST, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelp, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelpFilingReturns, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelpRecordKeeping, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelpWhatToClaim, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommencementDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExporter, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnImporter, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMailReturns, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExemptSupplies, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTaxableActivity, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountingBasis, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
    return 19;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocGroupKey, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTurnoverOver60k, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrExpectedTurnover, 4 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWhoResponsibleForGST, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelp, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelpFilingReturns, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelpRecordKeeping, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnNeedsHelpWhatToClaim, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmCommencementDate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExporter, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnImporter, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMailReturns, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnExemptSupplies, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnTaxableActivity, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrFilingFrequency, 16 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrAccountingBasis, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 18 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 19 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64DocGroupKey = null;
    } else {
    this.fi64DocGroupKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTurnoverOver60k = null;
    } else {
    this.fblnTurnoverOver60k = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrExpectedTurnover = null;
    } else {
    this.fstrExpectedTurnover = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWhoResponsibleForGST = null;
    } else {
    this.fstrWhoResponsibleForGST = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNeedsHelp = null;
    } else {
    this.fblnNeedsHelp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNeedsHelpFilingReturns = null;
    } else {
    this.fblnNeedsHelpFilingReturns = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNeedsHelpRecordKeeping = null;
    } else {
    this.fblnNeedsHelpRecordKeeping = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnNeedsHelpWhatToClaim = null;
    } else {
    this.fblnNeedsHelpWhatToClaim = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmCommencementDate = null;
    } else {
    this.fdtmCommencementDate = new Timestamp(__dataIn.readLong());
    this.fdtmCommencementDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExporter = null;
    } else {
    this.fblnExporter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnImporter = null;
    } else {
    this.fblnImporter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMailReturns = null;
    } else {
    this.fblnMailReturns = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnExemptSupplies = null;
    } else {
    this.fblnExemptSupplies = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnTaxableActivity = null;
    } else {
    this.fblnTaxableActivity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrFilingFrequency = null;
    } else {
    this.fstrFilingFrequency = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrAccountingBasis = null;
    } else {
    this.fstrAccountingBasis = Text.readString(__dataIn);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fi64DocGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocGroupKey);
    }
    if (null == this.fblnTurnoverOver60k) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTurnoverOver60k);
    }
    if (null == this.fstrExpectedTurnover) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExpectedTurnover);
    }
    if (null == this.fstrWhoResponsibleForGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWhoResponsibleForGST);
    }
    if (null == this.fblnNeedsHelp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelp);
    }
    if (null == this.fblnNeedsHelpFilingReturns) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelpFilingReturns);
    }
    if (null == this.fblnNeedsHelpRecordKeeping) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelpRecordKeeping);
    }
    if (null == this.fblnNeedsHelpWhatToClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelpWhatToClaim);
    }
    if (null == this.fdtmCommencementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommencementDate.getTime());
    __dataOut.writeInt(this.fdtmCommencementDate.getNanos());
    }
    if (null == this.fblnExporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExporter);
    }
    if (null == this.fblnImporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnImporter);
    }
    if (null == this.fblnMailReturns) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMailReturns);
    }
    if (null == this.fblnExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExemptSupplies);
    }
    if (null == this.fblnTaxableActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTaxableActivity);
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fstrAccountingBasis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountingBasis);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.fi64DocGroupKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocGroupKey);
    }
    if (null == this.fblnTurnoverOver60k) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTurnoverOver60k);
    }
    if (null == this.fstrExpectedTurnover) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrExpectedTurnover);
    }
    if (null == this.fstrWhoResponsibleForGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWhoResponsibleForGST);
    }
    if (null == this.fblnNeedsHelp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelp);
    }
    if (null == this.fblnNeedsHelpFilingReturns) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelpFilingReturns);
    }
    if (null == this.fblnNeedsHelpRecordKeeping) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelpRecordKeeping);
    }
    if (null == this.fblnNeedsHelpWhatToClaim) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnNeedsHelpWhatToClaim);
    }
    if (null == this.fdtmCommencementDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmCommencementDate.getTime());
    __dataOut.writeInt(this.fdtmCommencementDate.getNanos());
    }
    if (null == this.fblnExporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExporter);
    }
    if (null == this.fblnImporter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnImporter);
    }
    if (null == this.fblnMailReturns) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMailReturns);
    }
    if (null == this.fblnExemptSupplies) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnExemptSupplies);
    }
    if (null == this.fblnTaxableActivity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnTaxableActivity);
    }
    if (null == this.fstrFilingFrequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrFilingFrequency);
    }
    if (null == this.fstrAccountingBasis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrAccountingBasis);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocGroupKey==null?"\\N":"" + fi64DocGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTurnoverOver60k==null?"\\N":"" + fblnTurnoverOver60k, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExpectedTurnover==null?"\\N":fstrExpectedTurnover, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWhoResponsibleForGST==null?"\\N":fstrWhoResponsibleForGST, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelp==null?"\\N":"" + fblnNeedsHelp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelpFilingReturns==null?"\\N":"" + fblnNeedsHelpFilingReturns, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelpRecordKeeping==null?"\\N":"" + fblnNeedsHelpRecordKeeping, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelpWhatToClaim==null?"\\N":"" + fblnNeedsHelpWhatToClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommencementDate==null?"\\N":"" + fdtmCommencementDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExporter==null?"\\N":"" + fblnExporter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnImporter==null?"\\N":"" + fblnImporter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMailReturns==null?"\\N":"" + fblnMailReturns, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExemptSupplies==null?"\\N":"" + fblnExemptSupplies, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTaxableActivity==null?"\\N":"" + fblnTaxableActivity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountingBasis==null?"\\N":fstrAccountingBasis, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocGroupKey==null?"\\N":"" + fi64DocGroupKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTurnoverOver60k==null?"\\N":"" + fblnTurnoverOver60k, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrExpectedTurnover==null?"\\N":fstrExpectedTurnover, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWhoResponsibleForGST==null?"\\N":fstrWhoResponsibleForGST, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelp==null?"\\N":"" + fblnNeedsHelp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelpFilingReturns==null?"\\N":"" + fblnNeedsHelpFilingReturns, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelpRecordKeeping==null?"\\N":"" + fblnNeedsHelpRecordKeeping, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnNeedsHelpWhatToClaim==null?"\\N":"" + fblnNeedsHelpWhatToClaim, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmCommencementDate==null?"\\N":"" + fdtmCommencementDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExporter==null?"\\N":"" + fblnExporter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnImporter==null?"\\N":"" + fblnImporter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMailReturns==null?"\\N":"" + fblnMailReturns, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnExemptSupplies==null?"\\N":"" + fblnExemptSupplies, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnTaxableActivity==null?"\\N":"" + fblnTaxableActivity, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrFilingFrequency==null?"\\N":fstrFilingFrequency, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrAccountingBasis==null?"\\N":fstrAccountingBasis, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocGroupKey = null; } else {
      this.fi64DocGroupKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTurnoverOver60k = null; } else {
      this.fblnTurnoverOver60k = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExpectedTurnover = null; } else {
      this.fstrExpectedTurnover = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWhoResponsibleForGST = null; } else {
      this.fstrWhoResponsibleForGST = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelp = null; } else {
      this.fblnNeedsHelp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelpFilingReturns = null; } else {
      this.fblnNeedsHelpFilingReturns = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelpRecordKeeping = null; } else {
      this.fblnNeedsHelpRecordKeeping = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelpWhatToClaim = null; } else {
      this.fblnNeedsHelpWhatToClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommencementDate = null; } else {
      this.fdtmCommencementDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExporter = null; } else {
      this.fblnExporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnImporter = null; } else {
      this.fblnImporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMailReturns = null; } else {
      this.fblnMailReturns = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExemptSupplies = null; } else {
      this.fblnExemptSupplies = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTaxableActivity = null; } else {
      this.fblnTaxableActivity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountingBasis = null; } else {
      this.fstrAccountingBasis = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocGroupKey = null; } else {
      this.fi64DocGroupKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTurnoverOver60k = null; } else {
      this.fblnTurnoverOver60k = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrExpectedTurnover = null; } else {
      this.fstrExpectedTurnover = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWhoResponsibleForGST = null; } else {
      this.fstrWhoResponsibleForGST = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelp = null; } else {
      this.fblnNeedsHelp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelpFilingReturns = null; } else {
      this.fblnNeedsHelpFilingReturns = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelpRecordKeeping = null; } else {
      this.fblnNeedsHelpRecordKeeping = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnNeedsHelpWhatToClaim = null; } else {
      this.fblnNeedsHelpWhatToClaim = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmCommencementDate = null; } else {
      this.fdtmCommencementDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExporter = null; } else {
      this.fblnExporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnImporter = null; } else {
      this.fblnImporter = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMailReturns = null; } else {
      this.fblnMailReturns = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnExemptSupplies = null; } else {
      this.fblnExemptSupplies = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnTaxableActivity = null; } else {
      this.fblnTaxableActivity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrFilingFrequency = null; } else {
      this.fstrFilingFrequency = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrAccountingBasis = null; } else {
      this.fstrAccountingBasis = __cur_str;
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
    tblnz_gstreg o = (tblnz_gstreg) super.clone();
    o.fdtmCommencementDate = (o.fdtmCommencementDate != null) ? (java.sql.Timestamp) o.fdtmCommencementDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_gstreg o) throws CloneNotSupportedException {
    o.fdtmCommencementDate = (o.fdtmCommencementDate != null) ? (java.sql.Timestamp) o.fdtmCommencementDate.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fi64DocGroupKey", this.fi64DocGroupKey);
    __sqoop$field_map.put("fblnTurnoverOver60k", this.fblnTurnoverOver60k);
    __sqoop$field_map.put("fstrExpectedTurnover", this.fstrExpectedTurnover);
    __sqoop$field_map.put("fstrWhoResponsibleForGST", this.fstrWhoResponsibleForGST);
    __sqoop$field_map.put("fblnNeedsHelp", this.fblnNeedsHelp);
    __sqoop$field_map.put("fblnNeedsHelpFilingReturns", this.fblnNeedsHelpFilingReturns);
    __sqoop$field_map.put("fblnNeedsHelpRecordKeeping", this.fblnNeedsHelpRecordKeeping);
    __sqoop$field_map.put("fblnNeedsHelpWhatToClaim", this.fblnNeedsHelpWhatToClaim);
    __sqoop$field_map.put("fdtmCommencementDate", this.fdtmCommencementDate);
    __sqoop$field_map.put("fblnExporter", this.fblnExporter);
    __sqoop$field_map.put("fblnImporter", this.fblnImporter);
    __sqoop$field_map.put("fblnMailReturns", this.fblnMailReturns);
    __sqoop$field_map.put("fblnExemptSupplies", this.fblnExemptSupplies);
    __sqoop$field_map.put("fblnTaxableActivity", this.fblnTaxableActivity);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fstrAccountingBasis", this.fstrAccountingBasis);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fi64DocGroupKey", this.fi64DocGroupKey);
    __sqoop$field_map.put("fblnTurnoverOver60k", this.fblnTurnoverOver60k);
    __sqoop$field_map.put("fstrExpectedTurnover", this.fstrExpectedTurnover);
    __sqoop$field_map.put("fstrWhoResponsibleForGST", this.fstrWhoResponsibleForGST);
    __sqoop$field_map.put("fblnNeedsHelp", this.fblnNeedsHelp);
    __sqoop$field_map.put("fblnNeedsHelpFilingReturns", this.fblnNeedsHelpFilingReturns);
    __sqoop$field_map.put("fblnNeedsHelpRecordKeeping", this.fblnNeedsHelpRecordKeeping);
    __sqoop$field_map.put("fblnNeedsHelpWhatToClaim", this.fblnNeedsHelpWhatToClaim);
    __sqoop$field_map.put("fdtmCommencementDate", this.fdtmCommencementDate);
    __sqoop$field_map.put("fblnExporter", this.fblnExporter);
    __sqoop$field_map.put("fblnImporter", this.fblnImporter);
    __sqoop$field_map.put("fblnMailReturns", this.fblnMailReturns);
    __sqoop$field_map.put("fblnExemptSupplies", this.fblnExemptSupplies);
    __sqoop$field_map.put("fblnTaxableActivity", this.fblnTaxableActivity);
    __sqoop$field_map.put("fstrFilingFrequency", this.fstrFilingFrequency);
    __sqoop$field_map.put("fstrAccountingBasis", this.fstrAccountingBasis);
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
