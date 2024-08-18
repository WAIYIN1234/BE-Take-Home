# Algorithm Approach

---
## 1. Identify Key Sections
There are 3 key sections identified in the Financial Projections Example. These sections refer to important aspects to consider in business decisions and we will extract the values as the basis for assumptions.
1. Total Sales
2. Total Operating Expenses
3. Net Income

## 2. Read the Data
After defining the key sections to be included in the algorithm, the next steps is to read the data. The projection data is scoped in a monthly basis, therefore our assumptions is going to do on the same manner for each section. We are going to read and parse the data in each column rows. For example:

    Month: Jul 2024
    Product Sales: 80000
    Service Sales: 20000
    Total Sales: 100000
    Cost of Goods Sold: 60000
    Marketing: 5000
    Staff Salaries: 20000
    Total Operating Expenses: 85000
    Net Income: 15000
	--------------------------------
	Month: Aug 2024
	Product Sales: 83200
	Service Sales: 21000 
	Total Sales: 104200
	Cost of Goods Sold: 62400
	Marketing: 5000
	Staff Salaries: 20840
	Total Operating Expenses: 88240
	Net Income: 15960
	--------------------------------
	.....
## 3. Calculate
### Growth Percentage
Next, we are going to come up with the growth by comparing each number with previous month. For the balance of ease of readability and accuracy, decimals are designed to keep 3 digits. For example:

    Month: Jul 2024
    Product Sales: 80000.000 			0.000%
    Service Sales: 20000.000 			0.000%
    Total Sales: 100000.000 			0.000%
    Cost of Goods Sold: 60000.000 			0.000%
    Marketing: 5000.000 				0.000%
    Staff Salaries: 20000.000 			0.000%
    Total Operating Expenses: 85000.000 		0.000%
    Net Income: 15000.000 				0.000%
    --------------------------------
    Month: Aug 2024
    Product Sales: 83200.000 			4.000%
    Service Sales: 21000.000 			5.000%
    Total Sales: 104200.000 			4.200%
    Cost of Goods Sold: 62400.000 			4.000%
    Marketing: 5000.000 				0.000%
    Staff Salaries: 20840.000 			4.200%
    Total Operating Expenses: 88240.000 		3.812%
    Net Income: 15960.000 				6.400%
    --------------------------------
    .....
### Minimum, Maximum and Average
The growth data for each month will be used for further calculation and assumption. For example, the minimum, maximum, average and total growth percentage between consecutive months. For example:

    {
        "growthRate": {
            "minimum": {
                "months": ["August 2024"],
                "rate": 4.2
            },
            "maximum": {
                "months": ["July 2025"],
                "rate": 4.217
            },
            "average": 4.209,
            "total": 64.0,
        }
        ...
    }

## Summarise the Result
After collection all the required numbers, we can summarise and export them to represent the key insights. E.g.

`Total Sales grow by 64% in 12 months, 4.209% in average. Greatest at 4.217% in Jul 2025, Least at 4.2% in Aug 2024`

`Total Operating Expenses grow by 63.367% in 12 months, 4.183% in average. Greatest at 8.557% in Feb 2025, Least at 3.702% in Mar 2024`

`Net Income grow by 67.585% in 12 months, 4.639% in average. Greatest at 7.523% in Mar 2025, Least at -17.33% in Feb 2025`

#### Part of details are as below:

    {
        "numberOfMonths": 12,
        "totalSales": {
            "initialValue": 100000.0,
            "finalProjectedValue": 163999.7,
            "growthRate": {
                "minimum": {
                    "months": ["Aug 2024"],
                    "rate": 4.2,
                },
                "maximum": {
                    "months": ["Jul 2025"],
                    "rate": 4.217
                },
                "average": 4.209,
                "total": 64.0,
            }

            .....
        },


        "totalOperatingExpenses": {
            "initialValue": 85000.0,
            "finalProjectedValue": 138861.87,
            "growthRate": {
                "minimum": {
                    "months": ["Mar 2025"],
                    "rate": 3.702
                },
                "maximum": {
                    "months": ["Feb 2025"],
                    "rate": 8.557
                },
                "average": 4.183,
                "total": 63.367
            }

            .....
        },

        "netIncome": {
            "initialValue": 15000.0,
            "finalProjectedValue": 25137.79,
            "growthRate": {
                "minimum": {
                    "months": ["Feb 2025"],
                    "rate": -17.33
                },
                "maximum": {
                    "months": ["Mar 2025"],
                    "rate": 7.523
                },
                "average": 4.639,
                "total": 67.585
            }
        }
    }

# Note

---
- There is a JSON file named example.json for your reference, containing more detailed breakdown with numbers under key sections for the algorithm
- Some simple Java model classes for example.json are included in the project for your reference.
