package cn.edu.gzmu.controller;

import cn.edu.gzmu.model.entity.PaperDetail;
import cn.edu.gzmu.service.PaperDetailService;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * PaperDetail Controller
 *
 * @author echo
 * @version 1.0
 * @date 2019-5-24 14:18:22
 */
@RepositoryRestController
@RequestMapping("/paperDetail/search")
public class PaperDetailController extends BaseController<PaperDetail, PaperDetailService, Long> {

}
