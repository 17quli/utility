// ORM class for table 'tblnz_rtnnrtslineitem'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 05:51:59 NZDT 2020
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

public class tblnz_rtnnrtslineitem extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64LineItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fi64LineItemKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fdtmPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fdtmPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRecipientIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientIRD = (String)value;
      }
    });
    setters.put("fstrRecipientStatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientStatus = (String)value;
      }
    });
    setters.put("fdtmRecipientDOB", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fdtmRecipientDOB = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrRecipientSurname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientSurname = (String)value;
      }
    });
    setters.put("fstrRecipientName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientName = (String)value;
      }
    });
    setters.put("fstrRecipientAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientAddress1 = (String)value;
      }
    });
    setters.put("fstrRecipientAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientAddress2 = (String)value;
      }
    });
    setters.put("fstrRecipientAddress3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientAddress3 = (String)value;
      }
    });
    setters.put("fstrRecipientAddress4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientAddress4 = (String)value;
      }
    });
    setters.put("fstrRecipientCountryCode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrRecipientCountryCode = (String)value;
      }
    });
    setters.put("fcurDividendsGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurDividendsGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurInterestGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRoyaltiesGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurRoyaltiesGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherGross", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurOtherGross = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurLiableTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurLiableTotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalLessFDP", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurTotalLessFDP = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurNetNRWTPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurNetNRWTPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendsNRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurDividendsNRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurInterestNRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurInterestNRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRoyaltiesNRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurRoyaltiesNRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurOtherNRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fcurOtherNRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrPayerIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrPayerIRD = (String)value;
      }
    });
    setters.put("fstrPayerName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrPayerName = (String)value;
      }
    });
    setters.put("flngPayerCertificate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.flngPayerCertificate = (Integer)value;
      }
    });
    setters.put("fstrPayerAddress1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrPayerAddress1 = (String)value;
      }
    });
    setters.put("fstrPayerAddress2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrPayerAddress2 = (String)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnnrtslineitem.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnnrtslineitem() {
    init0();
  }
  private Long fi64LineItemKey;
  public Long get_fi64LineItemKey() {
    return fi64LineItemKey;
  }
  public void set_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
  }
  public tblnz_rtnnrtslineitem with_fi64LineItemKey(Long fi64LineItemKey) {
    this.fi64LineItemKey = fi64LineItemKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_rtnnrtslineitem with_flngVer(Integer flngVer) {
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
  public tblnz_rtnnrtslineitem with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private java.sql.Timestamp fdtmPeriod;
  public java.sql.Timestamp get_fdtmPeriod() {
    return fdtmPeriod;
  }
  public void set_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
  }
  public tblnz_rtnnrtslineitem with_fdtmPeriod(java.sql.Timestamp fdtmPeriod) {
    this.fdtmPeriod = fdtmPeriod;
    return this;
  }
  private String fstrRecipientIRD;
  public String get_fstrRecipientIRD() {
    return fstrRecipientIRD;
  }
  public void set_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientIRD(String fstrRecipientIRD) {
    this.fstrRecipientIRD = fstrRecipientIRD;
    return this;
  }
  private String fstrRecipientStatus;
  public String get_fstrRecipientStatus() {
    return fstrRecipientStatus;
  }
  public void set_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientStatus(String fstrRecipientStatus) {
    this.fstrRecipientStatus = fstrRecipientStatus;
    return this;
  }
  private java.sql.Timestamp fdtmRecipientDOB;
  public java.sql.Timestamp get_fdtmRecipientDOB() {
    return fdtmRecipientDOB;
  }
  public void set_fdtmRecipientDOB(java.sql.Timestamp fdtmRecipientDOB) {
    this.fdtmRecipientDOB = fdtmRecipientDOB;
  }
  public tblnz_rtnnrtslineitem with_fdtmRecipientDOB(java.sql.Timestamp fdtmRecipientDOB) {
    this.fdtmRecipientDOB = fdtmRecipientDOB;
    return this;
  }
  private String fstrRecipientSurname;
  public String get_fstrRecipientSurname() {
    return fstrRecipientSurname;
  }
  public void set_fstrRecipientSurname(String fstrRecipientSurname) {
    this.fstrRecipientSurname = fstrRecipientSurname;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientSurname(String fstrRecipientSurname) {
    this.fstrRecipientSurname = fstrRecipientSurname;
    return this;
  }
  private String fstrRecipientName;
  public String get_fstrRecipientName() {
    return fstrRecipientName;
  }
  public void set_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientName(String fstrRecipientName) {
    this.fstrRecipientName = fstrRecipientName;
    return this;
  }
  private String fstrRecipientAddress1;
  public String get_fstrRecipientAddress1() {
    return fstrRecipientAddress1;
  }
  public void set_fstrRecipientAddress1(String fstrRecipientAddress1) {
    this.fstrRecipientAddress1 = fstrRecipientAddress1;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientAddress1(String fstrRecipientAddress1) {
    this.fstrRecipientAddress1 = fstrRecipientAddress1;
    return this;
  }
  private String fstrRecipientAddress2;
  public String get_fstrRecipientAddress2() {
    return fstrRecipientAddress2;
  }
  public void set_fstrRecipientAddress2(String fstrRecipientAddress2) {
    this.fstrRecipientAddress2 = fstrRecipientAddress2;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientAddress2(String fstrRecipientAddress2) {
    this.fstrRecipientAddress2 = fstrRecipientAddress2;
    return this;
  }
  private String fstrRecipientAddress3;
  public String get_fstrRecipientAddress3() {
    return fstrRecipientAddress3;
  }
  public void set_fstrRecipientAddress3(String fstrRecipientAddress3) {
    this.fstrRecipientAddress3 = fstrRecipientAddress3;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientAddress3(String fstrRecipientAddress3) {
    this.fstrRecipientAddress3 = fstrRecipientAddress3;
    return this;
  }
  private String fstrRecipientAddress4;
  public String get_fstrRecipientAddress4() {
    return fstrRecipientAddress4;
  }
  public void set_fstrRecipientAddress4(String fstrRecipientAddress4) {
    this.fstrRecipientAddress4 = fstrRecipientAddress4;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientAddress4(String fstrRecipientAddress4) {
    this.fstrRecipientAddress4 = fstrRecipientAddress4;
    return this;
  }
  private String fstrRecipientCountryCode;
  public String get_fstrRecipientCountryCode() {
    return fstrRecipientCountryCode;
  }
  public void set_fstrRecipientCountryCode(String fstrRecipientCountryCode) {
    this.fstrRecipientCountryCode = fstrRecipientCountryCode;
  }
  public tblnz_rtnnrtslineitem with_fstrRecipientCountryCode(String fstrRecipientCountryCode) {
    this.fstrRecipientCountryCode = fstrRecipientCountryCode;
    return this;
  }
  private java.math.BigDecimal fcurDividendsGross;
  public java.math.BigDecimal get_fcurDividendsGross() {
    return fcurDividendsGross;
  }
  public void set_fcurDividendsGross(java.math.BigDecimal fcurDividendsGross) {
    this.fcurDividendsGross = fcurDividendsGross;
  }
  public tblnz_rtnnrtslineitem with_fcurDividendsGross(java.math.BigDecimal fcurDividendsGross) {
    this.fcurDividendsGross = fcurDividendsGross;
    return this;
  }
  private java.math.BigDecimal fcurInterestGross;
  public java.math.BigDecimal get_fcurInterestGross() {
    return fcurInterestGross;
  }
  public void set_fcurInterestGross(java.math.BigDecimal fcurInterestGross) {
    this.fcurInterestGross = fcurInterestGross;
  }
  public tblnz_rtnnrtslineitem with_fcurInterestGross(java.math.BigDecimal fcurInterestGross) {
    this.fcurInterestGross = fcurInterestGross;
    return this;
  }
  private java.math.BigDecimal fcurRoyaltiesGross;
  public java.math.BigDecimal get_fcurRoyaltiesGross() {
    return fcurRoyaltiesGross;
  }
  public void set_fcurRoyaltiesGross(java.math.BigDecimal fcurRoyaltiesGross) {
    this.fcurRoyaltiesGross = fcurRoyaltiesGross;
  }
  public tblnz_rtnnrtslineitem with_fcurRoyaltiesGross(java.math.BigDecimal fcurRoyaltiesGross) {
    this.fcurRoyaltiesGross = fcurRoyaltiesGross;
    return this;
  }
  private java.math.BigDecimal fcurOtherGross;
  public java.math.BigDecimal get_fcurOtherGross() {
    return fcurOtherGross;
  }
  public void set_fcurOtherGross(java.math.BigDecimal fcurOtherGross) {
    this.fcurOtherGross = fcurOtherGross;
  }
  public tblnz_rtnnrtslineitem with_fcurOtherGross(java.math.BigDecimal fcurOtherGross) {
    this.fcurOtherGross = fcurOtherGross;
    return this;
  }
  private java.math.BigDecimal fcurLiableTotal;
  public java.math.BigDecimal get_fcurLiableTotal() {
    return fcurLiableTotal;
  }
  public void set_fcurLiableTotal(java.math.BigDecimal fcurLiableTotal) {
    this.fcurLiableTotal = fcurLiableTotal;
  }
  public tblnz_rtnnrtslineitem with_fcurLiableTotal(java.math.BigDecimal fcurLiableTotal) {
    this.fcurLiableTotal = fcurLiableTotal;
    return this;
  }
  private java.math.BigDecimal fcurTotalLessFDP;
  public java.math.BigDecimal get_fcurTotalLessFDP() {
    return fcurTotalLessFDP;
  }
  public void set_fcurTotalLessFDP(java.math.BigDecimal fcurTotalLessFDP) {
    this.fcurTotalLessFDP = fcurTotalLessFDP;
  }
  public tblnz_rtnnrtslineitem with_fcurTotalLessFDP(java.math.BigDecimal fcurTotalLessFDP) {
    this.fcurTotalLessFDP = fcurTotalLessFDP;
    return this;
  }
  private java.math.BigDecimal fcurNetNRWTPaid;
  public java.math.BigDecimal get_fcurNetNRWTPaid() {
    return fcurNetNRWTPaid;
  }
  public void set_fcurNetNRWTPaid(java.math.BigDecimal fcurNetNRWTPaid) {
    this.fcurNetNRWTPaid = fcurNetNRWTPaid;
  }
  public tblnz_rtnnrtslineitem with_fcurNetNRWTPaid(java.math.BigDecimal fcurNetNRWTPaid) {
    this.fcurNetNRWTPaid = fcurNetNRWTPaid;
    return this;
  }
  private java.math.BigDecimal fcurDividendsNRWT;
  public java.math.BigDecimal get_fcurDividendsNRWT() {
    return fcurDividendsNRWT;
  }
  public void set_fcurDividendsNRWT(java.math.BigDecimal fcurDividendsNRWT) {
    this.fcurDividendsNRWT = fcurDividendsNRWT;
  }
  public tblnz_rtnnrtslineitem with_fcurDividendsNRWT(java.math.BigDecimal fcurDividendsNRWT) {
    this.fcurDividendsNRWT = fcurDividendsNRWT;
    return this;
  }
  private java.math.BigDecimal fcurInterestNRWT;
  public java.math.BigDecimal get_fcurInterestNRWT() {
    return fcurInterestNRWT;
  }
  public void set_fcurInterestNRWT(java.math.BigDecimal fcurInterestNRWT) {
    this.fcurInterestNRWT = fcurInterestNRWT;
  }
  public tblnz_rtnnrtslineitem with_fcurInterestNRWT(java.math.BigDecimal fcurInterestNRWT) {
    this.fcurInterestNRWT = fcurInterestNRWT;
    return this;
  }
  private java.math.BigDecimal fcurRoyaltiesNRWT;
  public java.math.BigDecimal get_fcurRoyaltiesNRWT() {
    return fcurRoyaltiesNRWT;
  }
  public void set_fcurRoyaltiesNRWT(java.math.BigDecimal fcurRoyaltiesNRWT) {
    this.fcurRoyaltiesNRWT = fcurRoyaltiesNRWT;
  }
  public tblnz_rtnnrtslineitem with_fcurRoyaltiesNRWT(java.math.BigDecimal fcurRoyaltiesNRWT) {
    this.fcurRoyaltiesNRWT = fcurRoyaltiesNRWT;
    return this;
  }
  private java.math.BigDecimal fcurOtherNRWT;
  public java.math.BigDecimal get_fcurOtherNRWT() {
    return fcurOtherNRWT;
  }
  public void set_fcurOtherNRWT(java.math.BigDecimal fcurOtherNRWT) {
    this.fcurOtherNRWT = fcurOtherNRWT;
  }
  public tblnz_rtnnrtslineitem with_fcurOtherNRWT(java.math.BigDecimal fcurOtherNRWT) {
    this.fcurOtherNRWT = fcurOtherNRWT;
    return this;
  }
  private String fstrPayerIRD;
  public String get_fstrPayerIRD() {
    return fstrPayerIRD;
  }
  public void set_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
  }
  public tblnz_rtnnrtslineitem with_fstrPayerIRD(String fstrPayerIRD) {
    this.fstrPayerIRD = fstrPayerIRD;
    return this;
  }
  private String fstrPayerName;
  public String get_fstrPayerName() {
    return fstrPayerName;
  }
  public void set_fstrPayerName(String fstrPayerName) {
    this.fstrPayerName = fstrPayerName;
  }
  public tblnz_rtnnrtslineitem with_fstrPayerName(String fstrPayerName) {
    this.fstrPayerName = fstrPayerName;
    return this;
  }
  private Integer flngPayerCertificate;
  public Integer get_flngPayerCertificate() {
    return flngPayerCertificate;
  }
  public void set_flngPayerCertificate(Integer flngPayerCertificate) {
    this.flngPayerCertificate = flngPayerCertificate;
  }
  public tblnz_rtnnrtslineitem with_flngPayerCertificate(Integer flngPayerCertificate) {
    this.flngPayerCertificate = flngPayerCertificate;
    return this;
  }
  private String fstrPayerAddress1;
  public String get_fstrPayerAddress1() {
    return fstrPayerAddress1;
  }
  public void set_fstrPayerAddress1(String fstrPayerAddress1) {
    this.fstrPayerAddress1 = fstrPayerAddress1;
  }
  public tblnz_rtnnrtslineitem with_fstrPayerAddress1(String fstrPayerAddress1) {
    this.fstrPayerAddress1 = fstrPayerAddress1;
    return this;
  }
  private String fstrPayerAddress2;
  public String get_fstrPayerAddress2() {
    return fstrPayerAddress2;
  }
  public void set_fstrPayerAddress2(String fstrPayerAddress2) {
    this.fstrPayerAddress2 = fstrPayerAddress2;
  }
  public tblnz_rtnnrtslineitem with_fstrPayerAddress2(String fstrPayerAddress2) {
    this.fstrPayerAddress2 = fstrPayerAddress2;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnnrtslineitem with_fstrWho(String fstrWho) {
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
  public tblnz_rtnnrtslineitem with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnrtslineitem)) {
      return false;
    }
    tblnz_rtnnrtslineitem that = (tblnz_rtnnrtslineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fdtmRecipientDOB == null ? that.fdtmRecipientDOB == null : this.fdtmRecipientDOB.equals(that.fdtmRecipientDOB));
    equal = equal && (this.fstrRecipientSurname == null ? that.fstrRecipientSurname == null : this.fstrRecipientSurname.equals(that.fstrRecipientSurname));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientAddress1 == null ? that.fstrRecipientAddress1 == null : this.fstrRecipientAddress1.equals(that.fstrRecipientAddress1));
    equal = equal && (this.fstrRecipientAddress2 == null ? that.fstrRecipientAddress2 == null : this.fstrRecipientAddress2.equals(that.fstrRecipientAddress2));
    equal = equal && (this.fstrRecipientAddress3 == null ? that.fstrRecipientAddress3 == null : this.fstrRecipientAddress3.equals(that.fstrRecipientAddress3));
    equal = equal && (this.fstrRecipientAddress4 == null ? that.fstrRecipientAddress4 == null : this.fstrRecipientAddress4.equals(that.fstrRecipientAddress4));
    equal = equal && (this.fstrRecipientCountryCode == null ? that.fstrRecipientCountryCode == null : this.fstrRecipientCountryCode.equals(that.fstrRecipientCountryCode));
    equal = equal && (this.fcurDividendsGross == null ? that.fcurDividendsGross == null : this.fcurDividendsGross.equals(that.fcurDividendsGross));
    equal = equal && (this.fcurInterestGross == null ? that.fcurInterestGross == null : this.fcurInterestGross.equals(that.fcurInterestGross));
    equal = equal && (this.fcurRoyaltiesGross == null ? that.fcurRoyaltiesGross == null : this.fcurRoyaltiesGross.equals(that.fcurRoyaltiesGross));
    equal = equal && (this.fcurOtherGross == null ? that.fcurOtherGross == null : this.fcurOtherGross.equals(that.fcurOtherGross));
    equal = equal && (this.fcurLiableTotal == null ? that.fcurLiableTotal == null : this.fcurLiableTotal.equals(that.fcurLiableTotal));
    equal = equal && (this.fcurTotalLessFDP == null ? that.fcurTotalLessFDP == null : this.fcurTotalLessFDP.equals(that.fcurTotalLessFDP));
    equal = equal && (this.fcurNetNRWTPaid == null ? that.fcurNetNRWTPaid == null : this.fcurNetNRWTPaid.equals(that.fcurNetNRWTPaid));
    equal = equal && (this.fcurDividendsNRWT == null ? that.fcurDividendsNRWT == null : this.fcurDividendsNRWT.equals(that.fcurDividendsNRWT));
    equal = equal && (this.fcurInterestNRWT == null ? that.fcurInterestNRWT == null : this.fcurInterestNRWT.equals(that.fcurInterestNRWT));
    equal = equal && (this.fcurRoyaltiesNRWT == null ? that.fcurRoyaltiesNRWT == null : this.fcurRoyaltiesNRWT.equals(that.fcurRoyaltiesNRWT));
    equal = equal && (this.fcurOtherNRWT == null ? that.fcurOtherNRWT == null : this.fcurOtherNRWT.equals(that.fcurOtherNRWT));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.fstrPayerName == null ? that.fstrPayerName == null : this.fstrPayerName.equals(that.fstrPayerName));
    equal = equal && (this.flngPayerCertificate == null ? that.flngPayerCertificate == null : this.flngPayerCertificate.equals(that.flngPayerCertificate));
    equal = equal && (this.fstrPayerAddress1 == null ? that.fstrPayerAddress1 == null : this.fstrPayerAddress1.equals(that.fstrPayerAddress1));
    equal = equal && (this.fstrPayerAddress2 == null ? that.fstrPayerAddress2 == null : this.fstrPayerAddress2.equals(that.fstrPayerAddress2));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnnrtslineitem)) {
      return false;
    }
    tblnz_rtnnrtslineitem that = (tblnz_rtnnrtslineitem) o;
    boolean equal = true;
    equal = equal && (this.fi64LineItemKey == null ? that.fi64LineItemKey == null : this.fi64LineItemKey.equals(that.fi64LineItemKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fdtmPeriod == null ? that.fdtmPeriod == null : this.fdtmPeriod.equals(that.fdtmPeriod));
    equal = equal && (this.fstrRecipientIRD == null ? that.fstrRecipientIRD == null : this.fstrRecipientIRD.equals(that.fstrRecipientIRD));
    equal = equal && (this.fstrRecipientStatus == null ? that.fstrRecipientStatus == null : this.fstrRecipientStatus.equals(that.fstrRecipientStatus));
    equal = equal && (this.fdtmRecipientDOB == null ? that.fdtmRecipientDOB == null : this.fdtmRecipientDOB.equals(that.fdtmRecipientDOB));
    equal = equal && (this.fstrRecipientSurname == null ? that.fstrRecipientSurname == null : this.fstrRecipientSurname.equals(that.fstrRecipientSurname));
    equal = equal && (this.fstrRecipientName == null ? that.fstrRecipientName == null : this.fstrRecipientName.equals(that.fstrRecipientName));
    equal = equal && (this.fstrRecipientAddress1 == null ? that.fstrRecipientAddress1 == null : this.fstrRecipientAddress1.equals(that.fstrRecipientAddress1));
    equal = equal && (this.fstrRecipientAddress2 == null ? that.fstrRecipientAddress2 == null : this.fstrRecipientAddress2.equals(that.fstrRecipientAddress2));
    equal = equal && (this.fstrRecipientAddress3 == null ? that.fstrRecipientAddress3 == null : this.fstrRecipientAddress3.equals(that.fstrRecipientAddress3));
    equal = equal && (this.fstrRecipientAddress4 == null ? that.fstrRecipientAddress4 == null : this.fstrRecipientAddress4.equals(that.fstrRecipientAddress4));
    equal = equal && (this.fstrRecipientCountryCode == null ? that.fstrRecipientCountryCode == null : this.fstrRecipientCountryCode.equals(that.fstrRecipientCountryCode));
    equal = equal && (this.fcurDividendsGross == null ? that.fcurDividendsGross == null : this.fcurDividendsGross.equals(that.fcurDividendsGross));
    equal = equal && (this.fcurInterestGross == null ? that.fcurInterestGross == null : this.fcurInterestGross.equals(that.fcurInterestGross));
    equal = equal && (this.fcurRoyaltiesGross == null ? that.fcurRoyaltiesGross == null : this.fcurRoyaltiesGross.equals(that.fcurRoyaltiesGross));
    equal = equal && (this.fcurOtherGross == null ? that.fcurOtherGross == null : this.fcurOtherGross.equals(that.fcurOtherGross));
    equal = equal && (this.fcurLiableTotal == null ? that.fcurLiableTotal == null : this.fcurLiableTotal.equals(that.fcurLiableTotal));
    equal = equal && (this.fcurTotalLessFDP == null ? that.fcurTotalLessFDP == null : this.fcurTotalLessFDP.equals(that.fcurTotalLessFDP));
    equal = equal && (this.fcurNetNRWTPaid == null ? that.fcurNetNRWTPaid == null : this.fcurNetNRWTPaid.equals(that.fcurNetNRWTPaid));
    equal = equal && (this.fcurDividendsNRWT == null ? that.fcurDividendsNRWT == null : this.fcurDividendsNRWT.equals(that.fcurDividendsNRWT));
    equal = equal && (this.fcurInterestNRWT == null ? that.fcurInterestNRWT == null : this.fcurInterestNRWT.equals(that.fcurInterestNRWT));
    equal = equal && (this.fcurRoyaltiesNRWT == null ? that.fcurRoyaltiesNRWT == null : this.fcurRoyaltiesNRWT.equals(that.fcurRoyaltiesNRWT));
    equal = equal && (this.fcurOtherNRWT == null ? that.fcurOtherNRWT == null : this.fcurOtherNRWT.equals(that.fcurOtherNRWT));
    equal = equal && (this.fstrPayerIRD == null ? that.fstrPayerIRD == null : this.fstrPayerIRD.equals(that.fstrPayerIRD));
    equal = equal && (this.fstrPayerName == null ? that.fstrPayerName == null : this.fstrPayerName.equals(that.fstrPayerName));
    equal = equal && (this.flngPayerCertificate == null ? that.flngPayerCertificate == null : this.flngPayerCertificate.equals(that.flngPayerCertificate));
    equal = equal && (this.fstrPayerAddress1 == null ? that.fstrPayerAddress1 == null : this.fstrPayerAddress1.equals(that.fstrPayerAddress1));
    equal = equal && (this.fstrPayerAddress2 == null ? that.fstrPayerAddress2 == null : this.fstrPayerAddress2.equals(that.fstrPayerAddress2));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmRecipientDOB = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrRecipientSurname = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrRecipientAddress1 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrRecipientAddress2 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrRecipientAddress3 = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrRecipientAddress4 = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrRecipientCountryCode = JdbcWritableBridge.readString(14, __dbResults);
    this.fcurDividendsGross = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInterestGross = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurRoyaltiesGross = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOtherGross = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurLiableTotal = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalLessFDP = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurNetNRWTPaid = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurDividendsNRWT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurInterestNRWT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurRoyaltiesNRWT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurOtherNRWT = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrPayerName = JdbcWritableBridge.readString(27, __dbResults);
    this.flngPayerCertificate = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrPayerAddress1 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrPayerAddress2 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(31, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(32, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64LineItemKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fdtmPeriod = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.fstrRecipientIRD = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrRecipientStatus = JdbcWritableBridge.readString(6, __dbResults);
    this.fdtmRecipientDOB = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fstrRecipientSurname = JdbcWritableBridge.readString(8, __dbResults);
    this.fstrRecipientName = JdbcWritableBridge.readString(9, __dbResults);
    this.fstrRecipientAddress1 = JdbcWritableBridge.readString(10, __dbResults);
    this.fstrRecipientAddress2 = JdbcWritableBridge.readString(11, __dbResults);
    this.fstrRecipientAddress3 = JdbcWritableBridge.readString(12, __dbResults);
    this.fstrRecipientAddress4 = JdbcWritableBridge.readString(13, __dbResults);
    this.fstrRecipientCountryCode = JdbcWritableBridge.readString(14, __dbResults);
    this.fcurDividendsGross = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurInterestGross = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurRoyaltiesGross = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurOtherGross = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurLiableTotal = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurTotalLessFDP = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurNetNRWTPaid = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurDividendsNRWT = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurInterestNRWT = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurRoyaltiesNRWT = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurOtherNRWT = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fstrPayerIRD = JdbcWritableBridge.readString(26, __dbResults);
    this.fstrPayerName = JdbcWritableBridge.readString(27, __dbResults);
    this.flngPayerCertificate = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrPayerAddress1 = JdbcWritableBridge.readString(29, __dbResults);
    this.fstrPayerAddress2 = JdbcWritableBridge.readString(30, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(31, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(32, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRecipientDOB, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientSurname, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress1, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress2, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress3, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress4, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCountryCode, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsGross, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestGross, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRoyaltiesGross, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherGross, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLiableTotal, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLessFDP, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetNRWTPaid, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsNRWT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestNRWT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRoyaltiesNRWT, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherNRWT, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerName, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPayerCertificate, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress1, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress2, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 32 + __off, 93, __dbStmt);
    return 32;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64LineItemKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmPeriod, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientIRD, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientStatus, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmRecipientDOB, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientSurname, 8 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientName, 9 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress1, 10 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress2, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress3, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientAddress4, 13 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrRecipientCountryCode, 14 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsGross, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestGross, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRoyaltiesGross, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherGross, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurLiableTotal, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalLessFDP, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurNetNRWTPaid, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsNRWT, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurInterestNRWT, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRoyaltiesNRWT, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurOtherNRWT, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerIRD, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerName, 27 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(flngPayerCertificate, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress1, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrPayerAddress2, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 31 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 32 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64LineItemKey = null;
    } else {
    this.fi64LineItemKey = Long.valueOf(__dataIn.readLong());
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
        this.fdtmPeriod = null;
    } else {
    this.fdtmPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientIRD = null;
    } else {
    this.fstrRecipientIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientStatus = null;
    } else {
    this.fstrRecipientStatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmRecipientDOB = null;
    } else {
    this.fdtmRecipientDOB = new Timestamp(__dataIn.readLong());
    this.fdtmRecipientDOB.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientSurname = null;
    } else {
    this.fstrRecipientSurname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientName = null;
    } else {
    this.fstrRecipientName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress1 = null;
    } else {
    this.fstrRecipientAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress2 = null;
    } else {
    this.fstrRecipientAddress2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress3 = null;
    } else {
    this.fstrRecipientAddress3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientAddress4 = null;
    } else {
    this.fstrRecipientAddress4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrRecipientCountryCode = null;
    } else {
    this.fstrRecipientCountryCode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendsGross = null;
    } else {
    this.fcurDividendsGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestGross = null;
    } else {
    this.fcurInterestGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRoyaltiesGross = null;
    } else {
    this.fcurRoyaltiesGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherGross = null;
    } else {
    this.fcurOtherGross = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurLiableTotal = null;
    } else {
    this.fcurLiableTotal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalLessFDP = null;
    } else {
    this.fcurTotalLessFDP = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurNetNRWTPaid = null;
    } else {
    this.fcurNetNRWTPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendsNRWT = null;
    } else {
    this.fcurDividendsNRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurInterestNRWT = null;
    } else {
    this.fcurInterestNRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRoyaltiesNRWT = null;
    } else {
    this.fcurRoyaltiesNRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurOtherNRWT = null;
    } else {
    this.fcurOtherNRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerIRD = null;
    } else {
    this.fstrPayerIRD = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerName = null;
    } else {
    this.fstrPayerName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flngPayerCertificate = null;
    } else {
    this.flngPayerCertificate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerAddress1 = null;
    } else {
    this.fstrPayerAddress1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrPayerAddress2 = null;
    } else {
    this.fstrPayerAddress2 = Text.readString(__dataIn);
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fdtmRecipientDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRecipientDOB.getTime());
    __dataOut.writeInt(this.fdtmRecipientDOB.getNanos());
    }
    if (null == this.fstrRecipientSurname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientSurname);
    }
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress1);
    }
    if (null == this.fstrRecipientAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress2);
    }
    if (null == this.fstrRecipientAddress3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress3);
    }
    if (null == this.fstrRecipientAddress4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress4);
    }
    if (null == this.fstrRecipientCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCountryCode);
    }
    if (null == this.fcurDividendsGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsGross, __dataOut);
    }
    if (null == this.fcurInterestGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestGross, __dataOut);
    }
    if (null == this.fcurRoyaltiesGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRoyaltiesGross, __dataOut);
    }
    if (null == this.fcurOtherGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherGross, __dataOut);
    }
    if (null == this.fcurLiableTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLiableTotal, __dataOut);
    }
    if (null == this.fcurTotalLessFDP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLessFDP, __dataOut);
    }
    if (null == this.fcurNetNRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetNRWTPaid, __dataOut);
    }
    if (null == this.fcurDividendsNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsNRWT, __dataOut);
    }
    if (null == this.fcurInterestNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestNRWT, __dataOut);
    }
    if (null == this.fcurRoyaltiesNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRoyaltiesNRWT, __dataOut);
    }
    if (null == this.fcurOtherNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherNRWT, __dataOut);
    }
    if (null == this.fstrPayerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerIRD);
    }
    if (null == this.fstrPayerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerName);
    }
    if (null == this.flngPayerCertificate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPayerCertificate);
    }
    if (null == this.fstrPayerAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress1);
    }
    if (null == this.fstrPayerAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress2);
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
    if (null == this.fi64LineItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64LineItemKey);
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
    if (null == this.fdtmPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmPeriod.getTime());
    __dataOut.writeInt(this.fdtmPeriod.getNanos());
    }
    if (null == this.fstrRecipientIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientIRD);
    }
    if (null == this.fstrRecipientStatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientStatus);
    }
    if (null == this.fdtmRecipientDOB) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmRecipientDOB.getTime());
    __dataOut.writeInt(this.fdtmRecipientDOB.getNanos());
    }
    if (null == this.fstrRecipientSurname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientSurname);
    }
    if (null == this.fstrRecipientName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientName);
    }
    if (null == this.fstrRecipientAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress1);
    }
    if (null == this.fstrRecipientAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress2);
    }
    if (null == this.fstrRecipientAddress3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress3);
    }
    if (null == this.fstrRecipientAddress4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientAddress4);
    }
    if (null == this.fstrRecipientCountryCode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrRecipientCountryCode);
    }
    if (null == this.fcurDividendsGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsGross, __dataOut);
    }
    if (null == this.fcurInterestGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestGross, __dataOut);
    }
    if (null == this.fcurRoyaltiesGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRoyaltiesGross, __dataOut);
    }
    if (null == this.fcurOtherGross) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherGross, __dataOut);
    }
    if (null == this.fcurLiableTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurLiableTotal, __dataOut);
    }
    if (null == this.fcurTotalLessFDP) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalLessFDP, __dataOut);
    }
    if (null == this.fcurNetNRWTPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurNetNRWTPaid, __dataOut);
    }
    if (null == this.fcurDividendsNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsNRWT, __dataOut);
    }
    if (null == this.fcurInterestNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurInterestNRWT, __dataOut);
    }
    if (null == this.fcurRoyaltiesNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRoyaltiesNRWT, __dataOut);
    }
    if (null == this.fcurOtherNRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurOtherNRWT, __dataOut);
    }
    if (null == this.fstrPayerIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerIRD);
    }
    if (null == this.fstrPayerName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerName);
    }
    if (null == this.flngPayerCertificate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngPayerCertificate);
    }
    if (null == this.fstrPayerAddress1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress1);
    }
    if (null == this.fstrPayerAddress2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrPayerAddress2);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRecipientDOB==null?"\\N":"" + fdtmRecipientDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientSurname==null?"\\N":fstrRecipientSurname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress1==null?"\\N":fstrRecipientAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress2==null?"\\N":fstrRecipientAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress3==null?"\\N":fstrRecipientAddress3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress4==null?"\\N":fstrRecipientAddress4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCountryCode==null?"\\N":fstrRecipientCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsGross==null?"\\N":fcurDividendsGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestGross==null?"\\N":fcurInterestGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRoyaltiesGross==null?"\\N":fcurRoyaltiesGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherGross==null?"\\N":fcurOtherGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLiableTotal==null?"\\N":fcurLiableTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLessFDP==null?"\\N":fcurTotalLessFDP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetNRWTPaid==null?"\\N":fcurNetNRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsNRWT==null?"\\N":fcurDividendsNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestNRWT==null?"\\N":fcurInterestNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRoyaltiesNRWT==null?"\\N":fcurRoyaltiesNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherNRWT==null?"\\N":fcurOtherNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerIRD==null?"\\N":fstrPayerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerName==null?"\\N":fstrPayerName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPayerCertificate==null?"\\N":"" + flngPayerCertificate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress1==null?"\\N":fstrPayerAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress2==null?"\\N":fstrPayerAddress2, " ", delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64LineItemKey==null?"\\N":"" + fi64LineItemKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmPeriod==null?"\\N":"" + fdtmPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientIRD==null?"\\N":fstrRecipientIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientStatus==null?"\\N":fstrRecipientStatus, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmRecipientDOB==null?"\\N":"" + fdtmRecipientDOB, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientSurname==null?"\\N":fstrRecipientSurname, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientName==null?"\\N":fstrRecipientName, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress1==null?"\\N":fstrRecipientAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress2==null?"\\N":fstrRecipientAddress2, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress3==null?"\\N":fstrRecipientAddress3, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientAddress4==null?"\\N":fstrRecipientAddress4, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrRecipientCountryCode==null?"\\N":fstrRecipientCountryCode, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsGross==null?"\\N":fcurDividendsGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestGross==null?"\\N":fcurInterestGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRoyaltiesGross==null?"\\N":fcurRoyaltiesGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherGross==null?"\\N":fcurOtherGross.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurLiableTotal==null?"\\N":fcurLiableTotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalLessFDP==null?"\\N":fcurTotalLessFDP.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurNetNRWTPaid==null?"\\N":fcurNetNRWTPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsNRWT==null?"\\N":fcurDividendsNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurInterestNRWT==null?"\\N":fcurInterestNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRoyaltiesNRWT==null?"\\N":fcurRoyaltiesNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurOtherNRWT==null?"\\N":fcurOtherNRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerIRD==null?"\\N":fstrPayerIRD, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerName==null?"\\N":fstrPayerName, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngPayerCertificate==null?"\\N":"" + flngPayerCertificate, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress1==null?"\\N":fstrPayerAddress1, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrPayerAddress2==null?"\\N":fstrPayerAddress2, " ", delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRecipientDOB = null; } else {
      this.fdtmRecipientDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientSurname = null; } else {
      this.fstrRecipientSurname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress1 = null; } else {
      this.fstrRecipientAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress2 = null; } else {
      this.fstrRecipientAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress3 = null; } else {
      this.fstrRecipientAddress3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress4 = null; } else {
      this.fstrRecipientAddress4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCountryCode = null; } else {
      this.fstrRecipientCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsGross = null; } else {
      this.fcurDividendsGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestGross = null; } else {
      this.fcurInterestGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRoyaltiesGross = null; } else {
      this.fcurRoyaltiesGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherGross = null; } else {
      this.fcurOtherGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLiableTotal = null; } else {
      this.fcurLiableTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLessFDP = null; } else {
      this.fcurTotalLessFDP = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetNRWTPaid = null; } else {
      this.fcurNetNRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsNRWT = null; } else {
      this.fcurDividendsNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestNRWT = null; } else {
      this.fcurInterestNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRoyaltiesNRWT = null; } else {
      this.fcurRoyaltiesNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherNRWT = null; } else {
      this.fcurOtherNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerIRD = null; } else {
      this.fstrPayerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerName = null; } else {
      this.fstrPayerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPayerCertificate = null; } else {
      this.flngPayerCertificate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress1 = null; } else {
      this.fstrPayerAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress2 = null; } else {
      this.fstrPayerAddress2 = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64LineItemKey = null; } else {
      this.fi64LineItemKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmPeriod = null; } else {
      this.fdtmPeriod = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrRecipientStatus = null; } else {
      this.fstrRecipientStatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmRecipientDOB = null; } else {
      this.fdtmRecipientDOB = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientSurname = null; } else {
      this.fstrRecipientSurname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientName = null; } else {
      this.fstrRecipientName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress1 = null; } else {
      this.fstrRecipientAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress2 = null; } else {
      this.fstrRecipientAddress2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress3 = null; } else {
      this.fstrRecipientAddress3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientAddress4 = null; } else {
      this.fstrRecipientAddress4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrRecipientCountryCode = null; } else {
      this.fstrRecipientCountryCode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsGross = null; } else {
      this.fcurDividendsGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestGross = null; } else {
      this.fcurInterestGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRoyaltiesGross = null; } else {
      this.fcurRoyaltiesGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherGross = null; } else {
      this.fcurOtherGross = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurLiableTotal = null; } else {
      this.fcurLiableTotal = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalLessFDP = null; } else {
      this.fcurTotalLessFDP = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurNetNRWTPaid = null; } else {
      this.fcurNetNRWTPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsNRWT = null; } else {
      this.fcurDividendsNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurInterestNRWT = null; } else {
      this.fcurInterestNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRoyaltiesNRWT = null; } else {
      this.fcurRoyaltiesNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurOtherNRWT = null; } else {
      this.fcurOtherNRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerIRD = null; } else {
      this.fstrPayerIRD = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerName = null; } else {
      this.fstrPayerName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngPayerCertificate = null; } else {
      this.flngPayerCertificate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress1 = null; } else {
      this.fstrPayerAddress1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrPayerAddress2 = null; } else {
      this.fstrPayerAddress2 = __cur_str;
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
    tblnz_rtnnrtslineitem o = (tblnz_rtnnrtslineitem) super.clone();
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmRecipientDOB = (o.fdtmRecipientDOB != null) ? (java.sql.Timestamp) o.fdtmRecipientDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnnrtslineitem o) throws CloneNotSupportedException {
    o.fdtmPeriod = (o.fdtmPeriod != null) ? (java.sql.Timestamp) o.fdtmPeriod.clone() : null;
    o.fdtmRecipientDOB = (o.fdtmRecipientDOB != null) ? (java.sql.Timestamp) o.fdtmRecipientDOB.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fdtmRecipientDOB", this.fdtmRecipientDOB);
    __sqoop$field_map.put("fstrRecipientSurname", this.fstrRecipientSurname);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientAddress1", this.fstrRecipientAddress1);
    __sqoop$field_map.put("fstrRecipientAddress2", this.fstrRecipientAddress2);
    __sqoop$field_map.put("fstrRecipientAddress3", this.fstrRecipientAddress3);
    __sqoop$field_map.put("fstrRecipientAddress4", this.fstrRecipientAddress4);
    __sqoop$field_map.put("fstrRecipientCountryCode", this.fstrRecipientCountryCode);
    __sqoop$field_map.put("fcurDividendsGross", this.fcurDividendsGross);
    __sqoop$field_map.put("fcurInterestGross", this.fcurInterestGross);
    __sqoop$field_map.put("fcurRoyaltiesGross", this.fcurRoyaltiesGross);
    __sqoop$field_map.put("fcurOtherGross", this.fcurOtherGross);
    __sqoop$field_map.put("fcurLiableTotal", this.fcurLiableTotal);
    __sqoop$field_map.put("fcurTotalLessFDP", this.fcurTotalLessFDP);
    __sqoop$field_map.put("fcurNetNRWTPaid", this.fcurNetNRWTPaid);
    __sqoop$field_map.put("fcurDividendsNRWT", this.fcurDividendsNRWT);
    __sqoop$field_map.put("fcurInterestNRWT", this.fcurInterestNRWT);
    __sqoop$field_map.put("fcurRoyaltiesNRWT", this.fcurRoyaltiesNRWT);
    __sqoop$field_map.put("fcurOtherNRWT", this.fcurOtherNRWT);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("fstrPayerName", this.fstrPayerName);
    __sqoop$field_map.put("flngPayerCertificate", this.flngPayerCertificate);
    __sqoop$field_map.put("fstrPayerAddress1", this.fstrPayerAddress1);
    __sqoop$field_map.put("fstrPayerAddress2", this.fstrPayerAddress2);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64LineItemKey", this.fi64LineItemKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fdtmPeriod", this.fdtmPeriod);
    __sqoop$field_map.put("fstrRecipientIRD", this.fstrRecipientIRD);
    __sqoop$field_map.put("fstrRecipientStatus", this.fstrRecipientStatus);
    __sqoop$field_map.put("fdtmRecipientDOB", this.fdtmRecipientDOB);
    __sqoop$field_map.put("fstrRecipientSurname", this.fstrRecipientSurname);
    __sqoop$field_map.put("fstrRecipientName", this.fstrRecipientName);
    __sqoop$field_map.put("fstrRecipientAddress1", this.fstrRecipientAddress1);
    __sqoop$field_map.put("fstrRecipientAddress2", this.fstrRecipientAddress2);
    __sqoop$field_map.put("fstrRecipientAddress3", this.fstrRecipientAddress3);
    __sqoop$field_map.put("fstrRecipientAddress4", this.fstrRecipientAddress4);
    __sqoop$field_map.put("fstrRecipientCountryCode", this.fstrRecipientCountryCode);
    __sqoop$field_map.put("fcurDividendsGross", this.fcurDividendsGross);
    __sqoop$field_map.put("fcurInterestGross", this.fcurInterestGross);
    __sqoop$field_map.put("fcurRoyaltiesGross", this.fcurRoyaltiesGross);
    __sqoop$field_map.put("fcurOtherGross", this.fcurOtherGross);
    __sqoop$field_map.put("fcurLiableTotal", this.fcurLiableTotal);
    __sqoop$field_map.put("fcurTotalLessFDP", this.fcurTotalLessFDP);
    __sqoop$field_map.put("fcurNetNRWTPaid", this.fcurNetNRWTPaid);
    __sqoop$field_map.put("fcurDividendsNRWT", this.fcurDividendsNRWT);
    __sqoop$field_map.put("fcurInterestNRWT", this.fcurInterestNRWT);
    __sqoop$field_map.put("fcurRoyaltiesNRWT", this.fcurRoyaltiesNRWT);
    __sqoop$field_map.put("fcurOtherNRWT", this.fcurOtherNRWT);
    __sqoop$field_map.put("fstrPayerIRD", this.fstrPayerIRD);
    __sqoop$field_map.put("fstrPayerName", this.fstrPayerName);
    __sqoop$field_map.put("flngPayerCertificate", this.flngPayerCertificate);
    __sqoop$field_map.put("fstrPayerAddress1", this.fstrPayerAddress1);
    __sqoop$field_map.put("fstrPayerAddress2", this.fstrPayerAddress2);
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
