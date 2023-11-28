(ns code-wars.clojure.common.SumOfPositive)


(defn positive-sum [xs]
  (reduce
     + (filter
         #(> % 0)
         xs))
  )
(print (positive-sum [1, -2, 3, -4]))

;



; You get an array of numbers, return the sum of all of the positives ones.
;
;Example [1,-4,7,12] => 1 + 7 + 12 = 20
;
;Note: if there is nothing to sum, the sum is default to 0.