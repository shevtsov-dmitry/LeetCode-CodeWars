(ns code-wars.clojure.common.grasshopper-summation)

(defn summation [n]
  (reduce + (range 1 (+ n 1))))

(print (summation 8))