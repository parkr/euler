; Project Euler, Question 1
;
; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000.
;
; https://projecteuler.net/problem=1
;
; Code written by Parker Moore (@parkr)

(defn multiple-of [base]
  (fn [number]
    (= (mod number base) 0)))

(def multiple-of-three
  (multiple-of 3))

(def multiple-of-five
   (multiple-of 5))

(defn multiple? [number]
  (or (multiple-of-five number) (multiple-of-three number)))

(reduce + (filter multiple? (range 100)))
