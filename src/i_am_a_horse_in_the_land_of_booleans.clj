(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
      "true"
      "false"))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    (* 1 x)))

(defn divides? [divisor n]
  (if (= (mod divisor n) 0)
      "true"
      "false"))

(defn fizzbuzz [n]
  (cond
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    (= (mod n 15) 0) "gotcha"
    :else ""))

(defn teen? [age]
  (if (< 12 age 20)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
 (cond
   (empty? x) "nil"
   (number? x) (* x 2)
   (vector? x) (* 2 (count x))
   (list? x) (* 2 (count x))
    :else "true"))

(defn leap-year? [year]
  (if
    (or (and (= (mod year 4) 0) (= (mod year 100) 1)) (and  (= (mod year 4) 0) (= (mod year 100) 0) (= (mod year 400) 0)))
    "true"
    "false"))

; '_______'
