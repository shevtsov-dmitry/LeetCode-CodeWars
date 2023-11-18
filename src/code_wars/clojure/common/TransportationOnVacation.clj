(ns code-wars.clojure.common.TransportationOnVacation)

(defn rental-car-cost [d]
      (let [cost 40
            total-cost (* d cost)]
           (cond
             (> d 3) (- total-cost 20)
             (>= d 7) (- total-cost 50)
             :else total-cost)))