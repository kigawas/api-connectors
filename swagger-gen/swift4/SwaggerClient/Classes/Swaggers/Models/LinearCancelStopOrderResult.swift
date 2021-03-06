//
// LinearCancelStopOrderResult.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Cancel Linear Stop Order */

public struct LinearCancelStopOrderResult: Codable {

    public var stopOrderId: String?

    public init(stopOrderId: String?) {
        self.stopOrderId = stopOrderId
    }

    public enum CodingKeys: String, CodingKey { 
        case stopOrderId = "stop_order_id"
    }


}

