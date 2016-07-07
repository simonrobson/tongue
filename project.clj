(defproject tongue "0.1.1"
  :description  "DIY i18n library for Clojure/Script"
  :url          "https://github.com/tonsky/tongue"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.8.0" :scope "provided"]
    [clojure-future-spec "1.9.0-alpha9-1"]
  ]
  :profiles {
    :test {
      :jvm-opts ["-Dclojure.spec.check-asserts=true"]
  }})
  
