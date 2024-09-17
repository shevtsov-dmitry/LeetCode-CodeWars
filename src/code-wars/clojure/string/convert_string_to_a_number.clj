(ns code-wars.clojure.string.convert-string-to-a-number)

;"1405" --> 1405
;"-7" --> -7
(defn string-to-number [str]
   (read-string str))

(string-to-number "123")
