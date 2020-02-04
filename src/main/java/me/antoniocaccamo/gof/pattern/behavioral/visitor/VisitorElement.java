package me.antoniocaccamo.gof.pattern.behavioral.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author antoniocaccamo on 04/02/2020
 */
@Slf4j
public class VisitorElement implements Visitor {

    private int json = 0;
    private int xml  = 0;

    @Override
    public void visit(ElementJson json) {
      log.info("visiting element {} with uuid {}", json.getClass().getSimpleName(), json.getUuid());
      this.json++;
    }

    @Override
    public void visit(ElementXML xml) {
        log.info("visiting element {} with uuid {}", xml.getClass().getSimpleName(), xml.getUuid());
        this.xml++;
    }

    @Override
    public void end() {
        log.info("visited {} xml  elements", xml);
        log.info("visited {} json elements", json);
    }


}
