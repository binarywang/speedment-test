package com.binarywang.test;

import java.util.Comparator;
import java.util.LongSummaryStatistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binarywang.test.test.test.order_info.OrderInfoManager;
import com.binarywang.test.test.test.order_info.generated.GeneratedOrderInfo;

/**
 * <pre>
 *
 * Created by Binary Wang on 2018/11/30.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@RestController
public class Controller {
  private TestApplication application;

  @Autowired
  public Controller(TestApplication application) {
    this.application = application;
  }

  @GetMapping("/")
  public LongSummaryStatistics get() {
    final OrderInfoManager orderInfoManager = this.application.getOrThrow(OrderInfoManager.class);
    return orderInfoManager.stream()
        .filter(a -> a.getId() > 2)
        .sorted(Comparator.comparing(GeneratedOrderInfo::getProductName))
        .mapToLong(a->a.getId())
        .summaryStatistics();
  }
}
