# DMFactorySASMacro
# Guidelines & Usage Instructions for the IR GitHub Organisation

#### Table Of Contents

[Security Statement](#security-statement)
  * [BYOD](#byod)

[Styleguides](#styleguides)
  * [Secure Coding](#secure-coding)
  * [Git Commit Messages](#git-commit-messages)


## Security Statement

These repositories, their content and everyone participating in it is governed by the [IR Information Security policies](http://intranet.ird.govt.nz/enterprise-ict-security/). Before contributing, please ensure you have read and undestood these IR security guidelines and that you will report any unacceptable behavior to [information.security@ird.govt.nz](information.security@ird.govt.nz)

## BYOD

### Use of Bring Your Own Device (BYOD) to access IR repositories
While you are allowed to access and contribute to IR GitHub repositories using a BYOD, inline with IR polices "You must not store IR information on non-IR devices". This means you are specifically not allowed to store or download/clone/pull content from an IR repository to your BYOD. 

For further information please see the specific link: [BYOD](http://intranet.ird.govt.nz/enterprise-ict-security/byod)

## Styleguides

### Secure Coding
When authoring or contributing to code repositories within the IR GitHub Organisation please ensure you have read and where appropriate adhered to the following [Secure Coding Standard](https://confluence.ird.govt.nz/display/CS/Secure+Coding+Security+Configuration+Standard)

### Commit Messages
* Use the present tense ("Add feature" not "Added feature")
* Use the imperative mood ("Move cursor to..." not "Moves cursor to...")
* 1st line . 50 chars, present imperative, no final stop.
    . Fixing incorrect UTF16-LE padding, as we are all slaves to !@# MS Excel.
    . Fix incorrect UTF16-LE padding
* Reference issues and pull requests liberally after the first line
* When only changing documentation, include `[ci skip]` in the commit title
* Consider starting the commit message with an applicable emoji:
    * :art: `:art:` when improving the format/structure of the code
    * :racehorse: `:racehorse:` when improving performance
    * :non-potable_water: `:non-potable_water:` when plugging memory leaks
    * :memo: `:memo:` when writing docs
    * :penguin: `:penguin:` when fixing something on Linux
    * :apple: `:apple:` when fixing something on macOS
    * :checkered_flag: `:checkered_flag:` when fixing something on Windows
    * :bug: `:bug:` when fixing a bug
    * :fire: `:fire:` when removing code or files
    * :green_heart: `:green_heart:` when fixing the CI build
    * :white_check_mark: `:white_check_mark:` when adding tests
    * :lock: `:lock:` when dealing with security
    * :arrow_up: `:arrow_up:` when upgrading dependencies
    * :arrow_down: `:arrow_down:` when downgrading dependencies
    * :shirt: `:shirt:` when removing linter warnings

## Branching Strategy

It is recommend to not commit to the "master", rather changes should be made to a "feature"/"development" branch/es and then merged via a pull request once peer reviewed.

The following branching model, called [Git Flow](https://gitversion.readthedocs.io/en/latest/git-branching-strategies/gitflow-examples/), is a good place to start. Note the below

<a id="git-flow-image"/>

![git-flow](https://nvie.com/img/git-model@2x.png)
