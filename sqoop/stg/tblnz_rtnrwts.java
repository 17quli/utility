// ORM class for table 'tblnz_rtnrwts'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 01:09:16 NZDT 2020
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

public class tblnz_rtnrwts extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("fblnAgent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fblnAgent = (Integer)value;
      }
    });
    setters.put("fcurAmountPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurAmountPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountNotRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurAmountNotRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmountSubjectRWT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurAmountSubjectRWT = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDistributionsPaidIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurDistributionsPaidIRD = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDistributionIRDMultiply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurDistributionIRDMultiply = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDistributionsPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurDistributionsPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDistributionMultiply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurDistributionMultiply = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendsPaid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurDividendsPaid = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurDividendMultiply", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurDividendMultiply = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTLiability", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurRWTLiability = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurManualRWTDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurManualRWTDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalRWTDividends", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurTotalRWTDividends = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalAlreadyDeducted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurTotalAlreadyDeducted = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurImputationAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurImputationAttached = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFDPAttached", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurFDPAttached = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurTotalTaxCredits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurTotalTaxCredits = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurRWTFinal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fcurRWTFinal = (java.math.BigDecimal)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_rtnrwts.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_rtnrwts() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_rtnrwts with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer fblnAgent;
  public Integer get_fblnAgent() {
    return fblnAgent;
  }
  public void set_fblnAgent(Integer fblnAgent) {
    this.fblnAgent = fblnAgent;
  }
  public tblnz_rtnrwts with_fblnAgent(Integer fblnAgent) {
    this.fblnAgent = fblnAgent;
    return this;
  }
  private java.math.BigDecimal fcurAmountPaid;
  public java.math.BigDecimal get_fcurAmountPaid() {
    return fcurAmountPaid;
  }
  public void set_fcurAmountPaid(java.math.BigDecimal fcurAmountPaid) {
    this.fcurAmountPaid = fcurAmountPaid;
  }
  public tblnz_rtnrwts with_fcurAmountPaid(java.math.BigDecimal fcurAmountPaid) {
    this.fcurAmountPaid = fcurAmountPaid;
    return this;
  }
  private java.math.BigDecimal fcurAmountNotRWT;
  public java.math.BigDecimal get_fcurAmountNotRWT() {
    return fcurAmountNotRWT;
  }
  public void set_fcurAmountNotRWT(java.math.BigDecimal fcurAmountNotRWT) {
    this.fcurAmountNotRWT = fcurAmountNotRWT;
  }
  public tblnz_rtnrwts with_fcurAmountNotRWT(java.math.BigDecimal fcurAmountNotRWT) {
    this.fcurAmountNotRWT = fcurAmountNotRWT;
    return this;
  }
  private java.math.BigDecimal fcurAmountSubjectRWT;
  public java.math.BigDecimal get_fcurAmountSubjectRWT() {
    return fcurAmountSubjectRWT;
  }
  public void set_fcurAmountSubjectRWT(java.math.BigDecimal fcurAmountSubjectRWT) {
    this.fcurAmountSubjectRWT = fcurAmountSubjectRWT;
  }
  public tblnz_rtnrwts with_fcurAmountSubjectRWT(java.math.BigDecimal fcurAmountSubjectRWT) {
    this.fcurAmountSubjectRWT = fcurAmountSubjectRWT;
    return this;
  }
  private java.math.BigDecimal fcurDistributionsPaidIRD;
  public java.math.BigDecimal get_fcurDistributionsPaidIRD() {
    return fcurDistributionsPaidIRD;
  }
  public void set_fcurDistributionsPaidIRD(java.math.BigDecimal fcurDistributionsPaidIRD) {
    this.fcurDistributionsPaidIRD = fcurDistributionsPaidIRD;
  }
  public tblnz_rtnrwts with_fcurDistributionsPaidIRD(java.math.BigDecimal fcurDistributionsPaidIRD) {
    this.fcurDistributionsPaidIRD = fcurDistributionsPaidIRD;
    return this;
  }
  private java.math.BigDecimal fcurDistributionIRDMultiply;
  public java.math.BigDecimal get_fcurDistributionIRDMultiply() {
    return fcurDistributionIRDMultiply;
  }
  public void set_fcurDistributionIRDMultiply(java.math.BigDecimal fcurDistributionIRDMultiply) {
    this.fcurDistributionIRDMultiply = fcurDistributionIRDMultiply;
  }
  public tblnz_rtnrwts with_fcurDistributionIRDMultiply(java.math.BigDecimal fcurDistributionIRDMultiply) {
    this.fcurDistributionIRDMultiply = fcurDistributionIRDMultiply;
    return this;
  }
  private java.math.BigDecimal fcurDistributionsPaid;
  public java.math.BigDecimal get_fcurDistributionsPaid() {
    return fcurDistributionsPaid;
  }
  public void set_fcurDistributionsPaid(java.math.BigDecimal fcurDistributionsPaid) {
    this.fcurDistributionsPaid = fcurDistributionsPaid;
  }
  public tblnz_rtnrwts with_fcurDistributionsPaid(java.math.BigDecimal fcurDistributionsPaid) {
    this.fcurDistributionsPaid = fcurDistributionsPaid;
    return this;
  }
  private java.math.BigDecimal fcurDistributionMultiply;
  public java.math.BigDecimal get_fcurDistributionMultiply() {
    return fcurDistributionMultiply;
  }
  public void set_fcurDistributionMultiply(java.math.BigDecimal fcurDistributionMultiply) {
    this.fcurDistributionMultiply = fcurDistributionMultiply;
  }
  public tblnz_rtnrwts with_fcurDistributionMultiply(java.math.BigDecimal fcurDistributionMultiply) {
    this.fcurDistributionMultiply = fcurDistributionMultiply;
    return this;
  }
  private java.math.BigDecimal fcurDividendsPaid;
  public java.math.BigDecimal get_fcurDividendsPaid() {
    return fcurDividendsPaid;
  }
  public void set_fcurDividendsPaid(java.math.BigDecimal fcurDividendsPaid) {
    this.fcurDividendsPaid = fcurDividendsPaid;
  }
  public tblnz_rtnrwts with_fcurDividendsPaid(java.math.BigDecimal fcurDividendsPaid) {
    this.fcurDividendsPaid = fcurDividendsPaid;
    return this;
  }
  private java.math.BigDecimal fcurDividendMultiply;
  public java.math.BigDecimal get_fcurDividendMultiply() {
    return fcurDividendMultiply;
  }
  public void set_fcurDividendMultiply(java.math.BigDecimal fcurDividendMultiply) {
    this.fcurDividendMultiply = fcurDividendMultiply;
  }
  public tblnz_rtnrwts with_fcurDividendMultiply(java.math.BigDecimal fcurDividendMultiply) {
    this.fcurDividendMultiply = fcurDividendMultiply;
    return this;
  }
  private java.math.BigDecimal fcurRWTLiability;
  public java.math.BigDecimal get_fcurRWTLiability() {
    return fcurRWTLiability;
  }
  public void set_fcurRWTLiability(java.math.BigDecimal fcurRWTLiability) {
    this.fcurRWTLiability = fcurRWTLiability;
  }
  public tblnz_rtnrwts with_fcurRWTLiability(java.math.BigDecimal fcurRWTLiability) {
    this.fcurRWTLiability = fcurRWTLiability;
    return this;
  }
  private java.math.BigDecimal fcurManualRWTDividends;
  public java.math.BigDecimal get_fcurManualRWTDividends() {
    return fcurManualRWTDividends;
  }
  public void set_fcurManualRWTDividends(java.math.BigDecimal fcurManualRWTDividends) {
    this.fcurManualRWTDividends = fcurManualRWTDividends;
  }
  public tblnz_rtnrwts with_fcurManualRWTDividends(java.math.BigDecimal fcurManualRWTDividends) {
    this.fcurManualRWTDividends = fcurManualRWTDividends;
    return this;
  }
  private java.math.BigDecimal fcurTotalRWTDividends;
  public java.math.BigDecimal get_fcurTotalRWTDividends() {
    return fcurTotalRWTDividends;
  }
  public void set_fcurTotalRWTDividends(java.math.BigDecimal fcurTotalRWTDividends) {
    this.fcurTotalRWTDividends = fcurTotalRWTDividends;
  }
  public tblnz_rtnrwts with_fcurTotalRWTDividends(java.math.BigDecimal fcurTotalRWTDividends) {
    this.fcurTotalRWTDividends = fcurTotalRWTDividends;
    return this;
  }
  private java.math.BigDecimal fcurTotalAlreadyDeducted;
  public java.math.BigDecimal get_fcurTotalAlreadyDeducted() {
    return fcurTotalAlreadyDeducted;
  }
  public void set_fcurTotalAlreadyDeducted(java.math.BigDecimal fcurTotalAlreadyDeducted) {
    this.fcurTotalAlreadyDeducted = fcurTotalAlreadyDeducted;
  }
  public tblnz_rtnrwts with_fcurTotalAlreadyDeducted(java.math.BigDecimal fcurTotalAlreadyDeducted) {
    this.fcurTotalAlreadyDeducted = fcurTotalAlreadyDeducted;
    return this;
  }
  private java.math.BigDecimal fcurImputationAttached;
  public java.math.BigDecimal get_fcurImputationAttached() {
    return fcurImputationAttached;
  }
  public void set_fcurImputationAttached(java.math.BigDecimal fcurImputationAttached) {
    this.fcurImputationAttached = fcurImputationAttached;
  }
  public tblnz_rtnrwts with_fcurImputationAttached(java.math.BigDecimal fcurImputationAttached) {
    this.fcurImputationAttached = fcurImputationAttached;
    return this;
  }
  private java.math.BigDecimal fcurFDPAttached;
  public java.math.BigDecimal get_fcurFDPAttached() {
    return fcurFDPAttached;
  }
  public void set_fcurFDPAttached(java.math.BigDecimal fcurFDPAttached) {
    this.fcurFDPAttached = fcurFDPAttached;
  }
  public tblnz_rtnrwts with_fcurFDPAttached(java.math.BigDecimal fcurFDPAttached) {
    this.fcurFDPAttached = fcurFDPAttached;
    return this;
  }
  private java.math.BigDecimal fcurTotalTaxCredits;
  public java.math.BigDecimal get_fcurTotalTaxCredits() {
    return fcurTotalTaxCredits;
  }
  public void set_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
  }
  public tblnz_rtnrwts with_fcurTotalTaxCredits(java.math.BigDecimal fcurTotalTaxCredits) {
    this.fcurTotalTaxCredits = fcurTotalTaxCredits;
    return this;
  }
  private java.math.BigDecimal fcurRWTFinal;
  public java.math.BigDecimal get_fcurRWTFinal() {
    return fcurRWTFinal;
  }
  public void set_fcurRWTFinal(java.math.BigDecimal fcurRWTFinal) {
    this.fcurRWTFinal = fcurRWTFinal;
  }
  public tblnz_rtnrwts with_fcurRWTFinal(java.math.BigDecimal fcurRWTFinal) {
    this.fcurRWTFinal = fcurRWTFinal;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_rtnrwts with_fstrWho(String fstrWho) {
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
  public tblnz_rtnrwts with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwts)) {
      return false;
    }
    tblnz_rtnrwts that = (tblnz_rtnrwts) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnAgent == null ? that.fblnAgent == null : this.fblnAgent.equals(that.fblnAgent));
    equal = equal && (this.fcurAmountPaid == null ? that.fcurAmountPaid == null : this.fcurAmountPaid.equals(that.fcurAmountPaid));
    equal = equal && (this.fcurAmountNotRWT == null ? that.fcurAmountNotRWT == null : this.fcurAmountNotRWT.equals(that.fcurAmountNotRWT));
    equal = equal && (this.fcurAmountSubjectRWT == null ? that.fcurAmountSubjectRWT == null : this.fcurAmountSubjectRWT.equals(that.fcurAmountSubjectRWT));
    equal = equal && (this.fcurDistributionsPaidIRD == null ? that.fcurDistributionsPaidIRD == null : this.fcurDistributionsPaidIRD.equals(that.fcurDistributionsPaidIRD));
    equal = equal && (this.fcurDistributionIRDMultiply == null ? that.fcurDistributionIRDMultiply == null : this.fcurDistributionIRDMultiply.equals(that.fcurDistributionIRDMultiply));
    equal = equal && (this.fcurDistributionsPaid == null ? that.fcurDistributionsPaid == null : this.fcurDistributionsPaid.equals(that.fcurDistributionsPaid));
    equal = equal && (this.fcurDistributionMultiply == null ? that.fcurDistributionMultiply == null : this.fcurDistributionMultiply.equals(that.fcurDistributionMultiply));
    equal = equal && (this.fcurDividendsPaid == null ? that.fcurDividendsPaid == null : this.fcurDividendsPaid.equals(that.fcurDividendsPaid));
    equal = equal && (this.fcurDividendMultiply == null ? that.fcurDividendMultiply == null : this.fcurDividendMultiply.equals(that.fcurDividendMultiply));
    equal = equal && (this.fcurRWTLiability == null ? that.fcurRWTLiability == null : this.fcurRWTLiability.equals(that.fcurRWTLiability));
    equal = equal && (this.fcurManualRWTDividends == null ? that.fcurManualRWTDividends == null : this.fcurManualRWTDividends.equals(that.fcurManualRWTDividends));
    equal = equal && (this.fcurTotalRWTDividends == null ? that.fcurTotalRWTDividends == null : this.fcurTotalRWTDividends.equals(that.fcurTotalRWTDividends));
    equal = equal && (this.fcurTotalAlreadyDeducted == null ? that.fcurTotalAlreadyDeducted == null : this.fcurTotalAlreadyDeducted.equals(that.fcurTotalAlreadyDeducted));
    equal = equal && (this.fcurImputationAttached == null ? that.fcurImputationAttached == null : this.fcurImputationAttached.equals(that.fcurImputationAttached));
    equal = equal && (this.fcurFDPAttached == null ? that.fcurFDPAttached == null : this.fcurFDPAttached.equals(that.fcurFDPAttached));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurRWTFinal == null ? that.fcurRWTFinal == null : this.fcurRWTFinal.equals(that.fcurRWTFinal));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_rtnrwts)) {
      return false;
    }
    tblnz_rtnrwts that = (tblnz_rtnrwts) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.fblnAgent == null ? that.fblnAgent == null : this.fblnAgent.equals(that.fblnAgent));
    equal = equal && (this.fcurAmountPaid == null ? that.fcurAmountPaid == null : this.fcurAmountPaid.equals(that.fcurAmountPaid));
    equal = equal && (this.fcurAmountNotRWT == null ? that.fcurAmountNotRWT == null : this.fcurAmountNotRWT.equals(that.fcurAmountNotRWT));
    equal = equal && (this.fcurAmountSubjectRWT == null ? that.fcurAmountSubjectRWT == null : this.fcurAmountSubjectRWT.equals(that.fcurAmountSubjectRWT));
    equal = equal && (this.fcurDistributionsPaidIRD == null ? that.fcurDistributionsPaidIRD == null : this.fcurDistributionsPaidIRD.equals(that.fcurDistributionsPaidIRD));
    equal = equal && (this.fcurDistributionIRDMultiply == null ? that.fcurDistributionIRDMultiply == null : this.fcurDistributionIRDMultiply.equals(that.fcurDistributionIRDMultiply));
    equal = equal && (this.fcurDistributionsPaid == null ? that.fcurDistributionsPaid == null : this.fcurDistributionsPaid.equals(that.fcurDistributionsPaid));
    equal = equal && (this.fcurDistributionMultiply == null ? that.fcurDistributionMultiply == null : this.fcurDistributionMultiply.equals(that.fcurDistributionMultiply));
    equal = equal && (this.fcurDividendsPaid == null ? that.fcurDividendsPaid == null : this.fcurDividendsPaid.equals(that.fcurDividendsPaid));
    equal = equal && (this.fcurDividendMultiply == null ? that.fcurDividendMultiply == null : this.fcurDividendMultiply.equals(that.fcurDividendMultiply));
    equal = equal && (this.fcurRWTLiability == null ? that.fcurRWTLiability == null : this.fcurRWTLiability.equals(that.fcurRWTLiability));
    equal = equal && (this.fcurManualRWTDividends == null ? that.fcurManualRWTDividends == null : this.fcurManualRWTDividends.equals(that.fcurManualRWTDividends));
    equal = equal && (this.fcurTotalRWTDividends == null ? that.fcurTotalRWTDividends == null : this.fcurTotalRWTDividends.equals(that.fcurTotalRWTDividends));
    equal = equal && (this.fcurTotalAlreadyDeducted == null ? that.fcurTotalAlreadyDeducted == null : this.fcurTotalAlreadyDeducted.equals(that.fcurTotalAlreadyDeducted));
    equal = equal && (this.fcurImputationAttached == null ? that.fcurImputationAttached == null : this.fcurImputationAttached.equals(that.fcurImputationAttached));
    equal = equal && (this.fcurFDPAttached == null ? that.fcurFDPAttached == null : this.fcurFDPAttached.equals(that.fcurFDPAttached));
    equal = equal && (this.fcurTotalTaxCredits == null ? that.fcurTotalTaxCredits == null : this.fcurTotalTaxCredits.equals(that.fcurTotalTaxCredits));
    equal = equal && (this.fcurRWTFinal == null ? that.fcurRWTFinal == null : this.fcurRWTFinal.equals(that.fcurRWTFinal));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnAgent = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurAmountPaid = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurAmountNotRWT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurAmountSubjectRWT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDistributionsPaidIRD = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDistributionIRDMultiply = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDistributionsPaid = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurDistributionMultiply = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDividendsPaid = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurDividendMultiply = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurRWTLiability = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurManualRWTDividends = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalRWTDividends = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalAlreadyDeducted = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurImputationAttached = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurFDPAttached = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurRWTFinal = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fblnAgent = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fcurAmountPaid = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.fcurAmountNotRWT = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.fcurAmountSubjectRWT = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.fcurDistributionsPaidIRD = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.fcurDistributionIRDMultiply = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.fcurDistributionsPaid = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.fcurDistributionMultiply = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.fcurDividendsPaid = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.fcurDividendMultiply = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.fcurRWTLiability = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.fcurManualRWTDividends = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.fcurTotalRWTDividends = JdbcWritableBridge.readBigDecimal(14, __dbResults);
    this.fcurTotalAlreadyDeducted = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.fcurImputationAttached = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.fcurFDPAttached = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.fcurTotalTaxCredits = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.fcurRWTFinal = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(20, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(21, __dbResults);
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
    JdbcWritableBridge.writeInteger(fblnAgent, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPaid, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountNotRWT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountSubjectRWT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionsPaidIRD, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionIRDMultiply, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionsPaid, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionMultiply, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsPaid, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendMultiply, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTLiability, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurManualRWTDividends, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTDividends, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAlreadyDeducted, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationAttached, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPAttached, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTFinal, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAgent, 2 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountPaid, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountNotRWT, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmountSubjectRWT, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionsPaidIRD, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionIRDMultiply, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionsPaid, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDistributionMultiply, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendsPaid, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurDividendMultiply, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTLiability, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurManualRWTDividends, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalRWTDividends, 14 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalAlreadyDeducted, 15 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurImputationAttached, 16 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFDPAttached, 17 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurTotalTaxCredits, 18 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurRWTFinal, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 20 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 21 + __off, 93, __dbStmt);
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
        this.fblnAgent = null;
    } else {
    this.fblnAgent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountPaid = null;
    } else {
    this.fcurAmountPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountNotRWT = null;
    } else {
    this.fcurAmountNotRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmountSubjectRWT = null;
    } else {
    this.fcurAmountSubjectRWT = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDistributionsPaidIRD = null;
    } else {
    this.fcurDistributionsPaidIRD = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDistributionIRDMultiply = null;
    } else {
    this.fcurDistributionIRDMultiply = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDistributionsPaid = null;
    } else {
    this.fcurDistributionsPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDistributionMultiply = null;
    } else {
    this.fcurDistributionMultiply = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendsPaid = null;
    } else {
    this.fcurDividendsPaid = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurDividendMultiply = null;
    } else {
    this.fcurDividendMultiply = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTLiability = null;
    } else {
    this.fcurRWTLiability = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurManualRWTDividends = null;
    } else {
    this.fcurManualRWTDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalRWTDividends = null;
    } else {
    this.fcurTotalRWTDividends = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalAlreadyDeducted = null;
    } else {
    this.fcurTotalAlreadyDeducted = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurImputationAttached = null;
    } else {
    this.fcurImputationAttached = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFDPAttached = null;
    } else {
    this.fcurFDPAttached = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurTotalTaxCredits = null;
    } else {
    this.fcurTotalTaxCredits = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurRWTFinal = null;
    } else {
    this.fcurRWTFinal = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
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
    if (null == this.fblnAgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAgent);
    }
    if (null == this.fcurAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPaid, __dataOut);
    }
    if (null == this.fcurAmountNotRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountNotRWT, __dataOut);
    }
    if (null == this.fcurAmountSubjectRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountSubjectRWT, __dataOut);
    }
    if (null == this.fcurDistributionsPaidIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionsPaidIRD, __dataOut);
    }
    if (null == this.fcurDistributionIRDMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionIRDMultiply, __dataOut);
    }
    if (null == this.fcurDistributionsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionsPaid, __dataOut);
    }
    if (null == this.fcurDistributionMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionMultiply, __dataOut);
    }
    if (null == this.fcurDividendsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsPaid, __dataOut);
    }
    if (null == this.fcurDividendMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendMultiply, __dataOut);
    }
    if (null == this.fcurRWTLiability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTLiability, __dataOut);
    }
    if (null == this.fcurManualRWTDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurManualRWTDividends, __dataOut);
    }
    if (null == this.fcurTotalRWTDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTDividends, __dataOut);
    }
    if (null == this.fcurTotalAlreadyDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAlreadyDeducted, __dataOut);
    }
    if (null == this.fcurImputationAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationAttached, __dataOut);
    }
    if (null == this.fcurFDPAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPAttached, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurRWTFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTFinal, __dataOut);
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
    if (null == this.fblnAgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAgent);
    }
    if (null == this.fcurAmountPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountPaid, __dataOut);
    }
    if (null == this.fcurAmountNotRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountNotRWT, __dataOut);
    }
    if (null == this.fcurAmountSubjectRWT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmountSubjectRWT, __dataOut);
    }
    if (null == this.fcurDistributionsPaidIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionsPaidIRD, __dataOut);
    }
    if (null == this.fcurDistributionIRDMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionIRDMultiply, __dataOut);
    }
    if (null == this.fcurDistributionsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionsPaid, __dataOut);
    }
    if (null == this.fcurDistributionMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDistributionMultiply, __dataOut);
    }
    if (null == this.fcurDividendsPaid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendsPaid, __dataOut);
    }
    if (null == this.fcurDividendMultiply) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurDividendMultiply, __dataOut);
    }
    if (null == this.fcurRWTLiability) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTLiability, __dataOut);
    }
    if (null == this.fcurManualRWTDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurManualRWTDividends, __dataOut);
    }
    if (null == this.fcurTotalRWTDividends) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalRWTDividends, __dataOut);
    }
    if (null == this.fcurTotalAlreadyDeducted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalAlreadyDeducted, __dataOut);
    }
    if (null == this.fcurImputationAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurImputationAttached, __dataOut);
    }
    if (null == this.fcurFDPAttached) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFDPAttached, __dataOut);
    }
    if (null == this.fcurTotalTaxCredits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurTotalTaxCredits, __dataOut);
    }
    if (null == this.fcurRWTFinal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurRWTFinal, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAgent==null?"\\N":"" + fblnAgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPaid==null?"\\N":fcurAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountNotRWT==null?"\\N":fcurAmountNotRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountSubjectRWT==null?"\\N":fcurAmountSubjectRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionsPaidIRD==null?"\\N":fcurDistributionsPaidIRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionIRDMultiply==null?"\\N":fcurDistributionIRDMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionsPaid==null?"\\N":fcurDistributionsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionMultiply==null?"\\N":fcurDistributionMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsPaid==null?"\\N":fcurDividendsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendMultiply==null?"\\N":fcurDividendMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTLiability==null?"\\N":fcurRWTLiability.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurManualRWTDividends==null?"\\N":fcurManualRWTDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTDividends==null?"\\N":fcurTotalRWTDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAlreadyDeducted==null?"\\N":fcurTotalAlreadyDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationAttached==null?"\\N":fcurImputationAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPAttached==null?"\\N":fcurFDPAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTFinal==null?"\\N":fcurRWTFinal.toPlainString(), delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAgent==null?"\\N":"" + fblnAgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountPaid==null?"\\N":fcurAmountPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountNotRWT==null?"\\N":fcurAmountNotRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmountSubjectRWT==null?"\\N":fcurAmountSubjectRWT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionsPaidIRD==null?"\\N":fcurDistributionsPaidIRD.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionIRDMultiply==null?"\\N":fcurDistributionIRDMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionsPaid==null?"\\N":fcurDistributionsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDistributionMultiply==null?"\\N":fcurDistributionMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendsPaid==null?"\\N":fcurDividendsPaid.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurDividendMultiply==null?"\\N":fcurDividendMultiply.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTLiability==null?"\\N":fcurRWTLiability.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurManualRWTDividends==null?"\\N":fcurManualRWTDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalRWTDividends==null?"\\N":fcurTotalRWTDividends.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalAlreadyDeducted==null?"\\N":fcurTotalAlreadyDeducted.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurImputationAttached==null?"\\N":fcurImputationAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFDPAttached==null?"\\N":fcurFDPAttached.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurTotalTaxCredits==null?"\\N":fcurTotalTaxCredits.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurRWTFinal==null?"\\N":fcurRWTFinal.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAgent = null; } else {
      this.fblnAgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPaid = null; } else {
      this.fcurAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountNotRWT = null; } else {
      this.fcurAmountNotRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountSubjectRWT = null; } else {
      this.fcurAmountSubjectRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionsPaidIRD = null; } else {
      this.fcurDistributionsPaidIRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionIRDMultiply = null; } else {
      this.fcurDistributionIRDMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionsPaid = null; } else {
      this.fcurDistributionsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionMultiply = null; } else {
      this.fcurDistributionMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsPaid = null; } else {
      this.fcurDividendsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendMultiply = null; } else {
      this.fcurDividendMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTLiability = null; } else {
      this.fcurRWTLiability = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurManualRWTDividends = null; } else {
      this.fcurManualRWTDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTDividends = null; } else {
      this.fcurTotalRWTDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAlreadyDeducted = null; } else {
      this.fcurTotalAlreadyDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationAttached = null; } else {
      this.fcurImputationAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPAttached = null; } else {
      this.fcurFDPAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCredits = null; } else {
      this.fcurTotalTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTFinal = null; } else {
      this.fcurRWTFinal = new java.math.BigDecimal(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAgent = null; } else {
      this.fblnAgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountPaid = null; } else {
      this.fcurAmountPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountNotRWT = null; } else {
      this.fcurAmountNotRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmountSubjectRWT = null; } else {
      this.fcurAmountSubjectRWT = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionsPaidIRD = null; } else {
      this.fcurDistributionsPaidIRD = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionIRDMultiply = null; } else {
      this.fcurDistributionIRDMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionsPaid = null; } else {
      this.fcurDistributionsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDistributionMultiply = null; } else {
      this.fcurDistributionMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendsPaid = null; } else {
      this.fcurDividendsPaid = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurDividendMultiply = null; } else {
      this.fcurDividendMultiply = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTLiability = null; } else {
      this.fcurRWTLiability = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurManualRWTDividends = null; } else {
      this.fcurManualRWTDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalRWTDividends = null; } else {
      this.fcurTotalRWTDividends = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalAlreadyDeducted = null; } else {
      this.fcurTotalAlreadyDeducted = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurImputationAttached = null; } else {
      this.fcurImputationAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFDPAttached = null; } else {
      this.fcurFDPAttached = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurTotalTaxCredits = null; } else {
      this.fcurTotalTaxCredits = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurRWTFinal = null; } else {
      this.fcurRWTFinal = new java.math.BigDecimal(__cur_str);
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
    tblnz_rtnrwts o = (tblnz_rtnrwts) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_rtnrwts o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnAgent", this.fblnAgent);
    __sqoop$field_map.put("fcurAmountPaid", this.fcurAmountPaid);
    __sqoop$field_map.put("fcurAmountNotRWT", this.fcurAmountNotRWT);
    __sqoop$field_map.put("fcurAmountSubjectRWT", this.fcurAmountSubjectRWT);
    __sqoop$field_map.put("fcurDistributionsPaidIRD", this.fcurDistributionsPaidIRD);
    __sqoop$field_map.put("fcurDistributionIRDMultiply", this.fcurDistributionIRDMultiply);
    __sqoop$field_map.put("fcurDistributionsPaid", this.fcurDistributionsPaid);
    __sqoop$field_map.put("fcurDistributionMultiply", this.fcurDistributionMultiply);
    __sqoop$field_map.put("fcurDividendsPaid", this.fcurDividendsPaid);
    __sqoop$field_map.put("fcurDividendMultiply", this.fcurDividendMultiply);
    __sqoop$field_map.put("fcurRWTLiability", this.fcurRWTLiability);
    __sqoop$field_map.put("fcurManualRWTDividends", this.fcurManualRWTDividends);
    __sqoop$field_map.put("fcurTotalRWTDividends", this.fcurTotalRWTDividends);
    __sqoop$field_map.put("fcurTotalAlreadyDeducted", this.fcurTotalAlreadyDeducted);
    __sqoop$field_map.put("fcurImputationAttached", this.fcurImputationAttached);
    __sqoop$field_map.put("fcurFDPAttached", this.fcurFDPAttached);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurRWTFinal", this.fcurRWTFinal);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("fblnAgent", this.fblnAgent);
    __sqoop$field_map.put("fcurAmountPaid", this.fcurAmountPaid);
    __sqoop$field_map.put("fcurAmountNotRWT", this.fcurAmountNotRWT);
    __sqoop$field_map.put("fcurAmountSubjectRWT", this.fcurAmountSubjectRWT);
    __sqoop$field_map.put("fcurDistributionsPaidIRD", this.fcurDistributionsPaidIRD);
    __sqoop$field_map.put("fcurDistributionIRDMultiply", this.fcurDistributionIRDMultiply);
    __sqoop$field_map.put("fcurDistributionsPaid", this.fcurDistributionsPaid);
    __sqoop$field_map.put("fcurDistributionMultiply", this.fcurDistributionMultiply);
    __sqoop$field_map.put("fcurDividendsPaid", this.fcurDividendsPaid);
    __sqoop$field_map.put("fcurDividendMultiply", this.fcurDividendMultiply);
    __sqoop$field_map.put("fcurRWTLiability", this.fcurRWTLiability);
    __sqoop$field_map.put("fcurManualRWTDividends", this.fcurManualRWTDividends);
    __sqoop$field_map.put("fcurTotalRWTDividends", this.fcurTotalRWTDividends);
    __sqoop$field_map.put("fcurTotalAlreadyDeducted", this.fcurTotalAlreadyDeducted);
    __sqoop$field_map.put("fcurImputationAttached", this.fcurImputationAttached);
    __sqoop$field_map.put("fcurFDPAttached", this.fcurFDPAttached);
    __sqoop$field_map.put("fcurTotalTaxCredits", this.fcurTotalTaxCredits);
    __sqoop$field_map.put("fcurRWTFinal", this.fcurRWTFinal);
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
