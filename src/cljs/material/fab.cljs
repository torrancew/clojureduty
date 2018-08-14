(ns material.fab
  (:require [hoplon.core   :as hl
                           :refer        [button span]
                           :refer-macros [defelem]]
            [material.util :refer        [assoc-class]]))

(defelem fab
  [attributes children]
  (button (assoc-class attributes "mdc-fab")
          (span (assoc-class {} ["material-icons" "mdc-fab__icon"])
                children)))
