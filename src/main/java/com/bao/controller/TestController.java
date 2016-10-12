package com.bao.controller;

import com.bao.action.DemoAction;
import com.bao.action.ThroneAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by baochunyu on 2016/6/23.
 */
@RestController
public class TestController {

    @Autowired
    private DemoAction demoAction;

    @Autowired
    private ThroneAction throneAction;

    /**
     * @api {get} /user/:id Request User information
     * @apiName GetUser
     * @apiGroup User
     *
     * @apiParam {Number} id Users unique ID.
     *
     * @apiSuccess {String} firstname Firstname of the User.
     * @apiSuccess {String} lastname  Lastname of the User.
     *
     * @apiSuccessExample Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "firstname": "John",
     *       "lastname": "Doe"
     *     }
     *
     * @apiError UserNotFound The id of the User was not found.
     *
     * @apiErrorExample Error-Response:
     *     HTTP/1.1 404 Not Found
     *     {
     *       "error": "UserNotFound"
     *     }
     */
    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println(demoAction.action());
        System.out.println(throneAction.action());
        return demoAction.action();
    }


}
