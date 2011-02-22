package com.servletgarden.acacia

import javax.servlet.ServletConfig
import javax.servlet.http.{HttpServlet, HttpServletRequest => HSReq, HttpServletResponse => HSResp}
import com.servletgarden.railsxing.CrossingServlet

class RailsScalaServlet extends CrossingServlet {
  override def init(config: ServletConfig) = super.init(config)

  override def doGet(request: HSReq, response: HSResp) = dispatch(request, response)

  override def doHead(request: HSReq, response: HSResp) = dispatch(request, response)
 
  override def doPost(request: HSReq, response: HSResp) = dispatch(request, response)

  override def doPut(request: HSReq, response: HSResp) = dispatch(request, response)

  override def doDelete(request: HSReq, response: HSResp) = dispatch(request, response)

  override def doOptions(request: HSReq, response: HSResp) = dispatch(request, response)
}
