/* 
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// LinearClosedPnlRecordResult
    /// </summary>
    [DataContract]
    public partial class LinearClosedPnlRecordResult :  IEquatable<LinearClosedPnlRecordResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LinearClosedPnlRecordResult" /> class.
        /// </summary>
        /// <param name="avgEntryPrice">avgEntryPrice.</param>
        /// <param name="avgExitPrice">avgExitPrice.</param>
        /// <param name="closedPnl">closedPnl.</param>
        /// <param name="closedSize">closedSize.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="cumEntryValue">cumEntryValue.</param>
        /// <param name="cumExitValue">cumExitValue.</param>
        /// <param name="execType">execType.</param>
        /// <param name="fillCount">fillCount.</param>
        /// <param name="id">id.</param>
        /// <param name="leverage">leverage.</param>
        /// <param name="orderId">orderId.</param>
        /// <param name="orderPrice">orderPrice.</param>
        /// <param name="orderType">orderType.</param>
        /// <param name="qty">qty.</param>
        /// <param name="side">side.</param>
        /// <param name="symbol">symbol.</param>
        /// <param name="userId">userId.</param>
        public LinearClosedPnlRecordResult(double? avgEntryPrice = default(double?), double? avgExitPrice = default(double?), double? closedPnl = default(double?), double? closedSize = default(double?), long? createdAt = default(long?), double? cumEntryValue = default(double?), double? cumExitValue = default(double?), string execType = default(string), int? fillCount = default(int?), long? id = default(long?), double? leverage = default(double?), string orderId = default(string), double? orderPrice = default(double?), string orderType = default(string), double? qty = default(double?), string side = default(string), string symbol = default(string), long? userId = default(long?))
        {
            this.AvgEntryPrice = avgEntryPrice;
            this.AvgExitPrice = avgExitPrice;
            this.ClosedPnl = closedPnl;
            this.ClosedSize = closedSize;
            this.CreatedAt = createdAt;
            this.CumEntryValue = cumEntryValue;
            this.CumExitValue = cumExitValue;
            this.ExecType = execType;
            this.FillCount = fillCount;
            this.Id = id;
            this.Leverage = leverage;
            this.OrderId = orderId;
            this.OrderPrice = orderPrice;
            this.OrderType = orderType;
            this.Qty = qty;
            this.Side = side;
            this.Symbol = symbol;
            this.UserId = userId;
        }
        
        /// <summary>
        /// Gets or Sets AvgEntryPrice
        /// </summary>
        [DataMember(Name="avg_entry_price", EmitDefaultValue=false)]
        public double? AvgEntryPrice { get; set; }

        /// <summary>
        /// Gets or Sets AvgExitPrice
        /// </summary>
        [DataMember(Name="avg_exit_price", EmitDefaultValue=false)]
        public double? AvgExitPrice { get; set; }

        /// <summary>
        /// Gets or Sets ClosedPnl
        /// </summary>
        [DataMember(Name="closed_pnl", EmitDefaultValue=false)]
        public double? ClosedPnl { get; set; }

        /// <summary>
        /// Gets or Sets ClosedSize
        /// </summary>
        [DataMember(Name="closed_size", EmitDefaultValue=false)]
        public double? ClosedSize { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name="created_at", EmitDefaultValue=false)]
        public long? CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets CumEntryValue
        /// </summary>
        [DataMember(Name="cum_entry_value", EmitDefaultValue=false)]
        public double? CumEntryValue { get; set; }

        /// <summary>
        /// Gets or Sets CumExitValue
        /// </summary>
        [DataMember(Name="cum_exit_value", EmitDefaultValue=false)]
        public double? CumExitValue { get; set; }

        /// <summary>
        /// Gets or Sets ExecType
        /// </summary>
        [DataMember(Name="exec_type", EmitDefaultValue=false)]
        public string ExecType { get; set; }

        /// <summary>
        /// Gets or Sets FillCount
        /// </summary>
        [DataMember(Name="fill_count", EmitDefaultValue=false)]
        public int? FillCount { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long? Id { get; set; }

        /// <summary>
        /// Gets or Sets Leverage
        /// </summary>
        [DataMember(Name="leverage", EmitDefaultValue=false)]
        public double? Leverage { get; set; }

        /// <summary>
        /// Gets or Sets OrderId
        /// </summary>
        [DataMember(Name="order_id", EmitDefaultValue=false)]
        public string OrderId { get; set; }

        /// <summary>
        /// Gets or Sets OrderPrice
        /// </summary>
        [DataMember(Name="order_price", EmitDefaultValue=false)]
        public double? OrderPrice { get; set; }

        /// <summary>
        /// Gets or Sets OrderType
        /// </summary>
        [DataMember(Name="order_type", EmitDefaultValue=false)]
        public string OrderType { get; set; }

        /// <summary>
        /// Gets or Sets Qty
        /// </summary>
        [DataMember(Name="qty", EmitDefaultValue=false)]
        public double? Qty { get; set; }

        /// <summary>
        /// Gets or Sets Side
        /// </summary>
        [DataMember(Name="side", EmitDefaultValue=false)]
        public string Side { get; set; }

        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name="symbol", EmitDefaultValue=false)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="user_id", EmitDefaultValue=false)]
        public long? UserId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LinearClosedPnlRecordResult {\n");
            sb.Append("  AvgEntryPrice: ").Append(AvgEntryPrice).Append("\n");
            sb.Append("  AvgExitPrice: ").Append(AvgExitPrice).Append("\n");
            sb.Append("  ClosedPnl: ").Append(ClosedPnl).Append("\n");
            sb.Append("  ClosedSize: ").Append(ClosedSize).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CumEntryValue: ").Append(CumEntryValue).Append("\n");
            sb.Append("  CumExitValue: ").Append(CumExitValue).Append("\n");
            sb.Append("  ExecType: ").Append(ExecType).Append("\n");
            sb.Append("  FillCount: ").Append(FillCount).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Leverage: ").Append(Leverage).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  OrderPrice: ").Append(OrderPrice).Append("\n");
            sb.Append("  OrderType: ").Append(OrderType).Append("\n");
            sb.Append("  Qty: ").Append(Qty).Append("\n");
            sb.Append("  Side: ").Append(Side).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as LinearClosedPnlRecordResult);
        }

        /// <summary>
        /// Returns true if LinearClosedPnlRecordResult instances are equal
        /// </summary>
        /// <param name="input">Instance of LinearClosedPnlRecordResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LinearClosedPnlRecordResult input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AvgEntryPrice == input.AvgEntryPrice ||
                    (this.AvgEntryPrice != null &&
                    this.AvgEntryPrice.Equals(input.AvgEntryPrice))
                ) && 
                (
                    this.AvgExitPrice == input.AvgExitPrice ||
                    (this.AvgExitPrice != null &&
                    this.AvgExitPrice.Equals(input.AvgExitPrice))
                ) && 
                (
                    this.ClosedPnl == input.ClosedPnl ||
                    (this.ClosedPnl != null &&
                    this.ClosedPnl.Equals(input.ClosedPnl))
                ) && 
                (
                    this.ClosedSize == input.ClosedSize ||
                    (this.ClosedSize != null &&
                    this.ClosedSize.Equals(input.ClosedSize))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.CumEntryValue == input.CumEntryValue ||
                    (this.CumEntryValue != null &&
                    this.CumEntryValue.Equals(input.CumEntryValue))
                ) && 
                (
                    this.CumExitValue == input.CumExitValue ||
                    (this.CumExitValue != null &&
                    this.CumExitValue.Equals(input.CumExitValue))
                ) && 
                (
                    this.ExecType == input.ExecType ||
                    (this.ExecType != null &&
                    this.ExecType.Equals(input.ExecType))
                ) && 
                (
                    this.FillCount == input.FillCount ||
                    (this.FillCount != null &&
                    this.FillCount.Equals(input.FillCount))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Leverage == input.Leverage ||
                    (this.Leverage != null &&
                    this.Leverage.Equals(input.Leverage))
                ) && 
                (
                    this.OrderId == input.OrderId ||
                    (this.OrderId != null &&
                    this.OrderId.Equals(input.OrderId))
                ) && 
                (
                    this.OrderPrice == input.OrderPrice ||
                    (this.OrderPrice != null &&
                    this.OrderPrice.Equals(input.OrderPrice))
                ) && 
                (
                    this.OrderType == input.OrderType ||
                    (this.OrderType != null &&
                    this.OrderType.Equals(input.OrderType))
                ) && 
                (
                    this.Qty == input.Qty ||
                    (this.Qty != null &&
                    this.Qty.Equals(input.Qty))
                ) && 
                (
                    this.Side == input.Side ||
                    (this.Side != null &&
                    this.Side.Equals(input.Side))
                ) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AvgEntryPrice != null)
                    hashCode = hashCode * 59 + this.AvgEntryPrice.GetHashCode();
                if (this.AvgExitPrice != null)
                    hashCode = hashCode * 59 + this.AvgExitPrice.GetHashCode();
                if (this.ClosedPnl != null)
                    hashCode = hashCode * 59 + this.ClosedPnl.GetHashCode();
                if (this.ClosedSize != null)
                    hashCode = hashCode * 59 + this.ClosedSize.GetHashCode();
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.CumEntryValue != null)
                    hashCode = hashCode * 59 + this.CumEntryValue.GetHashCode();
                if (this.CumExitValue != null)
                    hashCode = hashCode * 59 + this.CumExitValue.GetHashCode();
                if (this.ExecType != null)
                    hashCode = hashCode * 59 + this.ExecType.GetHashCode();
                if (this.FillCount != null)
                    hashCode = hashCode * 59 + this.FillCount.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Leverage != null)
                    hashCode = hashCode * 59 + this.Leverage.GetHashCode();
                if (this.OrderId != null)
                    hashCode = hashCode * 59 + this.OrderId.GetHashCode();
                if (this.OrderPrice != null)
                    hashCode = hashCode * 59 + this.OrderPrice.GetHashCode();
                if (this.OrderType != null)
                    hashCode = hashCode * 59 + this.OrderType.GetHashCode();
                if (this.Qty != null)
                    hashCode = hashCode * 59 + this.Qty.GetHashCode();
                if (this.Side != null)
                    hashCode = hashCode * 59 + this.Side.GetHashCode();
                if (this.Symbol != null)
                    hashCode = hashCode * 59 + this.Symbol.GetHashCode();
                if (this.UserId != null)
                    hashCode = hashCode * 59 + this.UserId.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
