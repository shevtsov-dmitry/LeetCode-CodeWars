(ns code-wars.clojure.common.determine-sex)

(def daughter "Congratulations! You're going to have a daughter.")
(def son "Congratulations! You're going to have a son.")

(defn chromosome-check [sperm]
  (if (clojure.string/includes? sperm "Y")
    son
    daughter))

(print (chromosome-check "XY"))