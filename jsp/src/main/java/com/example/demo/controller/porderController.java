package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.porderMapper;
import com.example.demo.vo.member;
import com.example.demo.vo.porder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("porder")
public class porderController {
	@Autowired
	private porderMapper pm;
	@Autowired
	private HttpSession session;

	@RequestMapping("porder")
	public String gotoPorder() {
		
		return "/porder/porder";
	}

	@RequestMapping("confirm")
	public String gotoConfirm(String deskno, String memberno, Date ordertime, String number, String phone) {
		member m = (member) session.getAttribute("M");
		porder p = new porder(deskno, m.getMemberno(), ordertime, number, phone);
		session.setAttribute("P", p);
		return "/porder/confirm";
	}

	@RequestMapping("finish")
	public String gotoFinish() {
		porder p = (porder) session.getAttribute("P");
		pm.add(p);

		return "/porder/finish";
	}

	@RequestMapping("logout")
	public String gotoLogout() {
		session.removeAttribute("M");
		session.removeAttribute("P");
		return "/logout";
	}

	@RequestMapping("query")
	public String query(HttpServletRequest request) {
		member m = (member) session.getAttribute("M");
		List<porder> p2 = pm.queryByMemberno(m.getMemberno());
		session.setAttribute("porders2", p2);
		for (porder porder2 : p2) {

		}
		return "/porder/query";
	}

	@RequestMapping(value = "gotoUpdate2", method = RequestMethod.GET)
	public String gotoupdate2(@RequestParam("porderId") Integer porderId,
            @RequestParam("ordertime") @DateTimeFormat(pattern = "yyyy-MM-dd") java.util.Date ordertime,
            @RequestParam("number") String number,
            @RequestParam("phone") String phone)
	{
		porder p = pm.getPorderById(porderId);
		session.setAttribute("U", p);
		return "/employee/manager/porder/update";
	}

	@PostMapping("update2")
    public String update2(
            @RequestParam("ordertime") @DateTimeFormat(pattern = "yyyy-MM-dd") java.util.Date ordertime,
            @RequestParam("number") String number, @RequestParam("phone") String phone) {
        
        // 从会话中获取原始订位信息
        porder p = (porder) session.getAttribute("U");

        // 检查订位信息是否存在
       
            // 更新订位信息的属性
            p.setOrdertime(new Date(ordertime.getTime()));
            p.setNumber(number);
            p.setPhone(phone);
        
            pm.updatePorder(p);
            session.setAttribute("U2", p);
            // 调用 porderMapper 更新订位信息
            session.removeAttribute("U");


            // 返回到一个成功更新的页面或者重定向到其他页面
            return "/employee/manager/porder/updateSuccess";
        
    }
	
	@RequestMapping(value = "gotoDelete2", method = RequestMethod.GET)
	public String gotoDelete2(@RequestParam("porderId") Integer porderId
            )
	{
		porder p = pm.getPorderById(porderId);
		session.setAttribute("D", p);
		return "/employee/manager/porder/delete";
	}

	@PostMapping("delete2")
    public String delete2(
    		@RequestParam("porderId") Integer porderId) {
        
        // 从会话中获取原始订位信息
        porder p = (porder) session.getAttribute("D");
        System.out.println(porderId);
        // 检查订位信息是否存在

            pm.deleteById(porderId);
            // 调用 porderMapper 更新订位信息
            // 返回到一个成功更新的页面或者重定向到其他页面
            return "/employee/manager/porder/deleteSuccess";
        
    }
	
	@RequestMapping(value = "gotoUpdate", method = RequestMethod.GET)
	public String gotoupdate(@RequestParam("porderId") Integer porderId,
            @RequestParam("ordertime") @DateTimeFormat(pattern = "yyyy-MM-dd") java.util.Date ordertime,
            @RequestParam("number") String number,
            @RequestParam("phone") String phone)
	{
		porder p = pm.getPorderById(porderId);
		session.setAttribute("U", p);
		return "/porder/update";
	}

	@PostMapping("update")
    public String update(
            @RequestParam("ordertime") @DateTimeFormat(pattern = "yyyy-MM-dd") java.util.Date ordertime,
            @RequestParam("number") String number, @RequestParam("phone") String phone) {
        
        // 从会话中获取原始订位信息
        porder p = (porder) session.getAttribute("U");

        // 检查订位信息是否存在
       
            // 更新订位信息的属性
            p.setOrdertime(new Date(ordertime.getTime()));
            p.setNumber(number);
            p.setPhone(phone);
        
            pm.updatePorder(p);;
            session.setAttribute("U2", p);
            // 调用 porderMapper 更新订位信息
            session.removeAttribute("U");


            // 返回到一个成功更新的页面或者重定向到其他页面
            return "/porder/updateSuccess";
        
    }
	
	@RequestMapping(value = "gotoDelete", method = RequestMethod.GET)
	public String gotoDelete(@RequestParam("porderId") Integer porderId
            )
	{
		porder p = pm.getPorderById(porderId);
		session.setAttribute("D", p);
		return "/porder/delete";
	}

	@PostMapping("delete")
    public String delete(
    		@RequestParam("porderId") Integer porderId) {
        
        // 从会话中获取原始订位信息
        porder p = (porder) session.getAttribute("D");
        System.out.println(porderId);
        // 检查订位信息是否存在

            pm.deleteById(porderId);
            // 调用 porderMapper 更新订位信息
            // 返回到一个成功更新的页面或者重定向到其他页面
            return "porder/deleteSuccess";
        
    }
	
	@RequestMapping("manager")
	public String gotoManager() {
		return "/employee/manager/porder/manager";
	}

	@RequestMapping("confirm2")
	public String ManagerConfirm(String deskno, String memberno, Date ordertime, String number, String phone) {
		porder p = new porder(deskno, memberno, ordertime, number, phone);
		session.setAttribute("P", p);
		return "/employee/manager/porder/confirm";
	}

	@RequestMapping("porder2")
	public String ManagerPorder() {
		return "/employee/manager/porder/porder";
	}

	@RequestMapping("finish2")
	public String ManagerFinish() {
		porder p = (porder) session.getAttribute("P");
		pm.add(p);

		return "/employee/manager/porder/finish";
	}

	@RequestMapping("viewAll")
	public String ManagerViewAll(HttpServletRequest request) {
		List<porder> p = pm.queryAll();
		session.setAttribute("porders", p);
		for (porder porder : p) {

		}
		return "employee/manager/porder/queryAll";
	}

}
