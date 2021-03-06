/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.8.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * MarkPriceKlineInfo.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_MODEL_MarkPriceKlineInfo_H_
#define IO_SWAGGER_CLIENT_MODEL_MarkPriceKlineInfo_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  MarkPriceKlineInfo
    : public ModelBase
{
public:
    MarkPriceKlineInfo();
    virtual ~MarkPriceKlineInfo();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MarkPriceKlineInfo members

    /// <summary>
    /// 
    /// </summary>
    int32_t getId() const;
    bool idIsSet() const;
    void unsetId();
    void setId(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSymbol() const;
    bool symbolIsSet() const;
    void unsetSymbol();
    void setSymbol(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getPeriod() const;
    bool periodIsSet() const;
    void unsetPeriod();
    void setPeriod(utility::string_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getStartAt() const;
    bool startAtIsSet() const;
    void unsetStart_at();
    void setStartAt(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getOpen() const;
    bool openIsSet() const;
    void unsetOpen();
    void setOpen(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getHigh() const;
    bool highIsSet() const;
    void unsetHigh();
    void setHigh(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getLow() const;
    bool lowIsSet() const;
    void unsetLow();
    void setLow(int32_t value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getClose() const;
    bool closeIsSet() const;
    void unsetClose();
    void setClose(int32_t value);

protected:
    int32_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Symbol;
    bool m_SymbolIsSet;
    utility::string_t m_Period;
    bool m_PeriodIsSet;
    int32_t m_Start_at;
    bool m_Start_atIsSet;
    int32_t m_Open;
    bool m_OpenIsSet;
    int32_t m_High;
    bool m_HighIsSet;
    int32_t m_Low;
    bool m_LowIsSet;
    int32_t m_Close;
    bool m_CloseIsSet;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_MODEL_MarkPriceKlineInfo_H_ */
