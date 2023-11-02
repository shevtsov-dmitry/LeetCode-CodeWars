(ns code-wars.clojure.math.find-average)

;Write a function that returns the average of a set of numbers.
;Be sure to return longs. We don't want to return Clojure Ratios!
(defn find-average
  [numbers]
  (if (empty? numbers)
    0
    (/ (reduce + numbers)
       (count numbers))))
(defn find-average
  [numbers]
  (if (empty? numbers)
    0
    (let [result
          (/ (reduce + numbers)
             (count numbers))]
      (if (ratio? result)
        (double result)
        result))))

(def numbers [1, 2, 3, 4])
(println
  (type (find-average numbers)))
(println
  (find-average numbers))
