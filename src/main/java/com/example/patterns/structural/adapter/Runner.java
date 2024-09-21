package com.example.patterns.structural.adapter;

public class Runner {
	public static void main(String[] args) {
		// Round fits round, no surprise.
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		if (hole.fits(rpeg)) {
			System.out.println("Round peg (radius = 5) fits round hole (radius = 5).");
		}

		SquarePeg smallSqPeg = new SquarePeg(2);
		SquarePeg largeSqPeg = new SquarePeg(20);
		// hole.fits(smallSqPeg); // Won't compile.

		// Adapter solves the problem.
		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
		SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
		if (hole.fits(smallSqPegAdapter)) {
			System.out.println("Square peg (width = 2) fits round hole (radius = 5).");
		}
		if (!hole.fits(largeSqPegAdapter)) {
			System.out.println("Square peg (width = 20) does not fit into round hole (radius = 5).");
		}
	}
}
