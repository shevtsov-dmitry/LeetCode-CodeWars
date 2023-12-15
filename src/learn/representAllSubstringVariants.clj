(ns learn.representAllSubstringVariants)

(def prime-arr [1, 2, 3, 4])

;(defn iterate-over [arr]
;  when)

(loop [i 0]
  (when (< i 10)
    #(print (recur (inc i)))
    ))