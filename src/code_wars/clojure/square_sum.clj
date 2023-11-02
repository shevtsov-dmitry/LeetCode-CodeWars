(ns code-wars.clojure.square-sum)

(defn square-sum [lst] (reduce + (map (fn [n] (* n n)) lst)))

