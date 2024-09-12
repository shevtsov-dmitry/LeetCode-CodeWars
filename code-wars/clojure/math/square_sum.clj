(ns code-wars.clojure.math.square-sum)

(defn square-sum [lst] (reduce + (map (fn [n] (* n n)) lst)))

