package com.sc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 版本更新用
 * Created by valora on 2017/7/25.
 */
@RestController
public class VersionController {
    @RequestMapping(value = "/phone", method = RequestMethod.GET)
    public Map phone() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/phone1", method = RequestMethod.GET)
    public Map phone1() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/phone2", method = RequestMethod.GET)
    public Map phone2() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/phone3", method = RequestMethod.GET)
    public Map phone3() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/phone4", method = RequestMethod.GET)
    public Map phone4() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 0);
        return result;
    }

    @RequestMapping(value = "/android0", method = RequestMethod.GET)
    public Map android() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 0);
        return result;
    }

    @RequestMapping(value = "/android1", method = RequestMethod.GET)
    public Map android1() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/pad", method = RequestMethod.GET)
    public Map pad() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/pad1", method = RequestMethod.GET)
    public Map pad1() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/pad2", method = RequestMethod.GET)
    public Map pad2() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 0);
        return result;
    }
}
