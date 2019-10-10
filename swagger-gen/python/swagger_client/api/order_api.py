# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange.   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class OrderApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def order_cancel(self, order_id, **kwargs):  # noqa: E501
        """Get my active order list.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.order_cancel(order_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str order_id: Order ID (required)
        :param str symbol: Contract type.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.order_cancel_with_http_info(order_id, **kwargs)  # noqa: E501
        else:
            (data) = self.order_cancel_with_http_info(order_id, **kwargs)  # noqa: E501
            return data

    def order_cancel_with_http_info(self, order_id, **kwargs):  # noqa: E501
        """Get my active order list.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.order_cancel_with_http_info(order_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str order_id: Order ID (required)
        :param str symbol: Contract type.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['order_id', 'symbol']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_cancel" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'order_id' is set
        if ('order_id' not in params or
                params['order_id'] is None):
            raise ValueError("Missing the required parameter `order_id` when calling `order_cancel`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'order_id' in params:
            query_params.append(('order_id', params['order_id']))  # noqa: E501
        if 'symbol' in params:
            query_params.append(('symbol', params['symbol']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open-api/order/cancel', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def order_get_orders(self, **kwargs):  # noqa: E501
        """Get my active order list.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.order_get_orders(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str order_id: Order ID
        :param str order_link_id: Customized order ID.
        :param str symbol: Contract type. Default BTCUSD
        :param str order: Sort orders by creation date
        :param float page: Page. Default getting first page data
        :param float limit: TLimit for data size per page, max size is 50. Default as showing 20 pieces of data per page
        :param str order_status: Query your orders for all statuses if 'order_status' is empty. If you want to query orders with specific statuses , you can pass the order_status split by
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.order_get_orders_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.order_get_orders_with_http_info(**kwargs)  # noqa: E501
            return data

    def order_get_orders_with_http_info(self, **kwargs):  # noqa: E501
        """Get my active order list.  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.order_get_orders_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str order_id: Order ID
        :param str order_link_id: Customized order ID.
        :param str symbol: Contract type. Default BTCUSD
        :param str order: Sort orders by creation date
        :param float page: Page. Default getting first page data
        :param float limit: TLimit for data size per page, max size is 50. Default as showing 20 pieces of data per page
        :param str order_status: Query your orders for all statuses if 'order_status' is empty. If you want to query orders with specific statuses , you can pass the order_status split by
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['order_id', 'order_link_id', 'symbol', 'order', 'page', 'limit', 'order_status']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_get_orders" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'order_id' in params:
            query_params.append(('order_id', params['order_id']))  # noqa: E501
        if 'order_link_id' in params:
            query_params.append(('order_link_id', params['order_link_id']))  # noqa: E501
        if 'symbol' in params:
            query_params.append(('symbol', params['symbol']))  # noqa: E501
        if 'order' in params:
            query_params.append(('order', params['order']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'limit' in params:
            query_params.append(('limit', params['limit']))  # noqa: E501
        if 'order_status' in params:
            query_params.append(('order_status', params['order_status']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open-api/order/list', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def order_new(self, side, symbol, order_type, qty, price, time_in_force, **kwargs):  # noqa: E501
        """Place active order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.order_new(side, symbol, order_type, qty, price, time_in_force, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str side: Side (required)
        :param str symbol: Contract type. (required)
        :param str order_type: Active order type (required)
        :param float qty:  (required)
        :param float price: Order price. (required)
        :param str time_in_force: Time in force (required)
        :param float take_profit: take profit price
        :param float stop_loss: stop loss price
        :param bool reduce_only: reduce only
        :param bool close_on_trigger: close on trigger
        :param str order_link_id: TCustomized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.order_new_with_http_info(side, symbol, order_type, qty, price, time_in_force, **kwargs)  # noqa: E501
        else:
            (data) = self.order_new_with_http_info(side, symbol, order_type, qty, price, time_in_force, **kwargs)  # noqa: E501
            return data

    def order_new_with_http_info(self, side, symbol, order_type, qty, price, time_in_force, **kwargs):  # noqa: E501
        """Place active order  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.order_new_with_http_info(side, symbol, order_type, qty, price, time_in_force, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str side: Side (required)
        :param str symbol: Contract type. (required)
        :param str order_type: Active order type (required)
        :param float qty:  (required)
        :param float price: Order price. (required)
        :param str time_in_force: Time in force (required)
        :param float take_profit: take profit price
        :param float stop_loss: stop loss price
        :param bool reduce_only: reduce only
        :param bool close_on_trigger: close on trigger
        :param str order_link_id: TCustomized order ID, maximum length at 36 characters, and order ID under the same agency has to be unique.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['side', 'symbol', 'order_type', 'qty', 'price', 'time_in_force', 'take_profit', 'stop_loss', 'reduce_only', 'close_on_trigger', 'order_link_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_new" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'side' is set
        if ('side' not in params or
                params['side'] is None):
            raise ValueError("Missing the required parameter `side` when calling `order_new`")  # noqa: E501
        # verify the required parameter 'symbol' is set
        if ('symbol' not in params or
                params['symbol'] is None):
            raise ValueError("Missing the required parameter `symbol` when calling `order_new`")  # noqa: E501
        # verify the required parameter 'order_type' is set
        if ('order_type' not in params or
                params['order_type'] is None):
            raise ValueError("Missing the required parameter `order_type` when calling `order_new`")  # noqa: E501
        # verify the required parameter 'qty' is set
        if ('qty' not in params or
                params['qty'] is None):
            raise ValueError("Missing the required parameter `qty` when calling `order_new`")  # noqa: E501
        # verify the required parameter 'price' is set
        if ('price' not in params or
                params['price'] is None):
            raise ValueError("Missing the required parameter `price` when calling `order_new`")  # noqa: E501
        # verify the required parameter 'time_in_force' is set
        if ('time_in_force' not in params or
                params['time_in_force'] is None):
            raise ValueError("Missing the required parameter `time_in_force` when calling `order_new`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'side' in params:
            query_params.append(('side', params['side']))  # noqa: E501
        if 'symbol' in params:
            query_params.append(('symbol', params['symbol']))  # noqa: E501
        if 'order_type' in params:
            query_params.append(('order_type', params['order_type']))  # noqa: E501
        if 'qty' in params:
            query_params.append(('qty', params['qty']))  # noqa: E501
        if 'price' in params:
            query_params.append(('price', params['price']))  # noqa: E501
        if 'time_in_force' in params:
            query_params.append(('time_in_force', params['time_in_force']))  # noqa: E501
        if 'take_profit' in params:
            query_params.append(('take_profit', params['take_profit']))  # noqa: E501
        if 'stop_loss' in params:
            query_params.append(('stop_loss', params['stop_loss']))  # noqa: E501
        if 'reduce_only' in params:
            query_params.append(('reduce_only', params['reduce_only']))  # noqa: E501
        if 'close_on_trigger' in params:
            query_params.append(('close_on_trigger', params['close_on_trigger']))  # noqa: E501
        if 'order_link_id' in params:
            query_params.append(('order_link_id', params['order_link_id']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/open-api/order/create', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)