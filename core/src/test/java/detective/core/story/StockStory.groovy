package detective.core.story

import static detective.core.Detective.*;
import static detective.core.Matchers.*;

import detective.core.TestTaskFactory;


story() "Story in script" {
  inOrderTo "keep track of stock"
  asa "store owner"
  iwantto "add items back to stock when they're returned"
  sothat "..."
  
  scenario_refund "Refunded items should be returned to stock" {
    
    scenarioTable {
      sweater.black | sweater.refund.black  | expect.sweater.balck
      3             | 1                     | 4
      1             | 10                    | 11
      100           | 50                    | 150
    }
  
    given "a list of black sweaters left in stock and customer returns the sweaters for a refund" {
      sweater.blue = 0
      runtask TestTaskFactory.stockManagerTask()
    }
    
    then "I should have expcected black sweaters in stock"{
      sweater.black << equalTo(expect.sweater.balck)
      println "check passed for sweater.black with value ${sweater.black}" 
    }
  }
}

