package cn.edu.gzmu.controller;

import cn.edu.gzmu.model.entity.LogicClass;
import cn.edu.gzmu.service.LogicClassService;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LogicClass Controller
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-24 14:18:22
 */
@RepositoryRestController
@RequestMapping("/logicClass/search")
public class LogicClassController extends BaseController<LogicClass, LogicClassService, Long> {

}
