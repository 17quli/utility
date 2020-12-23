// ORM class for table 'tblnz_ksscontribution'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 03:17:44 NZDT 2020
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

public class tblnz_ksscontribution extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64ContributionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fi64ContributionKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrContributionType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fstrContributionType = (String)value;
      }
    });
    setters.put("fcurContributionAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fcurContributionAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fdtmContributionDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmContributionDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngEmployerAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngEmployerAccountKey = (Integer)value;
      }
    });
    setters.put("fdtmEmployerFilingPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmEmployerFilingPeriod = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrSourceType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fstrSourceType = (String)value;
      }
    });
    setters.put("fi64SourceKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fi64SourceKey = (Long)value;
      }
    });
    setters.put("fi64SourceItem", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fi64SourceItem = (Long)value;
      }
    });
    setters.put("fdtmSourceDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmSourceDate = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmReversed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmReversed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fstrReversalReason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fstrReversalReason = (String)value;
      }
    });
    setters.put("fdtmEvaluated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmEvaluated = (java.sql.Timestamp)value;
      }
    });
    setters.put("fblnUpToDate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnUpToDate = (Integer)value;
      }
    });
    setters.put("fblnRA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnRA = (Integer)value;
      }
    });
    setters.put("fblnResidual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnResidual = (Integer)value;
      }
    });
    setters.put("fblnUnclaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnUnclaimed = (Integer)value;
      }
    });
    setters.put("fdtmUnclaimed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmUnclaimed = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngDirectionAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngDirectionAccountKey = (Integer)value;
      }
    });
    setters.put("fblnHistorical", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnHistorical = (Integer)value;
      }
    });
    setters.put("fblnError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnError = (Integer)value;
      }
    });
    setters.put("fblnCnvError", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fblnCnvError = (Integer)value;
      }
    });
    setters.put("flngCnvErrorWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngCnvErrorWorkKey = (Integer)value;
      }
    });
    setters.put("flngCnvUnknownWorkKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.flngCnvUnknownWorkKey = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_ksscontribution.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_ksscontribution() {
    init0();
  }
  private Long fi64ContributionKey;
  public Long get_fi64ContributionKey() {
    return fi64ContributionKey;
  }
  public void set_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
  }
  public tblnz_ksscontribution with_fi64ContributionKey(Long fi64ContributionKey) {
    this.fi64ContributionKey = fi64ContributionKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_ksscontribution with_flngVer(Integer flngVer) {
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
  public tblnz_ksscontribution with_flngVerLast(Integer flngVerLast) {
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
  public tblnz_ksscontribution with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblnz_ksscontribution with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmFilingPeriod;
  public java.sql.Timestamp get_fdtmFilingPeriod() {
    return fdtmFilingPeriod;
  }
  public void set_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
  }
  public tblnz_ksscontribution with_fdtmFilingPeriod(java.sql.Timestamp fdtmFilingPeriod) {
    this.fdtmFilingPeriod = fdtmFilingPeriod;
    return this;
  }
  private String fstrContributionType;
  public String get_fstrContributionType() {
    return fstrContributionType;
  }
  public void set_fstrContributionType(String fstrContributionType) {
    this.fstrContributionType = fstrContributionType;
  }
  public tblnz_ksscontribution with_fstrContributionType(String fstrContributionType) {
    this.fstrContributionType = fstrContributionType;
    return this;
  }
  private java.math.BigDecimal fcurContributionAmount;
  public java.math.BigDecimal get_fcurContributionAmount() {
    return fcurContributionAmount;
  }
  public void set_fcurContributionAmount(java.math.BigDecimal fcurContributionAmount) {
    this.fcurContributionAmount = fcurContributionAmount;
  }
  public tblnz_ksscontribution with_fcurContributionAmount(java.math.BigDecimal fcurContributionAmount) {
    this.fcurContributionAmount = fcurContributionAmount;
    return this;
  }
  private java.sql.Timestamp fdtmContributionDate;
  public java.sql.Timestamp get_fdtmContributionDate() {
    return fdtmContributionDate;
  }
  public void set_fdtmContributionDate(java.sql.Timestamp fdtmContributionDate) {
    this.fdtmContributionDate = fdtmContributionDate;
  }
  public tblnz_ksscontribution with_fdtmContributionDate(java.sql.Timestamp fdtmContributionDate) {
    this.fdtmContributionDate = fdtmContributionDate;
    return this;
  }
  private Integer flngEmployerAccountKey;
  public Integer get_flngEmployerAccountKey() {
    return flngEmployerAccountKey;
  }
  public void set_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
  }
  public tblnz_ksscontribution with_flngEmployerAccountKey(Integer flngEmployerAccountKey) {
    this.flngEmployerAccountKey = flngEmployerAccountKey;
    return this;
  }
  private java.sql.Timestamp fdtmEmployerFilingPeriod;
  public java.sql.Timestamp get_fdtmEmployerFilingPeriod() {
    return fdtmEmployerFilingPeriod;
  }
  public void set_fdtmEmployerFilingPeriod(java.sql.Timestamp fdtmEmployerFilingPeriod) {
    this.fdtmEmployerFilingPeriod = fdtmEmployerFilingPeriod;
  }
  public tblnz_ksscontribution with_fdtmEmployerFilingPeriod(java.sql.Timestamp fdtmEmployerFilingPeriod) {
    this.fdtmEmployerFilingPeriod = fdtmEmployerFilingPeriod;
    return this;
  }
  private String fstrSourceType;
  public String get_fstrSourceType() {
    return fstrSourceType;
  }
  public void set_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
  }
  public tblnz_ksscontribution with_fstrSourceType(String fstrSourceType) {
    this.fstrSourceType = fstrSourceType;
    return this;
  }
  private Long fi64SourceKey;
  public Long get_fi64SourceKey() {
    return fi64SourceKey;
  }
  public void set_fi64SourceKey(Long fi64SourceKey) {
    this.fi64SourceKey = fi64SourceKey;
  }
  public tblnz_ksscontribution with_fi64SourceKey(Long fi64SourceKey) {
    this.fi64SourceKey = fi64SourceKey;
    return this;
  }
  private Long fi64SourceItem;
  public Long get_fi64SourceItem() {
    return fi64SourceItem;
  }
  public void set_fi64SourceItem(Long fi64SourceItem) {
    this.fi64SourceItem = fi64SourceItem;
  }
  public tblnz_ksscontribution with_fi64SourceItem(Long fi64SourceItem) {
    this.fi64SourceItem = fi64SourceItem;
    return this;
  }
  private java.sql.Timestamp fdtmSourceDate;
  public java.sql.Timestamp get_fdtmSourceDate() {
    return fdtmSourceDate;
  }
  public void set_fdtmSourceDate(java.sql.Timestamp fdtmSourceDate) {
    this.fdtmSourceDate = fdtmSourceDate;
  }
  public tblnz_ksscontribution with_fdtmSourceDate(java.sql.Timestamp fdtmSourceDate) {
    this.fdtmSourceDate = fdtmSourceDate;
    return this;
  }
  private java.sql.Timestamp fdtmReversed;
  public java.sql.Timestamp get_fdtmReversed() {
    return fdtmReversed;
  }
  public void set_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
  }
  public tblnz_ksscontribution with_fdtmReversed(java.sql.Timestamp fdtmReversed) {
    this.fdtmReversed = fdtmReversed;
    return this;
  }
  private String fstrReversalReason;
  public String get_fstrReversalReason() {
    return fstrReversalReason;
  }
  public void set_fstrReversalReason(String fstrReversalReason) {
    this.fstrReversalReason = fstrReversalReason;
  }
  public tblnz_ksscontribution with_fstrReversalReason(String fstrReversalReason) {
    this.fstrReversalReason = fstrReversalReason;
    return this;
  }
  private java.sql.Timestamp fdtmEvaluated;
  public java.sql.Timestamp get_fdtmEvaluated() {
    return fdtmEvaluated;
  }
  public void set_fdtmEvaluated(java.sql.Timestamp fdtmEvaluated) {
    this.fdtmEvaluated = fdtmEvaluated;
  }
  public tblnz_ksscontribution with_fdtmEvaluated(java.sql.Timestamp fdtmEvaluated) {
    this.fdtmEvaluated = fdtmEvaluated;
    return this;
  }
  private Integer fblnUpToDate;
  public Integer get_fblnUpToDate() {
    return fblnUpToDate;
  }
  public void set_fblnUpToDate(Integer fblnUpToDate) {
    this.fblnUpToDate = fblnUpToDate;
  }
  public tblnz_ksscontribution with_fblnUpToDate(Integer fblnUpToDate) {
    this.fblnUpToDate = fblnUpToDate;
    return this;
  }
  private Integer fblnRA;
  public Integer get_fblnRA() {
    return fblnRA;
  }
  public void set_fblnRA(Integer fblnRA) {
    this.fblnRA = fblnRA;
  }
  public tblnz_ksscontribution with_fblnRA(Integer fblnRA) {
    this.fblnRA = fblnRA;
    return this;
  }
  private Integer fblnResidual;
  public Integer get_fblnResidual() {
    return fblnResidual;
  }
  public void set_fblnResidual(Integer fblnResidual) {
    this.fblnResidual = fblnResidual;
  }
  public tblnz_ksscontribution with_fblnResidual(Integer fblnResidual) {
    this.fblnResidual = fblnResidual;
    return this;
  }
  private Integer fblnUnclaimed;
  public Integer get_fblnUnclaimed() {
    return fblnUnclaimed;
  }
  public void set_fblnUnclaimed(Integer fblnUnclaimed) {
    this.fblnUnclaimed = fblnUnclaimed;
  }
  public tblnz_ksscontribution with_fblnUnclaimed(Integer fblnUnclaimed) {
    this.fblnUnclaimed = fblnUnclaimed;
    return this;
  }
  private java.sql.Timestamp fdtmUnclaimed;
  public java.sql.Timestamp get_fdtmUnclaimed() {
    return fdtmUnclaimed;
  }
  public void set_fdtmUnclaimed(java.sql.Timestamp fdtmUnclaimed) {
    this.fdtmUnclaimed = fdtmUnclaimed;
  }
  public tblnz_ksscontribution with_fdtmUnclaimed(java.sql.Timestamp fdtmUnclaimed) {
    this.fdtmUnclaimed = fdtmUnclaimed;
    return this;
  }
  private Integer flngDirectionAccountKey;
  public Integer get_flngDirectionAccountKey() {
    return flngDirectionAccountKey;
  }
  public void set_flngDirectionAccountKey(Integer flngDirectionAccountKey) {
    this.flngDirectionAccountKey = flngDirectionAccountKey;
  }
  public tblnz_ksscontribution with_flngDirectionAccountKey(Integer flngDirectionAccountKey) {
    this.flngDirectionAccountKey = flngDirectionAccountKey;
    return this;
  }
  private Integer fblnHistorical;
  public Integer get_fblnHistorical() {
    return fblnHistorical;
  }
  public void set_fblnHistorical(Integer fblnHistorical) {
    this.fblnHistorical = fblnHistorical;
  }
  public tblnz_ksscontribution with_fblnHistorical(Integer fblnHistorical) {
    this.fblnHistorical = fblnHistorical;
    return this;
  }
  private Integer fblnError;
  public Integer get_fblnError() {
    return fblnError;
  }
  public void set_fblnError(Integer fblnError) {
    this.fblnError = fblnError;
  }
  public tblnz_ksscontribution with_fblnError(Integer fblnError) {
    this.fblnError = fblnError;
    return this;
  }
  private Integer fblnCnvError;
  public Integer get_fblnCnvError() {
    return fblnCnvError;
  }
  public void set_fblnCnvError(Integer fblnCnvError) {
    this.fblnCnvError = fblnCnvError;
  }
  public tblnz_ksscontribution with_fblnCnvError(Integer fblnCnvError) {
    this.fblnCnvError = fblnCnvError;
    return this;
  }
  private Integer flngCnvErrorWorkKey;
  public Integer get_flngCnvErrorWorkKey() {
    return flngCnvErrorWorkKey;
  }
  public void set_flngCnvErrorWorkKey(Integer flngCnvErrorWorkKey) {
    this.flngCnvErrorWorkKey = flngCnvErrorWorkKey;
  }
  public tblnz_ksscontribution with_flngCnvErrorWorkKey(Integer flngCnvErrorWorkKey) {
    this.flngCnvErrorWorkKey = flngCnvErrorWorkKey;
    return this;
  }
  private Integer flngCnvUnknownWorkKey;
  public Integer get_flngCnvUnknownWorkKey() {
    return flngCnvUnknownWorkKey;
  }
  public void set_flngCnvUnknownWorkKey(Integer flngCnvUnknownWorkKey) {
    this.flngCnvUnknownWorkKey = flngCnvUnknownWorkKey;
  }
  public tblnz_ksscontribution with_flngCnvUnknownWorkKey(Integer flngCnvUnknownWorkKey) {
    this.flngCnvUnknownWorkKey = flngCnvUnknownWorkKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_ksscontribution with_fstrWho(String fstrWho) {
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
  public tblnz_ksscontribution with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksscontribution)) {
      return false;
    }
    tblnz_ksscontribution that = (tblnz_ksscontribution) o;
    boolean equal = true;
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrContributionType == null ? that.fstrContributionType == null : this.fstrContributionType.equals(that.fstrContributionType));
    equal = equal && (this.fcurContributionAmount == null ? that.fcurContributionAmount == null : this.fcurContributionAmount.equals(that.fcurContributionAmount));
    equal = equal && (this.fdtmContributionDate == null ? that.fdtmContributionDate == null : this.fdtmContributionDate.equals(that.fdtmContributionDate));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.fdtmEmployerFilingPeriod == null ? that.fdtmEmployerFilingPeriod == null : this.fdtmEmployerFilingPeriod.equals(that.fdtmEmployerFilingPeriod));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fi64SourceKey == null ? that.fi64SourceKey == null : this.fi64SourceKey.equals(that.fi64SourceKey));
    equal = equal && (this.fi64SourceItem == null ? that.fi64SourceItem == null : this.fi64SourceItem.equals(that.fi64SourceItem));
    equal = equal && (this.fdtmSourceDate == null ? that.fdtmSourceDate == null : this.fdtmSourceDate.equals(that.fdtmSourceDate));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrReversalReason == null ? that.fstrReversalReason == null : this.fstrReversalReason.equals(that.fstrReversalReason));
    equal = equal && (this.fdtmEvaluated == null ? that.fdtmEvaluated == null : this.fdtmEvaluated.equals(that.fdtmEvaluated));
    equal = equal && (this.fblnUpToDate == null ? that.fblnUpToDate == null : this.fblnUpToDate.equals(that.fblnUpToDate));
    equal = equal && (this.fblnRA == null ? that.fblnRA == null : this.fblnRA.equals(that.fblnRA));
    equal = equal && (this.fblnResidual == null ? that.fblnResidual == null : this.fblnResidual.equals(that.fblnResidual));
    equal = equal && (this.fblnUnclaimed == null ? that.fblnUnclaimed == null : this.fblnUnclaimed.equals(that.fblnUnclaimed));
    equal = equal && (this.fdtmUnclaimed == null ? that.fdtmUnclaimed == null : this.fdtmUnclaimed.equals(that.fdtmUnclaimed));
    equal = equal && (this.flngDirectionAccountKey == null ? that.flngDirectionAccountKey == null : this.flngDirectionAccountKey.equals(that.flngDirectionAccountKey));
    equal = equal && (this.fblnHistorical == null ? that.fblnHistorical == null : this.fblnHistorical.equals(that.fblnHistorical));
    equal = equal && (this.fblnError == null ? that.fblnError == null : this.fblnError.equals(that.fblnError));
    equal = equal && (this.fblnCnvError == null ? that.fblnCnvError == null : this.fblnCnvError.equals(that.fblnCnvError));
    equal = equal && (this.flngCnvErrorWorkKey == null ? that.flngCnvErrorWorkKey == null : this.flngCnvErrorWorkKey.equals(that.flngCnvErrorWorkKey));
    equal = equal && (this.flngCnvUnknownWorkKey == null ? that.flngCnvUnknownWorkKey == null : this.flngCnvUnknownWorkKey.equals(that.flngCnvUnknownWorkKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_ksscontribution)) {
      return false;
    }
    tblnz_ksscontribution that = (tblnz_ksscontribution) o;
    boolean equal = true;
    equal = equal && (this.fi64ContributionKey == null ? that.fi64ContributionKey == null : this.fi64ContributionKey.equals(that.fi64ContributionKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fdtmFilingPeriod == null ? that.fdtmFilingPeriod == null : this.fdtmFilingPeriod.equals(that.fdtmFilingPeriod));
    equal = equal && (this.fstrContributionType == null ? that.fstrContributionType == null : this.fstrContributionType.equals(that.fstrContributionType));
    equal = equal && (this.fcurContributionAmount == null ? that.fcurContributionAmount == null : this.fcurContributionAmount.equals(that.fcurContributionAmount));
    equal = equal && (this.fdtmContributionDate == null ? that.fdtmContributionDate == null : this.fdtmContributionDate.equals(that.fdtmContributionDate));
    equal = equal && (this.flngEmployerAccountKey == null ? that.flngEmployerAccountKey == null : this.flngEmployerAccountKey.equals(that.flngEmployerAccountKey));
    equal = equal && (this.fdtmEmployerFilingPeriod == null ? that.fdtmEmployerFilingPeriod == null : this.fdtmEmployerFilingPeriod.equals(that.fdtmEmployerFilingPeriod));
    equal = equal && (this.fstrSourceType == null ? that.fstrSourceType == null : this.fstrSourceType.equals(that.fstrSourceType));
    equal = equal && (this.fi64SourceKey == null ? that.fi64SourceKey == null : this.fi64SourceKey.equals(that.fi64SourceKey));
    equal = equal && (this.fi64SourceItem == null ? that.fi64SourceItem == null : this.fi64SourceItem.equals(that.fi64SourceItem));
    equal = equal && (this.fdtmSourceDate == null ? that.fdtmSourceDate == null : this.fdtmSourceDate.equals(that.fdtmSourceDate));
    equal = equal && (this.fdtmReversed == null ? that.fdtmReversed == null : this.fdtmReversed.equals(that.fdtmReversed));
    equal = equal && (this.fstrReversalReason == null ? that.fstrReversalReason == null : this.fstrReversalReason.equals(that.fstrReversalReason));
    equal = equal && (this.fdtmEvaluated == null ? that.fdtmEvaluated == null : this.fdtmEvaluated.equals(that.fdtmEvaluated));
    equal = equal && (this.fblnUpToDate == null ? that.fblnUpToDate == null : this.fblnUpToDate.equals(that.fblnUpToDate));
    equal = equal && (this.fblnRA == null ? that.fblnRA == null : this.fblnRA.equals(that.fblnRA));
    equal = equal && (this.fblnResidual == null ? that.fblnResidual == null : this.fblnResidual.equals(that.fblnResidual));
    equal = equal && (this.fblnUnclaimed == null ? that.fblnUnclaimed == null : this.fblnUnclaimed.equals(that.fblnUnclaimed));
    equal = equal && (this.fdtmUnclaimed == null ? that.fdtmUnclaimed == null : this.fdtmUnclaimed.equals(that.fdtmUnclaimed));
    equal = equal && (this.flngDirectionAccountKey == null ? that.flngDirectionAccountKey == null : this.flngDirectionAccountKey.equals(that.flngDirectionAccountKey));
    equal = equal && (this.fblnHistorical == null ? that.fblnHistorical == null : this.fblnHistorical.equals(that.fblnHistorical));
    equal = equal && (this.fblnError == null ? that.fblnError == null : this.fblnError.equals(that.fblnError));
    equal = equal && (this.fblnCnvError == null ? that.fblnCnvError == null : this.fblnCnvError.equals(that.fblnCnvError));
    equal = equal && (this.flngCnvErrorWorkKey == null ? that.flngCnvErrorWorkKey == null : this.flngCnvErrorWorkKey.equals(that.flngCnvErrorWorkKey));
    equal = equal && (this.flngCnvUnknownWorkKey == null ? that.flngCnvUnknownWorkKey == null : this.flngCnvUnknownWorkKey.equals(that.flngCnvUnknownWorkKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64ContributionKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fstrContributionType = JdbcWritableBridge.readString(7, __dbResults);
    this.fcurContributionAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fdtmContributionDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmEmployerFilingPeriod = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(12, __dbResults);
    this.fi64SourceKey = JdbcWritableBridge.readLong(13, __dbResults);
    this.fi64SourceItem = JdbcWritableBridge.readLong(14, __dbResults);
    this.fdtmSourceDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrReversalReason = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmEvaluated = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fblnUpToDate = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnRA = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnResidual = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnUnclaimed = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fdtmUnclaimed = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.flngDirectionAccountKey = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnHistorical = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnError = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnCnvError = JdbcWritableBridge.readInteger(27, __dbResults);
    this.flngCnvErrorWorkKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.flngCnvUnknownWorkKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(31, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64ContributionKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmFilingPeriod = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fstrContributionType = JdbcWritableBridge.readString(7, __dbResults);
    this.fcurContributionAmount = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fdtmContributionDate = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.flngEmployerAccountKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fdtmEmployerFilingPeriod = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.fstrSourceType = JdbcWritableBridge.readString(12, __dbResults);
    this.fi64SourceKey = JdbcWritableBridge.readLong(13, __dbResults);
    this.fi64SourceItem = JdbcWritableBridge.readLong(14, __dbResults);
    this.fdtmSourceDate = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.fdtmReversed = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.fstrReversalReason = JdbcWritableBridge.readString(17, __dbResults);
    this.fdtmEvaluated = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.fblnUpToDate = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnRA = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnResidual = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnUnclaimed = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fdtmUnclaimed = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.flngDirectionAccountKey = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnHistorical = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fblnError = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnCnvError = JdbcWritableBridge.readInteger(27, __dbResults);
    this.flngCnvErrorWorkKey = JdbcWritableBridge.readInteger(28, __dbResults);
    this.flngCnvUnknownWorkKey = JdbcWritableBridge.readInteger(29, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(30, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(31, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64ContributionKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrContributionType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmContributionDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmployerFilingPeriod, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceKey, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceItem, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSourceDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversalReason, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEvaluated, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpToDate, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRA, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnResidual, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnclaimed, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmUnclaimed, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDirectionAccountKey, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHistorical, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnError, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCnvError, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCnvErrorWorkKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCnvUnknownWorkKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 31 + __off, 93, __dbStmt);
    return 31;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64ContributionKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmFilingPeriod, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrContributionType, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurContributionAmount, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmContributionDate, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngEmployerAccountKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEmployerFilingPeriod, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrSourceType, 12 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceKey, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64SourceItem, 14 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmSourceDate, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmReversed, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(fstrReversalReason, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmEvaluated, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpToDate, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRA, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnResidual, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUnclaimed, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmUnclaimed, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDirectionAccountKey, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnHistorical, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnError, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCnvError, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCnvErrorWorkKey, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCnvUnknownWorkKey, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 30 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 31 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64ContributionKey = null;
    } else {
    this.fi64ContributionKey = Long.valueOf(__dataIn.readLong());
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
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmFilingPeriod = null;
    } else {
    this.fdtmFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrContributionType = null;
    } else {
    this.fstrContributionType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurContributionAmount = null;
    } else {
    this.fcurContributionAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmContributionDate = null;
    } else {
    this.fdtmContributionDate = new Timestamp(__dataIn.readLong());
    this.fdtmContributionDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngEmployerAccountKey = null;
    } else {
    this.flngEmployerAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEmployerFilingPeriod = null;
    } else {
    this.fdtmEmployerFilingPeriod = new Timestamp(__dataIn.readLong());
    this.fdtmEmployerFilingPeriod.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrSourceType = null;
    } else {
    this.fstrSourceType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64SourceKey = null;
    } else {
    this.fi64SourceKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64SourceItem = null;
    } else {
    this.fi64SourceItem = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmSourceDate = null;
    } else {
    this.fdtmSourceDate = new Timestamp(__dataIn.readLong());
    this.fdtmSourceDate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmReversed = null;
    } else {
    this.fdtmReversed = new Timestamp(__dataIn.readLong());
    this.fdtmReversed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrReversalReason = null;
    } else {
    this.fstrReversalReason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmEvaluated = null;
    } else {
    this.fdtmEvaluated = new Timestamp(__dataIn.readLong());
    this.fdtmEvaluated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUpToDate = null;
    } else {
    this.fblnUpToDate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRA = null;
    } else {
    this.fblnRA = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnResidual = null;
    } else {
    this.fblnResidual = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUnclaimed = null;
    } else {
    this.fblnUnclaimed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmUnclaimed = null;
    } else {
    this.fdtmUnclaimed = new Timestamp(__dataIn.readLong());
    this.fdtmUnclaimed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDirectionAccountKey = null;
    } else {
    this.flngDirectionAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnHistorical = null;
    } else {
    this.fblnHistorical = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnError = null;
    } else {
    this.fblnError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCnvError = null;
    } else {
    this.fblnCnvError = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCnvErrorWorkKey = null;
    } else {
    this.flngCnvErrorWorkKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCnvUnknownWorkKey = null;
    } else {
    this.flngCnvUnknownWorkKey = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrContributionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContributionType);
    }
    if (null == this.fcurContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionAmount, __dataOut);
    }
    if (null == this.fdtmContributionDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmContributionDate.getTime());
    __dataOut.writeInt(this.fdtmContributionDate.getNanos());
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.fdtmEmployerFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmployerFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmEmployerFilingPeriod.getNanos());
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fi64SourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceKey);
    }
    if (null == this.fi64SourceItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceItem);
    }
    if (null == this.fdtmSourceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSourceDate.getTime());
    __dataOut.writeInt(this.fdtmSourceDate.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fstrReversalReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversalReason);
    }
    if (null == this.fdtmEvaluated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEvaluated.getTime());
    __dataOut.writeInt(this.fdtmEvaluated.getNanos());
    }
    if (null == this.fblnUpToDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpToDate);
    }
    if (null == this.fblnRA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRA);
    }
    if (null == this.fblnResidual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnResidual);
    }
    if (null == this.fblnUnclaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnclaimed);
    }
    if (null == this.fdtmUnclaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmUnclaimed.getTime());
    __dataOut.writeInt(this.fdtmUnclaimed.getNanos());
    }
    if (null == this.flngDirectionAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDirectionAccountKey);
    }
    if (null == this.fblnHistorical) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHistorical);
    }
    if (null == this.fblnError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnError);
    }
    if (null == this.fblnCnvError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCnvError);
    }
    if (null == this.flngCnvErrorWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCnvErrorWorkKey);
    }
    if (null == this.flngCnvUnknownWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCnvUnknownWorkKey);
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
    if (null == this.fi64ContributionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64ContributionKey);
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
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fdtmFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmFilingPeriod.getNanos());
    }
    if (null == this.fstrContributionType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrContributionType);
    }
    if (null == this.fcurContributionAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurContributionAmount, __dataOut);
    }
    if (null == this.fdtmContributionDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmContributionDate.getTime());
    __dataOut.writeInt(this.fdtmContributionDate.getNanos());
    }
    if (null == this.flngEmployerAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngEmployerAccountKey);
    }
    if (null == this.fdtmEmployerFilingPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEmployerFilingPeriod.getTime());
    __dataOut.writeInt(this.fdtmEmployerFilingPeriod.getNanos());
    }
    if (null == this.fstrSourceType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrSourceType);
    }
    if (null == this.fi64SourceKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceKey);
    }
    if (null == this.fi64SourceItem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64SourceItem);
    }
    if (null == this.fdtmSourceDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmSourceDate.getTime());
    __dataOut.writeInt(this.fdtmSourceDate.getNanos());
    }
    if (null == this.fdtmReversed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmReversed.getTime());
    __dataOut.writeInt(this.fdtmReversed.getNanos());
    }
    if (null == this.fstrReversalReason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrReversalReason);
    }
    if (null == this.fdtmEvaluated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmEvaluated.getTime());
    __dataOut.writeInt(this.fdtmEvaluated.getNanos());
    }
    if (null == this.fblnUpToDate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpToDate);
    }
    if (null == this.fblnRA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRA);
    }
    if (null == this.fblnResidual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnResidual);
    }
    if (null == this.fblnUnclaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUnclaimed);
    }
    if (null == this.fdtmUnclaimed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmUnclaimed.getTime());
    __dataOut.writeInt(this.fdtmUnclaimed.getNanos());
    }
    if (null == this.flngDirectionAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDirectionAccountKey);
    }
    if (null == this.fblnHistorical) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnHistorical);
    }
    if (null == this.fblnError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnError);
    }
    if (null == this.fblnCnvError) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCnvError);
    }
    if (null == this.flngCnvErrorWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCnvErrorWorkKey);
    }
    if (null == this.flngCnvUnknownWorkKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCnvUnknownWorkKey);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContributionType==null?"\\N":fstrContributionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionAmount==null?"\\N":fcurContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmContributionDate==null?"\\N":"" + fdtmContributionDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmployerFilingPeriod==null?"\\N":"" + fdtmEmployerFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceKey==null?"\\N":"" + fi64SourceKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceItem==null?"\\N":"" + fi64SourceItem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSourceDate==null?"\\N":"" + fdtmSourceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversalReason==null?"\\N":fstrReversalReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEvaluated==null?"\\N":"" + fdtmEvaluated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpToDate==null?"\\N":"" + fblnUpToDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRA==null?"\\N":"" + fblnRA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnResidual==null?"\\N":"" + fblnResidual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnclaimed==null?"\\N":"" + fblnUnclaimed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmUnclaimed==null?"\\N":"" + fdtmUnclaimed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDirectionAccountKey==null?"\\N":"" + flngDirectionAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHistorical==null?"\\N":"" + fblnHistorical, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnError==null?"\\N":"" + fblnError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCnvError==null?"\\N":"" + fblnCnvError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCnvErrorWorkKey==null?"\\N":"" + flngCnvErrorWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCnvUnknownWorkKey==null?"\\N":"" + flngCnvUnknownWorkKey, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64ContributionKey==null?"\\N":"" + fi64ContributionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmFilingPeriod==null?"\\N":"" + fdtmFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrContributionType==null?"\\N":fstrContributionType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurContributionAmount==null?"\\N":fcurContributionAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmContributionDate==null?"\\N":"" + fdtmContributionDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngEmployerAccountKey==null?"\\N":"" + flngEmployerAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEmployerFilingPeriod==null?"\\N":"" + fdtmEmployerFilingPeriod, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrSourceType==null?"\\N":fstrSourceType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceKey==null?"\\N":"" + fi64SourceKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64SourceItem==null?"\\N":"" + fi64SourceItem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmSourceDate==null?"\\N":"" + fdtmSourceDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmReversed==null?"\\N":"" + fdtmReversed, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrReversalReason==null?"\\N":fstrReversalReason, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmEvaluated==null?"\\N":"" + fdtmEvaluated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpToDate==null?"\\N":"" + fblnUpToDate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRA==null?"\\N":"" + fblnRA, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnResidual==null?"\\N":"" + fblnResidual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUnclaimed==null?"\\N":"" + fblnUnclaimed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmUnclaimed==null?"\\N":"" + fdtmUnclaimed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDirectionAccountKey==null?"\\N":"" + flngDirectionAccountKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnHistorical==null?"\\N":"" + fblnHistorical, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnError==null?"\\N":"" + fblnError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCnvError==null?"\\N":"" + fblnCnvError, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCnvErrorWorkKey==null?"\\N":"" + flngCnvErrorWorkKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCnvUnknownWorkKey==null?"\\N":"" + flngCnvUnknownWorkKey, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContributionType = null; } else {
      this.fstrContributionType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionAmount = null; } else {
      this.fcurContributionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmContributionDate = null; } else {
      this.fdtmContributionDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmployerFilingPeriod = null; } else {
      this.fdtmEmployerFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceKey = null; } else {
      this.fi64SourceKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceItem = null; } else {
      this.fi64SourceItem = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSourceDate = null; } else {
      this.fdtmSourceDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrReversalReason = null; } else {
      this.fstrReversalReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEvaluated = null; } else {
      this.fdtmEvaluated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpToDate = null; } else {
      this.fblnUpToDate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRA = null; } else {
      this.fblnRA = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnResidual = null; } else {
      this.fblnResidual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnclaimed = null; } else {
      this.fblnUnclaimed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmUnclaimed = null; } else {
      this.fdtmUnclaimed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDirectionAccountKey = null; } else {
      this.flngDirectionAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHistorical = null; } else {
      this.fblnHistorical = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnError = null; } else {
      this.fblnError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCnvError = null; } else {
      this.fblnCnvError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCnvErrorWorkKey = null; } else {
      this.flngCnvErrorWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCnvUnknownWorkKey = null; } else {
      this.flngCnvUnknownWorkKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64ContributionKey = null; } else {
      this.fi64ContributionKey = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmFilingPeriod = null; } else {
      this.fdtmFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrContributionType = null; } else {
      this.fstrContributionType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurContributionAmount = null; } else {
      this.fcurContributionAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmContributionDate = null; } else {
      this.fdtmContributionDate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngEmployerAccountKey = null; } else {
      this.flngEmployerAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEmployerFilingPeriod = null; } else {
      this.fdtmEmployerFilingPeriod = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrSourceType = null; } else {
      this.fstrSourceType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceKey = null; } else {
      this.fi64SourceKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64SourceItem = null; } else {
      this.fi64SourceItem = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmSourceDate = null; } else {
      this.fdtmSourceDate = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.fstrReversalReason = null; } else {
      this.fstrReversalReason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmEvaluated = null; } else {
      this.fdtmEvaluated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpToDate = null; } else {
      this.fblnUpToDate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRA = null; } else {
      this.fblnRA = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnResidual = null; } else {
      this.fblnResidual = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUnclaimed = null; } else {
      this.fblnUnclaimed = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmUnclaimed = null; } else {
      this.fdtmUnclaimed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDirectionAccountKey = null; } else {
      this.flngDirectionAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnHistorical = null; } else {
      this.fblnHistorical = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnError = null; } else {
      this.fblnError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCnvError = null; } else {
      this.fblnCnvError = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCnvErrorWorkKey = null; } else {
      this.flngCnvErrorWorkKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCnvUnknownWorkKey = null; } else {
      this.flngCnvUnknownWorkKey = Integer.valueOf(__cur_str);
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
    tblnz_ksscontribution o = (tblnz_ksscontribution) super.clone();
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmContributionDate = (o.fdtmContributionDate != null) ? (java.sql.Timestamp) o.fdtmContributionDate.clone() : null;
    o.fdtmEmployerFilingPeriod = (o.fdtmEmployerFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmEmployerFilingPeriod.clone() : null;
    o.fdtmSourceDate = (o.fdtmSourceDate != null) ? (java.sql.Timestamp) o.fdtmSourceDate.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmEvaluated = (o.fdtmEvaluated != null) ? (java.sql.Timestamp) o.fdtmEvaluated.clone() : null;
    o.fdtmUnclaimed = (o.fdtmUnclaimed != null) ? (java.sql.Timestamp) o.fdtmUnclaimed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_ksscontribution o) throws CloneNotSupportedException {
    o.fdtmFilingPeriod = (o.fdtmFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmFilingPeriod.clone() : null;
    o.fdtmContributionDate = (o.fdtmContributionDate != null) ? (java.sql.Timestamp) o.fdtmContributionDate.clone() : null;
    o.fdtmEmployerFilingPeriod = (o.fdtmEmployerFilingPeriod != null) ? (java.sql.Timestamp) o.fdtmEmployerFilingPeriod.clone() : null;
    o.fdtmSourceDate = (o.fdtmSourceDate != null) ? (java.sql.Timestamp) o.fdtmSourceDate.clone() : null;
    o.fdtmReversed = (o.fdtmReversed != null) ? (java.sql.Timestamp) o.fdtmReversed.clone() : null;
    o.fdtmEvaluated = (o.fdtmEvaluated != null) ? (java.sql.Timestamp) o.fdtmEvaluated.clone() : null;
    o.fdtmUnclaimed = (o.fdtmUnclaimed != null) ? (java.sql.Timestamp) o.fdtmUnclaimed.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrContributionType", this.fstrContributionType);
    __sqoop$field_map.put("fcurContributionAmount", this.fcurContributionAmount);
    __sqoop$field_map.put("fdtmContributionDate", this.fdtmContributionDate);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("fdtmEmployerFilingPeriod", this.fdtmEmployerFilingPeriod);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fi64SourceKey", this.fi64SourceKey);
    __sqoop$field_map.put("fi64SourceItem", this.fi64SourceItem);
    __sqoop$field_map.put("fdtmSourceDate", this.fdtmSourceDate);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrReversalReason", this.fstrReversalReason);
    __sqoop$field_map.put("fdtmEvaluated", this.fdtmEvaluated);
    __sqoop$field_map.put("fblnUpToDate", this.fblnUpToDate);
    __sqoop$field_map.put("fblnRA", this.fblnRA);
    __sqoop$field_map.put("fblnResidual", this.fblnResidual);
    __sqoop$field_map.put("fblnUnclaimed", this.fblnUnclaimed);
    __sqoop$field_map.put("fdtmUnclaimed", this.fdtmUnclaimed);
    __sqoop$field_map.put("flngDirectionAccountKey", this.flngDirectionAccountKey);
    __sqoop$field_map.put("fblnHistorical", this.fblnHistorical);
    __sqoop$field_map.put("fblnError", this.fblnError);
    __sqoop$field_map.put("fblnCnvError", this.fblnCnvError);
    __sqoop$field_map.put("flngCnvErrorWorkKey", this.flngCnvErrorWorkKey);
    __sqoop$field_map.put("flngCnvUnknownWorkKey", this.flngCnvUnknownWorkKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64ContributionKey", this.fi64ContributionKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fdtmFilingPeriod", this.fdtmFilingPeriod);
    __sqoop$field_map.put("fstrContributionType", this.fstrContributionType);
    __sqoop$field_map.put("fcurContributionAmount", this.fcurContributionAmount);
    __sqoop$field_map.put("fdtmContributionDate", this.fdtmContributionDate);
    __sqoop$field_map.put("flngEmployerAccountKey", this.flngEmployerAccountKey);
    __sqoop$field_map.put("fdtmEmployerFilingPeriod", this.fdtmEmployerFilingPeriod);
    __sqoop$field_map.put("fstrSourceType", this.fstrSourceType);
    __sqoop$field_map.put("fi64SourceKey", this.fi64SourceKey);
    __sqoop$field_map.put("fi64SourceItem", this.fi64SourceItem);
    __sqoop$field_map.put("fdtmSourceDate", this.fdtmSourceDate);
    __sqoop$field_map.put("fdtmReversed", this.fdtmReversed);
    __sqoop$field_map.put("fstrReversalReason", this.fstrReversalReason);
    __sqoop$field_map.put("fdtmEvaluated", this.fdtmEvaluated);
    __sqoop$field_map.put("fblnUpToDate", this.fblnUpToDate);
    __sqoop$field_map.put("fblnRA", this.fblnRA);
    __sqoop$field_map.put("fblnResidual", this.fblnResidual);
    __sqoop$field_map.put("fblnUnclaimed", this.fblnUnclaimed);
    __sqoop$field_map.put("fdtmUnclaimed", this.fdtmUnclaimed);
    __sqoop$field_map.put("flngDirectionAccountKey", this.flngDirectionAccountKey);
    __sqoop$field_map.put("fblnHistorical", this.fblnHistorical);
    __sqoop$field_map.put("fblnError", this.fblnError);
    __sqoop$field_map.put("fblnCnvError", this.fblnCnvError);
    __sqoop$field_map.put("flngCnvErrorWorkKey", this.flngCnvErrorWorkKey);
    __sqoop$field_map.put("flngCnvUnknownWorkKey", this.flngCnvUnknownWorkKey);
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
